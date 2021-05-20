package Control;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.Audio;
import Model.Sprite;
import View.Cidade;
import View.Fase;
import View.Janela;
import View.Menu;
import View.Opcao;
import View.Soletrar;

@SuppressWarnings("deprecation")
public class Controle implements Runnable, ActionListener, KeyListener {

	private Janela janela;
	private Menu menu;
	private Sprite personagem;
	private Audio audio;
	private Opcao opcao;
	private Fase fase;
	private Movimento mover;
	private Soletrar soletrar;
	

	public Controle(Janela janela) {

		this.janela = janela;

		this.menu = janela.getMenu();
		this.audio = new Audio();
		this.opcao = janela.getOpcao();
		this.fase = janela.getFase();
		this.mover = new Movimento(fase.getPersonagem());
		this.soletrar = janela.getSoletrar();
		this.personagem = fase.getPersonagem();

		Cidade.addCidade(new Cidade("carro"));
		audio = new Audio();
	
	
		controleEventos();

		janela.setVisible(true);
	}

	public void controleEventos() {

		opcao.getBtnIniciar().addActionListener(this);
		fase.addKeyListener(mover);
		fase.addKeyListener(this);
		soletrar.getBtnOuvir().addActionListener(this);
		soletrar.getBtnConfirmar().addActionListener(this);
		menu.getSair().addActionListener(this);
		menu.getCreditos().addActionListener(this);
		menu.getAjuda().addActionListener(this);
		menu.getJogar().addActionListener(this);
		opcao.getBtnVoltar().addActionListener(this);
		opcao.getBtnIniciar().addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == soletrar.getBtnConfirmar()) {

			verificarPalavra();
		}
		if (e.getSource() == menu.getJogar()) {
			MudarTela(opcao, menu);

		}

		if (e.getSource() == opcao.getBtnIniciar()) {
			MudarTela(fase, opcao);
		}
		if (e.getSource() == soletrar.getBtnOuvir()) {
			audio.carregarPalavra();
			
			soletrar.getDica().setText(audio.getDica());
		}
	}

	private void verificarPalavra() {
	
		if(soletrar.getCampo().getText().equals(audio.getPalavraSorteada().getPalavra())) {
			System.out.println(soletrar.getCampo().getText()+ " "+audio.getPalavraSorteada().getPalavra());
			
			audio.mudarPalavra();
			System.out.println("acertou");
			
			soletrar.getCampo().setText("");
			
		}else {
			System.out.println("errou");
			System.out.println(soletrar.getCampo().getText()+ " "+audio.getPalavraSorteada().getPalavra());
		}
		

	}

	public void run() {
		boolean ativo = true;
		while (ativo) {

			try {
System.out.println(janela.getWidth()+ "df "+janela.getHeight());
				runControleDoJogo();

				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void runControleDoJogo() {
	}

	public void MudarTela(JPanel aparece, JPanel some) {
		aparece.setVisible(true);
		some.setVisible(false);

	}

	public void iniciar() {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			for (int i = 0; i < Cidade.getCidades().size(); i++) {
				Cidade cidade = Cidade.getCidades().get(i);
				if (cidade.isVisivel()) {
					if (personagem.colisaoAlvo(Cidade.getCidades().get(i), 0, 0)) {

						janela.remove(fase);
						MudarTela(soletrar, fase);
						janela.setVisible(true);

					}
					;
				}
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
