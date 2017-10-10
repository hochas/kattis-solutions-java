package se.hochas.kattis;

import java.util.Scanner;

public class ArmyStrengthEasy {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n --> 0) {
            int gArmySize = sc.nextInt();
            int mArmySize = sc.nextInt();

            int gMax = 0;
            for (int k = 0; k < gArmySize; k++) {
                int val = sc.nextInt();
                gMax = val > gMax ? val : gMax;
            }

            int mMax = 0;
            for (int k = 0; k < mArmySize; k++) {
                int val = sc.nextInt();
                mMax = val > mMax ? val : mMax;
             }

            if (gMax >= mMax) {
                System.out.println("Godzilla");
            } else {
                System.out.println("MechaGodzilla");
            }

        }
    }
}
