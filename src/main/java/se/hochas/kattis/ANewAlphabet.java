package se.hochas.kattis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ANewAlphabet {
	  public static void main(final String[] args) {
	        Map<String, String> dictionary = new HashMap<String, String>();
	        dictionary.put("a", "@");
	        dictionary.put("b", "8");
	        dictionary.put("c", "(");
	        dictionary.put("d", "|)");
	        dictionary.put("e", "3");
	        dictionary.put("f", "#");
	        dictionary.put("g", "6");
	        dictionary.put("h", "[-]");
	        dictionary.put("i", "|");
	        dictionary.put("j", "_|");
	        dictionary.put("k", "|<");
	        dictionary.put("l", "1");
	        dictionary.put("m", "[]\\/[]");
	        dictionary.put("n", "[]\\[]");
	        dictionary.put("o", "0");
	        dictionary.put("p", "|D");
	        dictionary.put("q", "(,)");
	        dictionary.put("r", "|Z");
	        dictionary.put("s", "$");
	        dictionary.put("t", "']['");
	        dictionary.put("u", "|_|");
	        dictionary.put("v", "\\/");
	        dictionary.put("w", "\\/\\/");
	        dictionary.put("x", "}{");
	        dictionary.put("y", "`/");
	        dictionary.put("z", "2");

	        Scanner sc = new Scanner(System.in);
	        while (sc.hasNextLine()) {
	           String l = sc.nextLine().toLowerCase();

	           String result = "";
	           for (String c : l.split("")) {
	               if (dictionary.containsKey(c)) {
	                   result += dictionary.get(c);
	               } else {
	                   result += c;
	               }
	           }

	           System.out.println(result);
	        }
	    }
}
