package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import cfarrell.BruteAutoComplete;
import cfarrell.Main;

public class BruteAutoCompleteTest {

	@Test
	public void testGetWeight() throws FileNotFoundException {
		BruteAutoComplete brute = new BruteAutoComplete();
		Main.loadFromFile();
		assertEquals(51756400,brute.weightOf("house"),0.1);
		assertNotEquals(23456,brute.weightOf("feck"), 0.2);
	}
	
	public void testGetOtherMethod() {
		fail("Not yet implemented");
	}

}
