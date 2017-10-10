package se.hochas.kattis.util;

import java.io.ByteArrayInputStream;

public class UserInput {
	
	public static void simulate(final String input) {
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
	}
}
