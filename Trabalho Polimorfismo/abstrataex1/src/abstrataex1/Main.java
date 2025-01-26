package abstrataex1;

public class Main {

	public static void main(String[] args) {
		
		Galinha ga = new Galinha("Josefa");
		Golfinho go = new Golfinho("Bjork");
		
		ga.comer(false);
		ga.dormir();
		System.out.println(" ");
		go.comer(true);
	}

}
