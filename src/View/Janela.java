package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Janela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3338597443822445438L;
	private Menu menu;
	private Opcao opcao;
	private Fase fase;
	private Soletrar soletrar;
	private ComoJogar comoJogar;
	

	public Janela(int largura, int altura) {

		setPreferredSize(new Dimension(largura, altura));
		setLayout(new FlowLayout());

		setSize(largura, altura);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		//setUndecorated(true);

		menu = new Menu(800, 600);
		opcao = new Opcao(800, 600);
		fase = new Fase("sprite1.png");
		soletrar = new Soletrar(800, 600);
		comoJogar = new ComoJogar(800,600);
		

		add(menu);
		add(opcao);
		add(fase);
		add(soletrar);
		add(comoJogar);
		
		Image iconeTitulo = Toolkit.getDefaultToolkit().getImage("imagens\\icone.png");
		this.setIconImage(iconeTitulo);
		this.setVisible(true);

	}

	public ComoJogar getComoJogar() {
		return comoJogar;
	}

	public Menu getMenu() {
		return menu;
	}

	public Opcao getOpcao() {
		return opcao;
	}

	public Fase getFase() {
		return fase;
	}

	public Soletrar getSoletrar() {
		return soletrar;
	}


}
