package interfaceabstrata;

public class TocaCD extends EquipamentoMusica implements LigarDesligar{
	
	private String modelo;
	private boolean ligada;
	
	public TocaCD(String nome, String marca, String modelo, boolean ligada) {
		super(nome, marca);
		this.modelo = modelo;
		this.ligada = ligada;
	}

	public void desligar() {
		if(ligada == true) {
			System.out.println("Desligando...");
			ligada = false;
		}else{
			System.out.println("Já está Desligado");
		}
	}

	public void ligar() {
		if(ligada == false) {
			ligada = true;
			System.out.println("Ligando...");
		}else{
			System.out.println("Já está ligado");
		}
	}

	@Override
	public void exibir() {
		super.exibir();
		System.out.println("Modelo: " + this.modelo);
	} 
	
	
}
