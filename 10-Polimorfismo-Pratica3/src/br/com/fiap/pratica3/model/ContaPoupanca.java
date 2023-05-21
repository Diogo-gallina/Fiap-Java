package br.com.fiap.pratica3.model;

public class ContaPoupanca extends ContaBancaria{
	private double taxaJuros;
	
	public ContaPoupanca(double saldo, Titular titular, int agencia, String numeroConta, double taxaJuros) {
		super(saldo, titular, agencia, numeroConta);
		this.taxaJuros = taxaJuros;
	}

	public void atualizarSaldo() {
		double novoSaldo = super.getSaldo() + (super.getSaldo() * (taxaJuros/100));
		super.setSaldo(novoSaldo);
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	
}
