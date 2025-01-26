package interfaceabstrata;

public class Main {

	public static void main(String[] args) {
		
		TocaCD tcd1 = new TocaCD("Survivor2000", "EquipMusics","SRD-13562", false);
		Vinil act1 = new Vinil("Renassaince ACT I", "Universe", 2, "Universe Store");
		
		act1.exibir();
		System.out.println("  ");
		
		tcd1.ligar();
		System.out.println(" ");
		tcd1.exibir();
		System.out.println(" ");
		tcd1.desligar();
				
	}

}
