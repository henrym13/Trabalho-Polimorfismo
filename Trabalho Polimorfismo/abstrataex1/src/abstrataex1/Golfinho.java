package abstrataex1;

public class Golfinho extends Animal{
	
	
	public Golfinho(String nome) {
		super(nome);
	}

	@Override
	public void comer(boolean comida_disp) {
		if(comida_disp = true) {
			System.out.println("O golfinho " + nome + " está comendo");
		}else {
			System.out.println("Falta alimento !!");
		}
	}
	
}
