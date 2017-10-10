package se.hochas.kattis;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] mods = new int[10];

        for (int i = 0; i < 10; i++) {
            int k = sc.nextInt();
            mods[i] = k % 42;
        }

        List<Integer> distinct = Arrays.stream(mods)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
        System.out.println(distinct.size());
    }
}
