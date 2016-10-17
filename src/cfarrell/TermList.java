package cfarrell;

	import java.io.File;
	import java.util.Scanner;

	public class TermList {
		public TermList(String string) {
			// TODO Auto-generated constructor stub
		}

		public String termList(String term, String weight) throws Exception{
			File usersFile = new File("https://wit-computing.github.io/algorithms-2016/topic04/book-2/data/wiktionary.txt");
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

