package interfaceconcreta;

public class Musica {

	protected String nome;
	protected String artista;
	protected double tempo;
	protected boolean voz;
	protected boolean tocando;
	
	public Musica(String nome, String artista, double tempo, boolean voz, boolean tocando) {
		this.nome = nome;
		this.artista = artista;
		this.tempo = tempo;
		this.voz = voz;
		this.tocando = tocando;
	}

	public void tocar() {
		if(tocando == true)
			System.out.println("A música já está sendo tocada");
		{
			System.out.println("A música começou a tocar/voltando a tocar...");
			tocando = true;
		}
	}
	
	public void pausar() {
		if(tocando == true) {
			System.out.println("Música pausada");
			tocando = false;
		}else {
			System.out.println("A música já está pausada/não inicializada");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public boolean isVoz() {
		return voz;
	}

	public void setVoz(boolean voz) {
		this.voz = voz;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
}
