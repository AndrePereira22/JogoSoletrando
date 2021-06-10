package View;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class painel extends JPanel {

	/**
	 * Create the panel.
	 */
	public painel() {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\andre\\git\\JogoSoletrando\\imagens\\sombra.png"));
		lblNewLabel_1.setBounds(283, 192, 228, 220);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\andre\\git\\JogoSoletrando\\imagens\\plano.png"));
		lblNewLabel.setBounds(0, 0, 783, 527);
		add(lblNewLabel);

	}
}
