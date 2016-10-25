package cfarrell;

import java.io.IOException;

import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;




public class Main {

	public static void main(String[] args) throws IOException {
		BruteAutoComplete x = new BruteAutoComplete();
		x.weightOf("hell");
		x.bestMatch("yo");
		
		Main main = new Main();
		Shell shell = ShellFactory.createConsoleShell("pm", "Welcome to autocomplete- ?help for instructions", main);
		shell.commandLoop();
	}
	private BruteAutoComplete bruteComplete;
	
	
	 @Command(description="Load in a file to process")
	  public void loadFile (@Param(name="FileName") String fileName)
	  {
	   
	    System.out.println("Work In Progress");
	  }
	 
	 @Command(description="Enter a prefix")
	  public void bestMatch (@Param(name="prefix") String fileName)
	  {
	   
	    System.out.println("Work In Progress");
	  }
	 
	 @Command(description="Load in a file to process")
	  public void displayWords (@Param(name="topWords") String fileName)
	  {
	   
	    System.out.println("Work In Progress");
	  }
	 
	

}
