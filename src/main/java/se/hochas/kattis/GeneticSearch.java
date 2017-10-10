package se.hochas.kattis;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class GeneticSearch {
	 private static HashSet<String> usedModifications = new HashSet<>();

	    public static void main(final String[] args) {
	        Kattio io = new Kattio(System.in, System.out);

	        while (io.hasMoreTokens()) {
	            if ("0".equals(io.peekToken())) {
	                break;
	            }
	            usedModifications = new HashSet<>();

	            String s = io.getWord();
	            String l = io.getWord();

	            findUnchangedOccurences(s, l);
	            System.out.print(" ");
	            findOccurencesWithOneDeletedCharacter(s, l);
	            System.out.print(" ");
	            findOccurencesWithOneAddedCharacter(s, l);
	            System.out.println();
	        }
	    }

	    private static void findOccurencesWithOneAddedCharacter(final String s, final String l) {
	        int totalOccurences = 0;
	        String[] availableCharacters = { "A", "C", "G", "T" };
	        for (int i = 0; i < availableCharacters.length; i++) {
	            String charToAdd = availableCharacters[i];
	            for (int k = 0; k <= s.length(); k++) {
	                String testString = s.substring(0, k) + charToAdd + s.substring(k);
	                if (usedModifications.add(testString)) {
	                    totalOccurences += countOccurences(testString, l);
	                }
	            }
	        }
	        System.out.print(totalOccurences);
	    }

	    private static void findOccurencesWithOneDeletedCharacter(final String s, final String l) {
	        int totalOccurences = 0;
	        for (int i = 0; i < s.length(); i++) {
	            String testString = s.substring(0 , i) + s.substring(i + 1);
	            if (usedModifications.add(testString)) {
	                totalOccurences += countOccurences(testString, l);
	            }
	        }
	        System.out.print(totalOccurences);
	    }

	    private static void findUnchangedOccurences(final String s, final String l) {
	        System.out.print(countOccurences(s, l));
	    }

	    private static int countOccurences(final String s, final String l) {
	        int count = 0;
	        int index = l.indexOf(s);
	        while (index != -1) {
	            count++;
	            index = l.indexOf(s, index + 1);
	        }

	        return count;
	    }

	    private static class Kattio extends PrintWriter {
	        public Kattio(final InputStream i) {
	            super(new BufferedOutputStream(System.out));
	            r = new BufferedReader(new InputStreamReader(i));
	        }

	        public Kattio(final InputStream i, final OutputStream o) {
	            super(new BufferedOutputStream(o));
	            r = new BufferedReader(new InputStreamReader(i));
	        }

	        public boolean hasMoreTokens() {
	            return peekToken() != null;
	        }

	        public int getInt() {
	            return Integer.parseInt(nextToken());
	        }

	        public double getDouble() {
	            return Double.parseDouble(nextToken());
	        }

	        public long getLong() {
	            return Long.parseLong(nextToken());
	        }

	        public String getWord() {
	            return nextToken();
	        }

	        private BufferedReader r;
	        private String line;
	        private StringTokenizer st;
	        private String token;

	        private String peekToken() {
	            if (token == null)
	                try {
	                    while (st == null || !st.hasMoreTokens()) {
	                        line = r.readLine();
	                        if (line == null)
	                            return null;
	                        st = new StringTokenizer(line);
	                    }
	                    token = st.nextToken();
	                } catch (IOException e) {
	                }
	            return token;
	        }

	        private String nextToken() {
	            String ans = peekToken();
	            token = null;
	            return ans;
	        }
	    }

}
