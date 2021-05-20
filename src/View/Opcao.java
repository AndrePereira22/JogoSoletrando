package View;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Opcao extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtJogador, txtIdade;
	private JLabel  lblIdade, fundo, lblJogador;
	private JButton btnAvancar,btnVoltar;
	private JPanel painelLeft, painelRight, panelPlay;

	/**
	 * Create the panel.
	 */
	public Opcao(int largura, int altura) {

		setPreferredSize(new Dimension(largura, altura));
		setLayout(null);

		painelLeft = new JPanel();
		painelLeft.setBounds(113, 150, 286, 221);
		painelLeft.setLayout(null);
		painelLeft.setOpaque(false);

		painelRight = new JPanel();
		painelRight.setLayout(null);
		painelRight.setOpaque(false);
		painelRight.setBounds(404, 150, 296, 221);

		panelPlay = new JPanel();
		panelPlay.setBounds(113, 409, 580, 93);
		panelPlay.setOpaque(false);
		panelPlay.setLayout(null);
		add(panelPlay);
		
		
		

		lblJogador = new JLabel("JOGADOR :");
		lblJogador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblJogador.setForeground(Color.RED);
		lblJogador.setBounds(30, 80, 106, 22);
		painelLeft.add(lblJogador);

		lblIdade = new JLabel("IDADE :");
		lblIdade.setForeground(Color.RED);
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdade.setBounds(40, 125, 87, 14);
		painelLeft.add(lblIdade);

		txtJogador = new JTextField();
		txtJogador.setBounds(110, 76, 108, 25);
		painelLeft.add(txtJogador);
		txtJogador.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(110, 118, 40, 25);
		painelLeft.add(txtIdade);
		txtIdade.setColumns(10);

		

		btnAvancar = new JButton("");
		btnAvancar.setIcon(new ImageIcon(getClass().getResource("/avancar.png")));
		btnAvancar.setRolloverIcon(new ImageIcon(getClass().getResource("/avancarRoller.png")));
		btnAvancar.setContentAreaFilled(false);
		btnAvancar.setBorder(null);
		btnAvancar.setBounds(500, 20, 62, 69);
		panelPlay.add(btnAvancar);
		
		btnVoltar = new JButton("");
		btnVoltar.setIcon(new ImageIcon(getClass().getResource("/voltar.png")));
		btnVoltar.setRolloverIcon(new ImageIcon(getClass().getResource("/voltarRoller.png")));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorder(null);
		btnVoltar.setBounds(40, 20, 62, 69);
		panelPlay.add(btnVoltar);

		add(painelLeft);

		add(painelRight);


		fundo = new JLabel(new ImageIcon(getClass().getResource("/fundoSoletrando.png")));
		fundo.setBounds(0, 0, 800, 600);
		add(fundo);

	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public JTextField getTxtJogador() {
		return txtJogador;
	}

	public JTextField getTxtIdade() {
		return txtIdade;
	}

	public JButton getBtnIniciar() {
		return btnAvancar;
	}


}
