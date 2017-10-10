package se.hochas.kattis;

import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String answer = i % 2 == 0 ? "Bob" : "Alice";
        System.out.println(answer);
    }
}
