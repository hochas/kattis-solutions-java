package se.hochas.kattis;

import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        int answer = 0;

        for (int k = 0; k < i; k++) {
            int temp = sc.nextInt();

            if (temp < 0) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
