package se.hochas.kattis;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RockPaperScissorsTournament {
	   private static DecimalFormat numberFormat = new DecimalFormat("0.000");

	    public static void main(final String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while (sc.hasNext()) {
	            Map<Integer, int[]> stats = new HashMap<Integer, int[]>();
	            int players = sc.nextInt();
	            if (players == 0) {
	                sc.close();
	                break;
	            }
	            int rounds = sc.nextInt();

	            int r = players * rounds * (players - 1) / 2;

	            for (int i = 0; i < r; i++) {
	                int firstPlayer = sc.nextInt();
	                Move firstPlayerMove = Move.valueOf(sc.next().toUpperCase());

	                int secondPlayer = sc.nextInt();
	                Move secondPlayerMove = Move.valueOf(sc.next().toUpperCase());

	                if (!stats.containsKey(firstPlayer)) {
	                    stats.put(firstPlayer, new int[] { 0, 0 });
	                }
	                if (!stats.containsKey(secondPlayer)) {
	                    stats.put(secondPlayer, new int[] { 0, 0 });
	                }

	                int result = firstPlayerMove.compareMoves(secondPlayerMove);
	                if (result == 1) {
	                    increaseWins(stats, firstPlayer);
	                    increaseLosses(stats, secondPlayer);
	                } else if (result == -1) {
	                    increaseWins(stats, secondPlayer);
	                    increaseLosses(stats, firstPlayer);
	                }
	            }


	            for (Entry<Integer, int[]> i : stats.entrySet()) {
	                double wins = i.getValue()[0];
	                double losses = i.getValue()[1];
	                double ratio = wins/(wins+losses);
	                System.out.println(numberFormat.format(ratio).replace(',', '.'));
	            }
	            System.out.println();
	        }
	        sc.close();
	    }

	    private enum Move {
	        ROCK, PAPER, SCISSORS;

	        public int compareMoves(final Move otherMove) {
	            // Tie
	            if (this == otherMove)
	                return 0;

	            switch (this) {
	            case PAPER:
	                return (otherMove == ROCK ? 1 : -1);
	            case ROCK:
	                return (otherMove == SCISSORS ? 1 : -1);
	            case SCISSORS:
	                return (otherMove == PAPER ? 1 : -1);
	            }

	            // Should never reach here
	            return 0;
	        }
	    }

	    private static void increaseLosses(final Map<Integer, int[]> stats, final int secondPlayer) {
	        int[] secondStats = stats.get(secondPlayer);
	        secondStats[1] = secondStats[1] + 1;
	    }

	    private static void increaseWins(final Map<Integer, int[]> stats, final int firstPlayer) {
	        int[] firstStats = stats.get(firstPlayer);
	        firstStats[0] = firstStats[0] + 1;
	    }
}
