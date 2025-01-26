package interfaceabstrata;

public class Vinil extends EquipamentoMusica{
	
	private int num_discos;
	private String loja;
	
	public Vinil(String nome, String marca, int num_discos, String loja) {
		super(nome, marca);
		this.num_discos = num_discos;
		this.loja = loja;
	}
	
	public int getNum_discos() {
		return num_discos;
	}
	public void setNum_discos(int num_discos) {
		this.num_discos = num_discos;
	}
	public String getLoja() {
		return loja;
	}
	public void setLoja(String loja) {
		this.loja = loja;
	}

	@Override
	public void exibir() {
		super.exibir();
		System.out.println("Número de Discos: " + this.num_discos);
		System.out.println("Loja: " + this.loja);
	}
	
	
}
