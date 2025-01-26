package interfaceconcreta;

public class Sorcerer extends Musica implements Clipe{

	public Sorcerer(String nome, String artista, double tempo, boolean voz, boolean tocando) {
		super(nome, artista, tempo, voz, tocando);
	}

	public void darPlay() {
		System.out.println("*Clipe iniciado* I'm tired...");
	}

	public void creditos() {
		System.out.println("Edited By – Sheryl Crow\r\n"
				+ "Mixed By – Chris Lord-Alge\r\n"
				+ "Producer – Sheryl Crow\r\n"
				+ "Producer, Words By, Music By – Stevie Nicks");
		
	}

}
