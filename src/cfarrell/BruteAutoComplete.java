package cfarrell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BruteAutoComplete implements AutoComplete {

	ArrayList<Term> allterms = new ArrayList<>();

	public BruteAutoComplete() throws FileNotFoundException {
		loadFromFile();
	}

	private void loadFromFile() throws FileNotFoundException {
		System.out.println("loading file");
		File usersFile = new File("./wiki.txt");
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

	@Override
	public double weightOf(String term) throws NullPointerException {
		// TODO Auto-generated method stub

		for (Term t : allterms) {
			if (t.term.startsWith(term))
				return t.weight;
		}

		return 0;
	}

	@Override
	public String bestMatch(String prefix) throws NullPointerException {

		return null;
	}

	@Override
	public Iterable<String> matches(String prefix, int k) throws NullPointerException {
		ArrayList<String> filterTerms = new ArrayList<String>();
		for (Term t : allterms) {
			if (t.getTerm().startsWith(prefix))
				filterTerms.add(t.getTerm());
		}
		Collections.sort(filterTerms);
		return filterTerms.subList(0,k);
	}

}
