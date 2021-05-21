
package View;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Professor {

	private Image imagem;
	private int x, y;
	private int largura, altura;
	private ImageIcon referencia;
	private int professor;
	private boolean isVisivel;
	private static int[] posX = { 576 };
	private static int[] posY = { 192 };
	private static ArrayList<Professor> professores = new ArrayList<Professor>();

	public Professor(String nome,int x, int y, int professor) {

		this.x = x;
		this.y = y;
		this.professor=professor;

		referencia = new ImageIcon(getClass().getResource("/" + nome + ".png"));

		imagem = referencia.getImage();

		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);

		isVisivel = true;
	}

	
	public static ArrayList<Professor> getProfessores() {
		return professores;
	}


	public static void addProfessor(Professor cidade) {
		professores.add(cidade);
	}

	public Image getImagem() {
		return imagem;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, largura, altura);
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public static int[] getPosX() {
		return posX;
	}

	public static int[] getPosY() {
		return posY;
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}

	public int getProfessor() {
		return professor;
	}

	public void setProfessor(int professor) {
		this.professor = professor;
	}

}
