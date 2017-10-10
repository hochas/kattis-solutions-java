package se.hochas.kattis;

import java.util.Scanner;

public class ADifferentProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long a = sc.nextLong(), b = sc.nextLong();
            // solve test case and output answer
            long result = a - b;
            System.out.println(result > 0 ? result : result * -1);
        }

    }
}
