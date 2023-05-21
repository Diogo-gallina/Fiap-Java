package br.com.fiap.pratica1.model;

public class Tecnologo extends Formacao{
	private boolean planoEstendido;

	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}
	
	public double calcularMensalidade(double fator) {
		return super.getDuracao() * fator * 600;
	}

	@Override
	public String toString() {
		return "Tecnologo [planoEstendido=" + planoEstendido + "]";
	}

	public boolean getPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
}
