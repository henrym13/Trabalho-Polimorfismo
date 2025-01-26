package abstrataex1;

public abstract class Animal {
	
	protected String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}

	public abstract void comer(boolean comida_disp);
	
	public void dormir() {
		System.out.println(nome + " foi dormir");
	}
}
