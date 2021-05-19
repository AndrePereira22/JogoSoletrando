package View;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class Tel extends JPanel {
	private JButton btnReiniciar;

	/**
	 * Create the panel.
	 */
	public Tel() {
		setLayout(null);
		
		
		
		JButton btnComoJogar = new JButton("");
		btnComoJogar.setBounds(52, 275, 109, 56);
		add(btnComoJogar);
		
		btnReiniciar = new JButton("");
		btnReiniciar.setBounds(41, 187, 120, 33);
		add(btnReiniciar);
		
		JButton btnOuvir = new JButton("");
		btnOuvir.setBounds(621, 258, 151, 73);
		add(btnOuvir);
		
		JLabel lblPontuacao = new JLabel("PONTUACAO");
		lblPontuacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPontuacao.setBounds(649, 380, 109, 14);
		add(lblPontuacao);
		
		JLabel pontos = new JLabel("0");
		pontos.setBounds(687, 395, 32, 24);
		add(pontos);
		
		JLabel lblTempo = new JLabel("");
		lblTempo.setBounds(649, 104, 95, 24);
		add(lblTempo);
		
		JPanel jpPalavra = new JPanel();
		jpPalavra.setBounds(535, 172, -269, -23);
		add(jpPalavra);
		
		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\Solentrando\\resource\\plano.png"));
		fundo.setBounds(0, 0, 801, 600);
		add(fundo);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(621, 166, 144, 41);
		add(btnConfirmar);

	}
}
