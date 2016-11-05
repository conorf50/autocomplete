package cfarrell;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class BruteAutoComplete implements AutoComplete {

	public BruteAutoComplete() throws FileNotFoundException {
		Main.loadFromFile();
	}

	@Override
	public double weightOf(String term) throws NullPointerException {

		for (Term t : Main.allterms) {
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
		for (Term t : Main.allterms) {
			if (t.getTerm().startsWith(prefix))
				filterTerms.add(t.getTerm());
		}
		Collections.sort(filterTerms);
		if (filterTerms.size() > k) {
			return filterTerms.subList(0, k);
		}
		return filterTerms;

	}

	public void setURL(String URL) {
		Main.URL = URL;
	}

}
