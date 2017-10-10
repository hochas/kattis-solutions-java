package se.hochas.kattis;

import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        int answer = 0;

        for (int x = 0; x < i; x = x + 1) {
            String input = sc.next(); // 1253
            answer += Math.pow(Integer.valueOf(input.substring(0, input.length() - 1)), Integer.valueOf(String.valueOf(input.charAt(input.length() - 1))));
        }
        System.out.println(answer);
    }
}
