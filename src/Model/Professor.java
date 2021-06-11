
package Model;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Professor {

	private Image imagem;
	private int x, y;
	private int largura, altura;
	private ImageIcon referencia;
	private int codigo;
	private boolean isVisivel;
	private static int[] posX = { 576 };
	private static int[] posY = { 192 };
	private static ArrayList<Professor> professores = new ArrayList<Professor>();
	private static ArrayList<Professor> auxProfessores = new ArrayList<Professor>();

	public Professor(String nome, int x, int y, int professor) {

		this.x = x;
		this.y = y;
		this.codigo = professor;

		referencia = new ImageIcon(getClass().getResource("/" + nome + ".png"));

		imagem = referencia.getImage();

		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);

		isVisivel = true;
	}

	public static void addProfessoresAux() {
		auxProfessores.add(new Professor("nerd", 200, 400, 0));
		auxProfessores.add(new Professor("loira", 380, 400, 1));
		auxProfessores.add(new Professor("saradona", 520, 400, 2));
		auxProfessores.add(new Professor("nerdinha", 650, 400, 3));
		auxProfessores.add(new Professor("mascarado", 610, 400, 4));
		auxProfessores.add(new Professor("profa", 420, 400, 5));
		auxProfessores.add(new Professor("veio", 520, 400, 6));
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

	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public static ArrayList<Professor> getAuxProfessores() {
		return auxProfessores;
	}

}
