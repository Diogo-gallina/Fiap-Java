package br.com.fiap.pratica1.model;

public class Bacharelado extends Formacao{
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public Bacharelado(String descricao, int periodo, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(descricao, periodo, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
	public double calcularMensalidade(double fator) {
		return (super.getDuracao() * fator * 600) + (cargaHorariaEstagio * 12);
	}
	
	@Override
	public String toString() {
		return "Bacharelado \n"
				+ "\ndescricao=" + super.getDescricao()
				+ "\nperiodo=" + super.getPeriodo()
				+ "\nmensalidade=" + super.getMensalidade()
				+ "\nduracao=" + super.getDuracao()
				+ "\nprojetoConclusao=" + projetoConclusao 
				+ "\ncargaHorariaEstagio=" + cargaHorariaEstagio;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
}
