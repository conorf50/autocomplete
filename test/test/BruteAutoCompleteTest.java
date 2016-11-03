package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import cfarrell.BruteAutoComplete;

public class BruteAutoCompleteTest {

	@Test
	public void testGetWeight() throws FileNotFoundException {
		BruteAutoComplete brute = new BruteAutoComplete();
		brute.loadFromFile();
		assertEquals(51756400,brute.weightOf("house"),0.1);

	}
	
	public void testGetOtherMethod() {
		fail("Not yet implemented");
	}

}
