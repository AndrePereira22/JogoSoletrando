package View;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;

import javax.swing.ImageIcon;

public class ComoJogar extends JPanel {

	/**
	 * Create the panel.
	 */
	public ComoJogar(int largura,int altura) {
		setLayout(null);
		setPreferredSize(new Dimension(largura,altura));

		JLabel lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon(getClass().getResource("/plano.jpg")));
		lblFundo.setBounds(0, 0, 800, 600);
		add(lblFundo);

		setVisible(false);
	}
}
