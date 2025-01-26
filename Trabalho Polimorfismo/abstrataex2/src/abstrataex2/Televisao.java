package abstrataex2;

public class Televisao extends Movel{
	
	private double polegadas;
	private boolean ligado;
	
	public Televisao(double polegadas, boolean ligado) {
		super();
		this.polegadas = polegadas;
		this.ligado = ligado;
	}
	
	public void ligar() {
		if(ligado == false) {
			ligado = true;
			System.out.println("Ligando...");
		}else{
			System.out.println("Já está ligado");
		}
	}
	
	public void desligar() {
		if(ligado == true) {
			ligado = false;
			System.out.println("Desligando...");
		}else{
			System.out.println("Já está desligado");
		}
	}
	
	public double getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
}
