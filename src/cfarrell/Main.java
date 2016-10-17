package cfarrell;

import java.io.IOException;
import java.util.Scanner;


public class Main {

	 public static void main(String[] args) {
			Main app = new Main();
			try {
				app.Driver();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 private Scanner input = new Scanner(System.in);
	 public void Driver() throws IOException{
	        input = new Scanner(System.in);  
	        TermList termList = new TermList("https://dl.dropbox.com/u/18678304/2011/BSc2/words.txt");
	        runMenu();
	    }
	    
	    
	   
	

	private void runMenu() {
		// TODO Auto-generated method stub
		
	}





	public void mainMenu()
	{
		Scanner scan = new Scanner(System.in);
		runMenu();

	}
	 }

