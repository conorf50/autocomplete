package cfarrell;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Driver app = new Driver();
		BruteAutoComplete x = new BruteAutoComplete();
		x.weightOf("hell");
		x.bestMatch("yo");

	}
	private Scanner input;
	private BruteAutoComplete bruteComplete;
	 public void Driver()
	    {
	        input = new Scanner(System.in);        
	        BruteAutoComplete bruteComplete = new BruteAutoComplete();
	        runMenu();
	    }
	    
	

	private int mainMenu() {
		input = new Scanner(System.in);

		System.out.println("Autocomplete Programme");
		System.out.println("---------");
		System.out.println("  1) Load in file");
		System.out.println("  2) Enter prefix");
		System.out.println("  3) Display top words containing prefix");
		System.out.println("  4) View README");

		System.out.println("  0) Exit");
		System.out.print("==>> ");
		int option = input.nextInt();
		return option;
	}

	private void runMenu() {
		int option = mainMenu();
		while (option != 0) {
			boolean goodInput = false;

			switch (option) {
			case 1:
				do { // load in file from URL or local file
					try {
						// addProduct();
						goodInput = true;
					} catch (Exception e) {
						System.out.println("Num expected - you entered text");
					}

				} while (!goodInput);
				break;
			case 2: // enter a prefix
				System.out.println("enter prefix");
				break;
			case 3:
				System.out.println("display words with prefix");
				// display words containing prefix
				break;

			default:
				System.out.println("Invalid option entered: " + option);
				break;
			}

			System.out.println("\nPress any key to continue...");
			input.nextLine();
			input.nextLine();
		}

		System.out.println("Exiting... bye");
		System.exit(0);
	}

}
