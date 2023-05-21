package br.com.fiap.pratica3.model;

public class ContaBancaria {
	private double saldo;
	private Titular titular;
	private int agencia;
	private String numeroConta;
	
	public ContaBancaria() {}
	
	public ContaBancaria(double saldo, Titular titular, int agencia, String numeroConta) {
		this.saldo = saldo;
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}
	

	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
}
