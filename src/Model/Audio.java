package Model;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Audio {

	@SuppressWarnings("deprecation")
	private AudioClip clip;
	public Random sorteio = new Random();
private String Dica;
	private Palavra palavraSorteada;
	private ArrayList<Palavra> palavras = new ArrayList<Palavra>();
	private int numero;

	public Audio() {

		lerlista();
	}

	public void carregarPalavra() {

		numero = sorteio.nextInt(palavras.size());
		palavraSorteada = palavras.get(numero);

		while (palavraSorteada.isCompleto()) {
			numero = sorteio.nextInt(palavras.size());
			palavraSorteada = palavras.get(numero);
		}

		String p = palavraSorteada.getPalavra();
		CarregarDica(p);

		clip = Applet.newAudioClip(getClass().getResource("/" + p + ".wav"));
		clip.play();

	}
	public void CarregarDica(String palavra) {
		try {
			// abre o arquivo
System.out.println(palavra);
			BufferedReader arqIn = new BufferedReader(
					new InputStreamReader(new FileInputStream("textos/"+palavra+".txt"), "UTF-8"));
			String temp;
			// A cada intera��o, � uma linha do arquivo e atribui-a a temp

			while ((temp = arqIn.readLine()) != null) {
				// Aqui gera a sua "lista". No caso, imprimi cada linha na tela.
				String[] a = temp.split(";");
				for (String each : a) {
					Dica = each;
				}

			}

		} catch (FileNotFoundException el) {
			System.out.println("Arquivo n�o Encontrado!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void lerlista() {
		try {
			// abre o arquivo

			BufferedReader arqIn = new BufferedReader(
					new InputStreamReader(new FileInputStream("textos/lista.txt"), "UTF-8"));
			String temp;
			// A cada intera��o, � uma linha do arquivo e atribui-a a temp

			while ((temp = arqIn.readLine()) != null) {
				// Aqui gera a sua "lista". No caso, imprimi cada linha na tela.
				String[] a = temp.split(";");
				for (String each : a)

					palavras.add(new Palavra(each));
			}

		} catch (FileNotFoundException el) {
			System.out.println("Arquivo n�o Encontrado!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public int sortear() {

		return numero;
	}

	public void mudarPalavra() {

		palavras.get(numero).setCompleto(true);

	}

	public int getNumero() {
		return numero;
	}

	public AudioClip getPalavra() {
		return clip;
	}

	public ArrayList<Palavra> getPalavras() {
		return palavras;
	}

	public Palavra getPalavraSorteada() {
		return palavraSorteada;
	}

	public String getDica() {
		return Dica;
	}

	public void setDica(String dica) {
		Dica = dica;
	}

}