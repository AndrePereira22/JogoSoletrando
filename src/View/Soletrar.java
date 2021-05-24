package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Soletrar extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel professor, main;
	private JLabel fundo;
	private JLabel pontos, lblTempo;
	private JButton btnReiniciar, btnComoJogar, btnOuvir, btnConfirmar,btnPular;
	private JPanel jpPalavra;
	private JPanel DICAS;
	private JLabel dica;
	private JTextField campo;

	public Soletrar(int largura, int altura) {

		setPreferredSize(new Dimension(largura, altura));
		setLayout(null);

		btnComoJogar = new JButton("");
		btnComoJogar.setBounds(52, 275, 109, 56);
		btnComoJogar.setIcon(new ImageIcon(getClass().getResource("/comoJogar.png")));
		btnComoJogar.setContentAreaFilled(false);
		add(btnComoJogar);

		btnReiniciar = new JButton("");
		btnReiniciar.setBounds(41, 187, 148, 42);
		btnReiniciar.setIcon(new ImageIcon(getClass().getResource("/reiniciar.png")));
		btnReiniciar.setContentAreaFilled(false);
		add(btnReiniciar);

		btnOuvir = new JButton("");
		btnOuvir.setBounds(621, 258, 151, 73);
		btnOuvir.setIcon(new ImageIcon(getClass().getResource("/ouvir.png")));
		btnOuvir.setContentAreaFilled(false);
		add(btnOuvir);

		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(625, 130, 138, 41);
		btnConfirmar.setIcon(new ImageIcon(getClass().getResource("/confirmar.png")));
		btnConfirmar.setContentAreaFilled(false);
		add(btnConfirmar);
		
		
		btnPular = new JButton("Confirmar");
		btnPular.setBounds(625, 190, 138, 41);
		btnPular.setIcon(new ImageIcon(getClass().getResource("/pular.png")));
		btnPular.setContentAreaFilled(false);
		add(btnPular);

		pontos = new JLabel("0");
		pontos.setBounds(698, 405, 32, 24);
		pontos.setFont(new Font("Arial", 2, 16));
		add(pontos);

		lblTempo = new JLabel("");
		lblTempo.setBounds(649, 104, 95, 24);
		add(lblTempo);

		campo = new JTextField(25);
		campo.setBounds(0, 0, 295, 43);

		jpPalavra = new JPanel();
		jpPalavra.setBounds(255, 142, 295, 33);
		// jpPalavra.setBackground(Color.blue);
		jpPalavra.setLayout(new FlowLayout());

		jpPalavra.add(campo);
		add(jpPalavra);

		dica = new JLabel("CLIQUE NO BOTÃO OUVIR PALAVRA PRA INICIAR!");
		dica.setFont(new Font("Arial", 2, 18));
		dica.setForeground(Color.WHITE);
		dica.setBounds(15, 10, 620, 30);

		professor = new JLabel();
		professor.setIcon(new ImageIcon(getClass().getResource("/nerd1.png")));
		professor.setBounds(35, 380, 100, 167);

		add(professor);

		main = new JLabel();
		main.setIcon(new ImageIcon(getClass().getResource("/main.png")));
		main.setBounds(110, 460, 650, 53);

		DICAS = new JPanel();
		// DICAS.setBackground(Color.WHITE);
		DICAS.setBounds(120, 460, 620, 53);
		DICAS.setLayout(null);
		DICAS.setOpaque(false);

		DICAS.add(dica);
		add(DICAS);
		add(main);

		fundo = new JLabel(new ImageIcon(getClass().getResource("/plano.png")));
		fundo.setBounds(0, 0, 800, 600);
		add(fundo);

	}

	public void setarIconeProfessor(String nome) {
		professor.setIcon(new ImageIcon(getClass().getResource("/"+nome+".png")));
	}

	public JTextField getCampo() {
		return campo;
	}

	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}

	public JPanel getBotoes() {
		return DICAS;
	}

	public JButton getBtnOuvir() {
		return btnOuvir;
	}

	public JPanel getJpPalavra() {
		return jpPalavra;
	}

	public JLabel getDica() {
		return dica;
	}

	public JButton getBtnPular() {
		return btnPular;
	}

}
