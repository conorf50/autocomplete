package cfarrell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class BruteAutoComplete implements AutoComplete {

	ArrayList<Term> allterms = new ArrayList<>();
	
	public BruteAutoComplete() throws FileNotFoundException {
		loadFromFile();
	}
	
	private void loadFromFile() throws FileNotFoundException {
		File usersFile = new File("./wiki.txt");
		  Scanner inUsers = new Scanner(usersFile);
		  String delims = "\t";//each field in the file is separated(delimited) by a space.
		  while (inUsers.hasNextLine()) {
		    // get user and rating from data source
		    String userDetails = inUsers.nextLine();
		    userDetails=userDetails.trim();
		    
		    // parse user details string
		    String[] userTokens = userDetails.split(delims);

		    // output user data to console.
		   if (userTokens.length == 2) {
		    
		      Term t=new Term(userTokens[1],Double.parseDouble(userTokens[0]));
		      
		      allterms.add(t);
		   }	      

		  
		  }
		  inUsers.close();
		
	}
	
	@Override
	public double weightOf(String term) throws NullPointerException{
		// TODO Auto-generated method stub
		
		for(Term t : allterms){
			if(t.term.startsWith(term)) return t.weight;
		}
		
		
		return 0;
	}

	@Override
	public String bestMatch(String prefix) throws NullPointerException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<String> matches(String prefix, int k) throws NullPointerException{
		// TODO Auto-generated method stub
		return null;
	}
	 
	
}
