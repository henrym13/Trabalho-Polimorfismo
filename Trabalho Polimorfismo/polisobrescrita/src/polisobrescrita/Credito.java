package polisobrescrita;

public class Credito extends Pagamento{
	
	private String num_cartao;
	private int cod_seg;
	private static int taxa = 2;
	
	// dinheiro disponível = limite
	
	public Credito(double dinheiro_disp, double valor, String n_pagador, String n_cretor, String num_cartao,
			int cod_seg) {
		super(dinheiro_disp, valor, n_pagador, n_cretor);
		this.num_cartao = num_cartao;
		this.cod_seg = cod_seg;
	}
	
	@Override
	public void pagar() {
		if(dinheiro_disp >= valor + taxa) {
			System.out.println("O pagamento foi feito com sucesso !!");
			dinheiro_disp = dinheiro_disp - (valor + taxa);
		}else {
			System.out.println("Saldo Indisponível !!");
		}
	}
	
	public String getNum_cartao() {
		return num_cartao;
	}
	
	public void setNum_cartao(String num_cartao) {
		this.num_cartao = num_cartao;
	}
	
	public int getCod_seg() {
		return cod_seg;
	}
	
	public void setCod_seg(int cod_seg) {
		this.cod_seg = cod_seg;
	}

	@Override
	public void exibir() {
		super.exibir();
		
	}
	
	
	
}
