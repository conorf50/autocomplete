package cfarrell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BruteAutoComplete implements AutoComplete {

	public String URL = "./wiki.txt";
	ArrayList<Term> allterms = new ArrayList<>();

	public BruteAutoComplete() throws FileNotFoundException {
		loadFromFile();
	}
	
	public void setURL(String URL){
		this.URL = URL;
	}

	public void loadFromFile() throws FileNotFoundException {
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

	@Override
	public double weightOf(String term) throws NullPointerException {

		for (Term t : allterms) {
			if (t.term.startsWith(term))
				return t.weight;
		}
		return 0;
	}

	@Override
	public String bestMatch(String prefix) throws NullPointerException {
		return matches(prefix, 1).iterator().next();
		
	}

	@Override
	public Iterable<String> matches(String prefix, int k) throws NullPointerException {
		ArrayList<String> filterTerms = new ArrayList<String>();
		for (Term t : allterms) {
			if (t.getTerm().startsWith(prefix))
				filterTerms.add(t.getTerm());
		}
		Collections.sort(filterTerms);
		if(filterTerms.size() > k){
			return filterTerms.subList(0,k);
		}
		return filterTerms;
		
	}

}
