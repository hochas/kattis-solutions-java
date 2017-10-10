package se.hochas.kattis;

import java.util.Scanner;

public class Splat {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            sc.nextLine();

            String[][] cd = new String[n][];
            for (int j = 0; j < n; j++) {
                String[] l = sc.nextLine().split(" ");
                double volume = Double.parseDouble(l[2].replace(',', '.'));
                double radius = Math.sqrt(volume / Math.PI);

                cd[j] = new String[] { l[0], l[1], Double.toString(radius), l[3] };
            }

            int m = sc.nextInt();
            sc.nextLine();

            for (int k = 0; k < m; k++) {
                String[] coordinate = sc.nextLine().split(" ");
                String color = "white";
                for (int v = cd.length - 1; v >= 0; v--) {
                    if (coordinateIsWithinCircle(cd[v], coordinate)) {
                        color = cd[v][3];
                        break;
                    }
                }

                System.out.println(color);
            }
        }
    }

    private static boolean coordinateIsWithinCircle(final String[] props, final String[] coordinate) {
        double x = Double.parseDouble(coordinate[0].replace(',', '.'));
        double y = Double.parseDouble(coordinate[1].replace(',', '.'));

        double centerX = Double.parseDouble(props[0].replace(',', '.'));
        double centerY = Double.parseDouble(props[1].replace(',', '.'));
        double radius = Double.parseDouble(props[2].replace(',', '.'));

        double a = Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2);
        double b = Math.pow(radius, 2);
        if (a < b) {
            return true;
        }
        return false;
    }
}
