package cfarrell;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	private Scanner sc = new Scanner(System.in);
	// called by interface name first
	AutoComplete brute; // brute force autocomplete
	AutoComplete quick; // quick autocomplete
	public static String URL = null;    //important for testing later on
	static ArrayList<Term> allterms = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Main main = new Main();
		main.run();
		
	}

	public Main() {
		try {
			brute = new BruteAutoComplete();
			quick = new QuickAutoComplete();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void setURL(String URL){
		Main.URL = URL;
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

	private int mainMenu() {
		System.out.println("1) Enter URL of list");
		System.out.println("2) Enter term");
		System.out.println("3) Change autocomplete mode");
		System.out.println("0) Exit");
		System.out.print("==>>");
		int option = sc.nextInt();
		return option;
	}

	public void run() {
		{
			System.out.println("Autocomplete system");
			int option = mainMenu();
			while (option != 0) {
				switch (option) {
				case 1:
					URLName();
					break;
				case 2:
					matches();
					break;
				case 3:
					mode();
					break;
				}

				option = mainMenu();
			}
			System.out.println("Exiting... bye");
		}
	}

	public void matches() {
		System.out.println("Enter a prefix");
		String prefix = sc.next();
		System.out.println("Number of terms to return");
		int k = sc.nextInt();
	//	int m  = ((Object) brute.matches(prefix, k)).size();          //trying to show how many results were returned
		System.out.println("Best match = "+ brute.bestMatch(prefix)); 
		System.out.println("Matching terms for k = "+ brute.matches(prefix, k));
		

	}

	public void URLName(){
		System.out.println("Enter a valid URL");
		String URL =  sc.next();
		((BruteAutoComplete) brute).setURL(URL);
		System.out.println("Using the URL"+ URL);
	}

	public void mode() {
		boolean useQuickComplete = false;
		/*
		 * include some method for setting this to true when the user puts in a
		 * value of say "1" for a quick search. Then return to the main menu and
		 * show that this has been selected
		 */
		
		System.out.println("The only mode is BruteAutoComplete!");
	}

}
