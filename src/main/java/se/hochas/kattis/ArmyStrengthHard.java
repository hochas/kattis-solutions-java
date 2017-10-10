package se.hochas.kattis;

import java.util.Scanner;

public class ArmyStrengthHard {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n --> 0) {
            int gArmySize = sc.nextInt();
            int mArmySize = sc.nextInt();

            sc.nextLine();
            String[] gArmy = sc.nextLine().split(" ");
            String[] mArmy = sc.nextLine().split(" ");

            int mMax = 0;
            for (String s : mArmy) {
                int val = Integer.parseInt(s);
                mMax = val > mMax ? val : mMax;
            }

            int gMax = 0;
            for (String s : gArmy) {
                int v = Integer.parseInt(s);
                gMax = v > gMax ? v : gMax;
                if (gMax >= mMax) {
                    break;
                }
            }

            if (gMax >= mMax) {
                System.out.println("Godzilla");
            } else {
                System.out.println("MechaGodzilla");
            }

        }
    }
}
