package polisobrescrita;

public class Pagamento {
	
	protected double dinheiro_disp;
	protected double valor;
	protected String n_pagador;
	protected String n_cretor;
	
	public Pagamento(double dinheiro_disp, double valor, String n_pagador, String n_cretor) {
		super();
		this.dinheiro_disp = dinheiro_disp;
		this.valor = valor;
		this.n_pagador = n_pagador;
		this.n_cretor = n_cretor;
	}

	public void pagar() {
		if(dinheiro_disp >= valor) {
			System.out.println("O pagamento foi feito com sucesso !!");
			dinheiro_disp = dinheiro_disp - valor;
		}else {
			System.out.println("Saldo Indisponível !!");
		}
	}
	
	public double getDinheiro_disp() {
		return dinheiro_disp;
	}

	public void setDinheiro_disp(double dinheiro_disp) {
		this.dinheiro_disp = dinheiro_disp;
	}

	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getN_pagador() {
		return n_pagador;
	}
	
	public void setN_pagador(String n_pagador) {
		this.n_pagador = n_pagador;
	}
	
	public String getN_cretor() {
		return n_cretor;
	}
	
	public void setN_cretor(String n_cretor) {
		this.n_cretor = n_cretor;
	}
	
	public void exibir() {
		System.out.println("Dinheiro disponível: " + this.dinheiro_disp);
		System.out.println("Valor: " + this.valor);
		System.out.println("Nome do pagador: " + this.n_pagador);
		System.out.println("Nome do cretor : " + this.n_cretor);
	}
	
}
