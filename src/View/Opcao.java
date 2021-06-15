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
	private JLabel lblIdade, fundo, lblJogador;
	private JButton btnAvancar, btnVoltar;
	private JPanel panelPlay;

	/**
	 * Create the panel.
	 */
	public Opcao(int largura, int altura) {

		setPreferredSize(new Dimension(largura, altura));
		setLayout(null);

		panelPlay = new JPanel();
		panelPlay.setBounds(113, 409, 580, 93);
		panelPlay.setOpaque(false);
		panelPlay.setLayout(null);
		add(panelPlay);

		lblJogador = new JLabel("JOGADOR :");
		lblJogador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJogador.setForeground(Color.RED);
		lblJogador.setBounds(150, 160, 106, 22);
		add(lblJogador);

		lblIdade = new JLabel("IDADE :");
		lblIdade.setForeground(Color.RED);
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdade.setBounds(400, 160, 87, 14);
		add(lblIdade);

		txtJogador = new JTextField();
		txtJogador.setBounds(245, 155, 108, 25);
		add(txtJogador);
		txtJogador.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(463, 155, 40, 25);
		add(txtIdade);
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

		fundo = new JLabel(new ImageIcon(getClass().getResource("/fundoSoletrando.png")));
		fundo.setBounds(0, 0, 800, 600);
		add(fundo);

		setVisible(false);

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
