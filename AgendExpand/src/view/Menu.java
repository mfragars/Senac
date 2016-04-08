package view;

import com.senac.SimpleJava.Console;

public class Menu {
	private String titulo = "Selecione uma opcao";
	Option option = new Option();

	public void execute() {
		Console.println(titulo);
		Console.println("=========================");
		Console.println("[1] - queryString");
		Console.println("[2] - queryInteger");
		Console.println("[3] - queryDate");
		Console.println("[4] - queryDouble");
		Console.println("[5] - display");
		Console.println("[6] - displayError");
		Console.println("[7] - Sair");
		Console.println("=========================");
		Console.println();
		
	}
	
	public int getOption(){
		int option = 0;
		while(true){
			option = Console.readInt("Opção: ");
			if(option > 0 && option <= 7){
				return option;
			}else{
				Console.println("Opcao Invalida");
			}
			
		}
	}

}
