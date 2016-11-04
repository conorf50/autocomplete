package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import cfarrell.BruteAutoComplete;
import cfarrell.Main;
import cfarrell.QuickAutoComplete;

public class QuickAutoCompleteTest {

	@Test
	public void testSetURL() throws FileNotFoundException {
		QuickAutoComplete quick = new QuickAutoComplete();
		BruteAutoComplete brute = new BruteAutoComplete(); //only needed to load in the initial file
		Main.loadFromFile();
		assertEquals(51756400,quick.weightOf("house"),0.1);
		assertNotEquals(23456,quick.weightOf("f"), 0.2);
	}

	@Test
	public void testWeightOf() {
		fail("Not yet implemented");
	}

	@Test
	public void testBestMatch() {
		fail("Not yet implemented");
	}

	@Test
	public void testMatches() {
		fail("Not yet implemented");
	}

}
