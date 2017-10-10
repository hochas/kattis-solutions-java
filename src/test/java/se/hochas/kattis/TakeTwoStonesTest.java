package se.hochas.kattis;

import org.junit.After;
import org.junit.Test;

import se.hochas.kattis.util.UserInput;

public class TakeTwoStonesTest {
	
	@After
	public void resetSystemIn() {
		System.setIn(System.in);
	}

	@Test
	public void shouldReturnBobWhenEeven() {
		UserInput.simulate("2");
		TakeTwoStones.main(null);
	}
	
}
