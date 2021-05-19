package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Model.Audio;
import Model.Sprite;
import View.Janela;
import View.Menu;
import View.Opcao;

public class ControleMenu implements ActionListener {

	private Janela janela;
	private Menu menu;
	private Opcao opcao;

	public ControleMenu(Janela janela) {

		this.janela = janela;

		this.menu = janela.getMenu();
		this.opcao = janela.getOpcao();

		controleEventos();

		janela.setVisible(true);
	}

	public void controleEventos() {
		menu.getSair().addActionListener(this);
		menu.getCreditos().addActionListener(this);
		menu.getAjuda().addActionListener(this);
		menu.getJogar().addActionListener(this);
		opcao.getBtnVoltar().addActionListener(this);
		opcao.getBtnIniciar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menu.getJogar()) {
			MudarTela(opcao, menu);

		}
	}


	public void MudarTela(JPanel aparece, JPanel some) {
		aparece.setVisible(true);
		some.setVisible(false);

	}

	
}
