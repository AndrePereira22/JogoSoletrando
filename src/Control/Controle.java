package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import Model.Audio;
import Model.Professor;
import Model.Sprite;
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
	private int controleFase = 0;
	private int placar = 0;

	public Controle(Janela janela) {

		this.janela = janela;

		this.menu = janela.getMenu();
		this.audio = new Audio();
		this.opcao = janela.getOpcao();
		this.fase = janela.getFase();
		this.mover = new Movimento(fase.getPersonagem());
		this.soletrar = janela.getSoletrar();
		this.personagem = fase.getPersonagem();

		Professor.addProfessoresAux();

		Professor.getProfessores().add(Professor.getAuxProfessores().get(controleFase));

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
		soletrar.getBtnPular().addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == soletrar.getBtnConfirmar()) {

			verificarPalavra();
		}
		if (e.getSource() == menu.getJogar()) {
			MudarTela(opcao, menu);

		}
		if (e.getSource() == soletrar.getBtnPular()) {

			pularPalavra();
			audio.ouvirPalavra();

		}

		if (e.getSource() == opcao.getBtnIniciar()) {
			MudarTela(fase, opcao);
		}
		if (e.getSource() == soletrar.getBtnOuvir()) {

			if (audio.getClip() == null) {
				audio.carregarPalavra();
				audio.ouvirPalavra();
				soletrar.getDica().setText(audio.getDica());

			} else {
				audio.ouvirPalavra();
			}
			soletrar.getCampo().grabFocus();
		}
	}

	private void verificarPalavra() {
		try {
			if (soletrar.getCampo().getText().equals(audio.getPalavraSorteada().getPalavra())) {

				soletrar.getCampo().setText("");
				audio.concluirPalavra();
				audio.carregarPalavra();

				placar++;

				audio.ouvirAlerta("acertou");
				mudarDefinicao();

			} else {

				audio.ouvirAlerta("errou");

				Thread.sleep(2000);

				pularPalavra();
			}
			soletrar.getCampo().setText("");

			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void run() {
		boolean ativo = true;
		while (ativo) {

			try {

				runControleDoJogo();

				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void runControleDoJogo() {

		if (placar == 6) {
			placar = 0;
			controleFase++;
			addNovoProfessor();
			audio.setClip(null);
		}

	}

	public void addNovoProfessor() {
		Professor.getProfessores().clear();
		Professor.getProfessores().add(Professor.getAuxProfessores().get(controleFase));
		janela.add(fase);
		MudarTela(fase, soletrar);
		audio.setClip(null);
		janela.setVisible(true);

	}

	public void MudarTela(JPanel aparece, JPanel some) {
		aparece.setVisible(true);
		some.setVisible(false);

	}

	public void iniciar() {

	}

	public void pularPalavra() {
		audio.carregarPalavra();
		mudarDefinicao();

	}

	public void mudarDefinicao() {
		soletrar.getDica().setText(audio.getDica());
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			for (int i = 0; i < Professor.getProfessores().size(); i++) {
				Professor professor = Professor.getProfessores().get(i);
				if (professor.isVisivel()) {
					if (personagem.colisaoAlvo(Professor.getProfessores().get(i), 0, 0)) {

						switch (professor.getCodigo()) {

						case 0: {

							soletrar.setarIconeProfessor("nerd1");
							audio.setarFaixaSorteio(professor.getCodigo());

							break;
						}
						case 1: {

							soletrar.setarIconeProfessor("loira1");
							audio.setarFaixaSorteio(professor.getCodigo());
							break;
						}
						case 2: {

							soletrar.setarIconeProfessor("saradona1");
							audio.setarFaixaSorteio(professor.getCodigo());
							break;
						}
						case 3: {

							soletrar.setarIconeProfessor("nerdinha1");
							audio.setarFaixaSorteio(professor.getCodigo());
							break;
						}
						case 4: {

							soletrar.setarIconeProfessor("mascarado1");
							audio.setarFaixaSorteio(professor.getCodigo());
							break;
						}
						case 5: {

							soletrar.setarIconeProfessor("profa1");
							audio.setarFaixaSorteio(professor.getCodigo());
							break;
						}
						case 6: {

							soletrar.setarIconeProfessor("veio1");
							audio.setarFaixaSorteio(professor.getCodigo());
							break;
						}

						}

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
