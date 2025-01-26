package polisobrecarga;

public class Crianca extends Pessoa{
	
	public void dormir(boolean modo_dizer) {
		if(modo_dizer = false) {
			System.out.println("NÃO!");
		}else {
			System.out.println("*calmo vai até a cama*");
		}
	}
	
	public void dormir(int hora) {
		if(hora > 20) {
			System.out.println("*boceja e vai até a cama");
		}else {
			System.out.println("'Não tô com sono'");
		}
	}

	public void dormir(String quem_disse) {
		if(quem_disse.equals("Mãe") || quem_disse.equals("Pai")){
			System.out.println("(calmo vai até a cama)");
		}else {
			System.out.println("NÃO!");
		}
	}

}
