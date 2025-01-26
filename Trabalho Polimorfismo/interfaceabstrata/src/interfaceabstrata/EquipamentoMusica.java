package interfaceabstrata;

public abstract class EquipamentoMusica {
	
	protected String nome;
	protected String marca;
	
	public EquipamentoMusica(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void exibir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Marca: " + this.marca);
	}
}
