package se.hochas.kattis;

import java.util.Scanner;

public class Chess {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();

        while (sc.hasNextLine()) {
            String[] pos = sc.nextLine().split(" ");
            int[] startPos = { toInt(pos[0]), Integer.valueOf(pos[1]) };
            int[] endPos = { toInt(pos[2]), Integer.valueOf(pos[3]) };

            // We are already on the tile
            if (isStartEndEqual(startPos, endPos)) {
                System.out.println("0 " + toPos(startPos));
                continue;
            }
            // Just go straight to the tile, we are on a line
            if (deltasEqual(startPos, endPos)) {
                System.out.println("1 " + toPos(startPos) + " " + toPos(endPos));
                continue;
            }

            // If no other case, try to move by interim move
            int[] interimMove = calculateInterimMove(startPos, endPos);
            if (interimMove == null) {
                System.out.println("Impossible");
            } else {
                System.out.println("2 " + toPos(startPos) + " " + toPos(interimMove) + " " + toPos(endPos));
            }
        }
    }

    private static String toPos(final int[] pos) {
        return toChar(pos[0]) + " " + pos[1];
    }

    private static int[] calculateInterimMove(final int[] startPos, final int[] endPos) {
        for (int x = 1; x <= 8; x++) {
            for (int y = 1; y <= 8; y++) {
                int[] pos = { x, y };
                if (deltasEqual(pos, endPos) && deltasEqual(startPos, pos)) {
                    return pos;
                }
            }
        }
        return null;
    }

    private static boolean isStartEndEqual(final int[] startPos, final int[] endPos) {
        return startPos[0] == endPos[0] && startPos[1] == endPos[1];
    }

    private static boolean deltasEqual(final int[] startPos, final int[] endPos) {
        return Math.abs(startPos[0] - endPos[0]) == Math.abs(startPos[1] - endPos[1]);
    }

    private static int toInt(final String string) {
        return (string.toUpperCase().charAt(0) - 64);
    }

    private static String toChar(final int i) {
        return Character.toString((char) (i + 64));
    }

}
