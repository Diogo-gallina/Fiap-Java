package br.com.fiap.pratica1.model;

public class Medio extends Formacao{
	private String tipo;

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public double calcularMensalidade(double fator) {
		return super.getDuracao() * fator * 500;
	}
	
	@Override
	public String toString() {
		return "Medio [tipo=" + tipo + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
