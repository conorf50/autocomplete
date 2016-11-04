package cfarrell;

import java.util.ArrayList;
import java.util.Comparator;


public class QuickAutoComplete implements AutoComplete{
	public String URL = "./wiki.txt";
	ArrayList<Term> allterms = new ArrayList<>();

	
	
	public void setURL(String URL){
		this.URL = URL;
	}
	
	
	//static class termComparator implements Comparator<>
	
	
	@Override
	public double weightOf(String term) {
		System.out.println("Work In Progress");
		return 0;
	}

	@Override
	public String bestMatch(String prefix) throws NullPointerException {
		
		return matches(prefix, 1).iterator().next();
	}


	@Override
	public Iterable<String> matches(String prefix, int k) {
		System.out.println("Work In Progress");

		return null;
	}


	public void loadFromFile() {
		// TODO Auto-generated method stub
		
	}
	
}
