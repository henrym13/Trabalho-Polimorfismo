package abstrataex1;

public class Galinha extends Animal{

	public Galinha(String nome) {
		super(nome);

	}

	@Override
	public void comer(boolean comida_disp) {
		if(comida_disp = true) {
			System.out.println("A galinha " + nome + " está comendo");
		}else {
			System.out.println("Falta alimento !!");
		}
	}

}
