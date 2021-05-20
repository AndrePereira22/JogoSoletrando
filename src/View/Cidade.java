
package View;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Cidade {

	private Image imagem;
	private int x, y;
	private int largura, altura;
	private ImageIcon referencia;
	private boolean isVisivel;
	private static int[] posX = { 576 };
	private static int[] posY = { 192 };
	private static ArrayList<Cidade> cidades = new ArrayList<Cidade>();

	public Cidade(String nome) {

		this.x = 300;
		this.y = 500;

		referencia = new ImageIcon(getClass().getResource("/" + nome + ".png"));

		imagem = referencia.getImage();

		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);

		isVisivel = true;
	}

	public static ArrayList<Cidade> getCidades() {
		return cidades;
	}

	public static void addCidade(Cidade cidade) {
		cidades.add(cidade);
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

}
