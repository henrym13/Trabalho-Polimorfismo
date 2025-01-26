package polisobrescrita;

public class Pix extends Pagamento{
	
	private String codigo;

	public Pix(double dinheiro_disp, double valor, String n_pagador, String n_cretor, String codigo) {
		super(dinheiro_disp, valor, n_pagador, n_cretor);
		this.codigo = codigo;
	}
	
	@Override
	public void pagar() {
		if(dinheiro_disp >= valor) {
			System.out.println("O pagamento via pix foi efetuado !!");
			dinheiro_disp = dinheiro_disp - valor;
		}else {
			System.out.println("Saldo Indisponível !!");
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public void exibir() {
		super.exibir();
		System.out.println("Código do pix: " + this.codigo);
	}
	
	
}
