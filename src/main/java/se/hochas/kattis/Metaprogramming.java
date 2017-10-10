package se.hochas.kattis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Metaprogramming {

    final static String DEFINE_DELIMITER = "define";
    final static String EVAL_DELIMITER = "eval";

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> valueMap = new HashMap<String, Integer>();

        while (sc.hasNext()) {
            String[] line = sc.nextLine().split(" ");
            String action = line[0];

            if (DEFINE_DELIMITER.equals(action)) {
                addValue(valueMap, line);
            }
            if (EVAL_DELIMITER.equals(action)) {
                Integer leftHand = valueMap.get(line[1]);
                String operator = line[2];
                Integer rightHand = valueMap.get(line[3]);

                compareValues(leftHand, operator, rightHand);
            }
        }
    }

    private static void compareValues(final Integer leftHand, final String operator, final Integer rightHand) {
        if (leftHand == null || rightHand == null) {
            System.out.println("undefined");
        } else {
            if ("=".equals(operator)) {
                System.out.println(leftHand.equals(rightHand));
            } else if (">".equals(operator)) {
                System.out.println(leftHand > rightHand);
            } else if ("<".equals(operator)) {
                System.out.println(leftHand < rightHand);
            }
        }
    }

    private static void addValue(final Map<String, Integer> valueMap, final String[] line) {
        valueMap.put(line[2], Integer.parseInt(line[1]));
    }
}
