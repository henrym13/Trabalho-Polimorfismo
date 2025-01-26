package abstrataex2;

public class Main {

	public static void main(String[] args) {
		
		Sofa sofa = new Sofa();
		Televisao tv = new Televisao(42, true);
		
		sofa.mover("sala");
		
		System.out.println(" ");
		
		tv.desligar();
		tv.mover("sala");
		tv.ligar();
		tv.ligar();
		

	}

}
