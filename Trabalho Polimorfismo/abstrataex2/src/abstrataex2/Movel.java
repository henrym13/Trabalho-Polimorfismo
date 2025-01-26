package abstrataex2;

public abstract class Movel {
	
	public void mover(String lugar) {
		System.out.println("Mudando " + this.getClass().getSimpleName() + " para " + lugar);
	}
}
