package view;

import com.senac.SimpleJava.Console;

public class ConsoleView {
	Menu menu = new Menu();

	public void execute() {
		menu.execute();
		
	}

	public void queryString() {
		Console.println("queryString");
		Console.println();
		
	}

	public void queryInteger() {
		Console.println("queryInteger");
		Console.println();
		
	}

	public void queryDate() {
		Console.println("queryDate");
		Console.println();
		
	}
	
	public void queryDouble(){
		Console.println("queryDouble");
		Console.println();
		
	}
	
	public void display(){
		Console.println("display");
		Console.println();
		
	}
	
	public void displayError(){
		Console.println("displayError");
		Console.println();
		
	}
	
	

}
