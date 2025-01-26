package polisobrecarga;

public class Adulto extends Pessoa{
	
	public void dormir(int hora) {
		if(hora > 22) {
			System.out.println("*boceja e vai até a cama*");
		}else {
			System.out.println("Não tô com sono");
		}
	}
	
	public void dormir(boolean coisa_fzr) {
		if(coisa_fzr = false) {
			System.out.println("*boceja e vai até a cama*");
		}else {
			System.out.println("*emburrecido vai fazer o que falta*");
		}
	}
}
