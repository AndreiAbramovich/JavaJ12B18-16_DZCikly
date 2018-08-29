package ua.step.homework_1.test;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ua.step.homework_1.Task11;


public class TaskTest11 {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}

	@Test
	public void test() {
		Task11.main(null);
		String errorMessage = "Wrong result";
		assertTrue(errorMessage ,  outContent.toString().trim().startsWith("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 hiss 16 17 fizz 19 buzz fizz 22 23 fizz buzz 26 fizz 28 29 hiss 31 32 fizz 34 buzz fizz 37 38 fizz buzz 41 fizz 43 44 hiss 46 47 fizz 49 buzz fizz 52 53 fizz buzz 56 fizz 58 59 hiss 61 62 fizz 64 buzz fizz 67 68 fizz buzz 71 fizz 73 74 hiss 76 77 fizz 79 buzz fizz 82 83 fizz buzz 86 fizz 88 89 hiss 91 92 fizz 94 buzz fizz 97 98 fizz buzz "));
	}
}
