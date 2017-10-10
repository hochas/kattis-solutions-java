package se.hochas.kattis;

import java.util.Scanner;

public class SimonSays {
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String l = sc.nextLine();
			if (l.startsWith("Simon says ")) {
				System.out.println(l.replaceAll("Simon says ", ""));
			}
		}
	}
}
