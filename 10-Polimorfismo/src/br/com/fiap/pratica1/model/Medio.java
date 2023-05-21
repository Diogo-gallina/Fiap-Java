package br.com.fiap.pratica1.model;

public class Medio extends Formacao{
	private String tipo;

	public Medio(String descricao, int periodo, int duracao, String tipo) {
		super(descricao, periodo, duracao);
		this.tipo = tipo;
	}
	
	public double calcularMensalidade(double fator) {
		return super.getDuracao() * fator * 500;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Medio \n"
				+ "\ndescricao=" + super.getDescricao()
				+ "\nperiodo=" + super.getPeriodo()
				+ "\nmensalidade=" + super.getMensalidade()
				+ "\nduracao=" + super.getDuracao()                                                                                                            
				+ "\ntipo=" + tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
