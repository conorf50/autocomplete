package cfarrell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


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
	public Iterable<String> matches(String prefix, int k) throws NullPointerException {
		return null;
//		int index;
//		ArrayList<String> filterTerms = new ArrayList<String>();
//		Collections.binarySearch(allterms, new Term(index,prefix));
//		index = -index-1; //attempt at setting the value returned to  a positive value
//		
//		List<String> filtered = new ArrayList<String>();
//		while(allterms.get(index).getWord().startsWith(prefix)) {
//			if (filterTerms.size() > k) {
//				return filterTerms.subList(0, k);
//			}
//			return filterTerms;
//
//		}
//		
		
		
	}

	


//	public void loadFromFile() {
//		// TODO Auto-generated method stub
//		
//	}
	
}
