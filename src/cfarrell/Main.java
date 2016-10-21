package cfarrell;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	 public static void main(String[] args) throws FileNotFoundException {
		
		 BruteAutoComplete x=new BruteAutoComplete();
		 x.weightOf("hell");
		 x.bestMatch("yo");
		 
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

