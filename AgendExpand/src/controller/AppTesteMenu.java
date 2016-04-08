package controller;

import view.ConsoleView;
import view.Menu;

public class AppTesteMenu {
	private Menu menuPessoa = new Menu();
	private Menu menuEndereco = new Menu();
	private Menu menu = new Menu();
	private ConsoleView consoleView = new ConsoleView();
	
	
	public void mostraMenuPessoa(){
		menuPessoa.execute();
	}
	
	public void mostraMenuEdereco(){
		menuEndereco.execute();
	}
	
	public void run(){
		boolean action = true;
		while(action){
			consoleView.execute();
				switch(menu.getOption()){
					case 1:
						consoleView.queryString();
						break;
					case 2:
						consoleView.queryInteger();
						break;
					case 3:
						consoleView.queryDate();
						break;
					case 4:
						consoleView.queryDouble();
						break;
					case 5:
						consoleView.display();
						break;
					case 6:
						consoleView.displayError();
						break;
					case 7:
						action = false;
						break;
				}
			
		}
	}

}
