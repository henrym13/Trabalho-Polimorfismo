package polisobrescrita;

public class Main {

	public static void main(String[] args) {

		Pagamento pix = new Pix(1000, 5000, "Henry", "Ana", "123.456.789-00");
		Pagamento credito = new Credito(2000, 500, "Rodrigues", "Natália", "1223 1234 1324 1323", 123);
		
		pix.exibir();
		pix.pagar();
		System.out.println(" ");
		credito.exibir();
		pix.pagar();

	}

}
