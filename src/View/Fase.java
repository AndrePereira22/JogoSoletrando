package View;

import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;

import Model.Jogo;
import Model.Mapa;
import Model.Professor;
import Model.Sprite;

public class Fase extends Jogo {

	private static final long serialVersionUID = 1L;

	private Mapa fundo, colisao;
	private Sprite personagem;
	private static ArrayList<Rectangle> retangulosColisao;

	public Fase(String img) {
		super(img);
		Load(img);

	}

	public void Load(String img) {

		fundo = new Mapa("fundoSoletrando.png", "mapa.txt");
		colisao = new Mapa("fundoSoletrando.png", "colisao.txt");

		fundo.montarMapa();

		retangulosColisao = colisao.montarColi();

		try {
			personagem = new Sprite(img, 2, 4, 4, 20, 485);

		} catch (IOException e) {

		}

		setVisible(false);

	}

	public void Update() {
		fundo.montarMapa();

	}

	public void Render() {

		g.drawImage(fundo.getMapa(), 0, 0, null);

		for (int i = 0; i < Professor.getProfessores().size(); i++) {

			Professor professor = Professor.getProfessores().get(i);
			if (professor.isVisivel()) {
				g.drawImage(professor.getImagem(), professor.getX(), professor.getY(), null);
			}

		}
		g.drawImage(personagem.sprites[personagem.aparencia], personagem.getX(), personagem.getY(), null);

	}

	public Sprite getPersonagem() {
		return personagem;
	}

	public static ArrayList<Rectangle> getRetangulosColisao() {
		return retangulosColisao;
	}

}
