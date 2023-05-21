package br.com.fiap.pratica3.model;

public class ContaCorrente extends ContaBancaria{
	private double limiteCredito;

	public ContaCorrente(double saldo, Titular titular, int agencia, String numeroConta, double limiteCredito) {
		super(saldo, titular, agencia, numeroConta);
		this.limiteCredito = limiteCredito;
	}

	public String exibirSaldo() {
		return "Saldo: " + super.getSaldo()
		+ "\nLimite: " + limiteCredito;
	}
	
	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
}
