package App;

import Control.Controle;
import Control.ControleMenu;
import View.Janela;

public class App {

	public static void main(String[] args) {
	
		
		Janela janela = new Janela(800,600);

		new Controle(janela);
		new ControleMenu(janela);
	}

}
