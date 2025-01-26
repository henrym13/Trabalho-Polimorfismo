package polisobrecarga;

public class Main {

	public static void main(String[] args) {
		
		Adulto adulto = new Adulto();
		Crianca crianca1 = new Crianca();
		Crianca crianca2 = new Crianca();

		System.out.println("=====Adulto======");
		adulto.dormir(true);
		System.out.println(" ");
		
		System.out.println("=====Criança 1======");
		crianca1.dormir(false);
		System.out.println(" ");
		System.out.println("=====Criança 2======");
		crianca2.dormir(19);
		
	}

}
