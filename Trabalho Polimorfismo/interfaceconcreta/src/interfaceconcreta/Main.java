package interfaceconcreta;

public class Main {

	public static void main(String[] args) {

		Musica t3 = new Sorcerer("Sorcerer", "Stevie Nicks", 4.54, true, true);
		Musica t4 = new Musica("Planets of the Universe", "Stevie Nicks", 4.45, true, false);
		
		((Clipe) t3).darPlay();
		System.out.println(" ");
		((Clipe) t3).creditos();
		System.out.println(" ");
		System.out.println(" ");

		
		t4.tocar();
		System.out.println(" ");
		t4.pausar();
		System.out.println(" ");
		t4.tocar();
		
	}

}
