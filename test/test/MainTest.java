/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import cfarrell.AutoComplete;
import cfarrell.Main;
import cfarrell.Term;

/**
 * @author Conor
 *
 */
public class MainTest {

	AutoComplete brute; // brute force autocomplete
	AutoComplete quick; // quick autocomplete
	public static String URL = null;    //important for testing later on
	static ArrayList<Term> allterms = new ArrayList<>();
	
	public void setURL(String URL){
		Main.URL = URL;
		System.out.println(URL);
	}
	
	public static void loadFromFile() throws FileNotFoundException {
		System.out.println("loading file from address" + URL);
		File usersFile = new File(URL);  //replace with variable later on
		Scanner inUsers = new Scanner(usersFile);
		String delims = "\t";// each field in the file is separated(delimited)
								// by a tab except for the first one
		while (inUsers.hasNextLine()) {
			// get user and rating from data source
			String userDetails = inUsers.nextLine();
			userDetails = userDetails.trim();

			// parse user details string
			String[] userTokens = userDetails.split(delims);

			// add this data to an Arraylist.
			if (userTokens.length == 2) {
				Term t = new Term(userTokens[1], Double.parseDouble(userTokens[0]));
				allterms.add(t);
			}
		}
		inUsers.close();
	}

	
//	
//	@Test
//	public void testURL(String URLName) {
//		brute.setURL("./wiki.txt");
//	}

}
