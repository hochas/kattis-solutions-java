package se.hochas.kattis;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rOne  = sc.nextInt();
        int ans = sc.nextInt();

        System.out.println(ans * 2 - rOne);
    }
}
