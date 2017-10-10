package se.hochas.kattis;

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leader = Integer.MIN_VALUE;
        int contestant = 0;

        for (int i = 1; i <= 5; i++) {
            // System.out.println("Calculating score for contestant " + i);
            int currentScore = 0;
            for (int k = 0; k < 4; k++) {
                currentScore += sc.nextInt();
                // System.out.println("Contestant " + i + " current score: " + currentScore);
            }
            if (currentScore > leader) {
                // System.out.println("Contest " + i + " is the new leader with a score of " + currentScore);
                leader = currentScore;
                contestant = i;
            }

            // System.out.println();
        }

        System.out.println(contestant + " " + leader);
    }

}
