package br.com.fiap.pratica1.model;

public class Tecnologo extends Formacao{
	private boolean planoEstendido;

	public Tecnologo(String descricao, int periodo, int duracao, boolean planoEstendido) {
		super(descricao, periodo, duracao);
		this.planoEstendido = planoEstendido;
	}
	
	public double calcularMensalidade(double fator) {
		return super.getDuracao() * fator * 600;
	}

	@Override
	public String toString() {
		return "Tecnologo \n"
				+ "\ndescricao: " + super.getDescricao()
				+ "\nperiodo=" + super.getPeriodo()
				+ "\nmensalidade=" + super.getMensalidade()
				+ "\nduracao=" + super.getDuracao()
				+ "\nplanoEstendido=" + planoEstendido;
	}

	public boolean getPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
}
