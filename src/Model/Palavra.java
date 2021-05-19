package Model;

public class Palavra {
	
	private String palavra;
	private boolean completo;
	
	public Palavra(String palavra) {
		super();
		this.palavra = palavra;
		this.completo = false;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public boolean isCompleto() {
		return completo;
	}

	public void setCompleto(boolean completo) {
		this.completo = completo;
	}
	
	
	

}
