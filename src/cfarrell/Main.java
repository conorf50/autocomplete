package cfarrell;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;

public class Main {
	
	private Scanner sc = new Scanner(System.in);
	//called by interface name first
	AutoComplete brute;    //brute force autocomplete
	
	AutoComplete quick;    //quick autocomplete
	public static void main(String[] args) throws IOException {
		Main main = new Main();
		//Create a shell with ac@ and the user's name displayed in lower case
		Shell shell = ShellFactory.createConsoleShell("ac@" + System.getProperty("user.name").toLowerCase(), "Welcome to autocomplete- ?help for instructions", main);
		shell.commandLoop();
	}
    
	public Main()
	{
		try {
			brute = new BruteAutoComplete();
			quick = new QuickAutoComplete();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/* @Command(description="Load in a file to process")
	  public void loadFile (@Param(name="FileName") String fileName)
	  {
	    //loadFromFile();
	  }*/
	 
	 @Command(description="Enter a prefix")
	  public void enterPrefix (@Param(name="prefix") String prefix)
	  {
		String pre = sc.next();
		int k = 0;
	    brute.matches(pre, k);
	    System.out.println("Work In Progress");
	  }
	 
	 @Command(description="Load in a file to process")
	  public void URLName (@Param(name="URLName") String fileName)
	  {
	    System.out.println("Work In Progress");
	  }
	 
	 @Command(description="Allow the user to switch between quick and slow complete modes")
	  public void mode (@Param(name="mode") String modeName)
	  {
		 boolean useQuickComplete = false;
	    System.out.println("The only mode is BruteAutoComplete!");
	  }
	 
	

}
