package cfarrell;

import java.io.File;
import java.util.Scanner;


public class BruteAutoComplete implements AutoComplete {

	@Override
	public double weightOf(String term) throws NullPointerException{
		// TODO Auto-generated method stub
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
	 
	public String inputTerms(String term, String weight) throws Exception{
		File usersFile = new File("./data/userdata.txt");
		  Scanner inUsers = new Scanner(usersFile);
		  String delims = "[ ]";//each field in the file is separated(delimited) by a space.
		  while (inUsers.hasNextLine()) {
		    // get user and rating from data source
		    String userDetails = inUsers.nextLine();
		    // parse user details string
		    String[] userTokens = userDetails.split(delims);

		    // output user data to console.
		    if (userTokens.length == 2) {
		      System.out.println("UserID: " + userTokens[0] + ",First Name:" + userTokens[1]);

		    }else
		    {
		      inUsers.close();
		      throw new Exception("Invalid member length: "+userTokens.length);
		    }
		  }
		  inUsers.close();
		return delims;
	}
}
