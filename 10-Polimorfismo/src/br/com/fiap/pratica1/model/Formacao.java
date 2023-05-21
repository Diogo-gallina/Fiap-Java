package br.com.fiap.pratica1.model;

public class Formacao {
	private String descricao;
	private int periodo;
	private double mensalidade;
	private int duracao;
	
	public Formacao() {	
	}
	
	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	//Metodos Classe Pai
	
	public void definirDuracao() {
		
	}
	
	public double calcularMedia(double global1, double global2) {
		double media = global1 * 0.4 + global2 * 0.6;
		return media;
	}
	
	public double calcularMedia(double global1, double checkpoint1, double challange1, double global2, double checkpoint2, double challange2) {
		double media = ((global1 + checkpoint1 + challange1) * 0.4) + ((global2 + checkpoint2 + challange2) * 0.6);
		return media;
	}

	public double calcularMedia(double checkpoint1, double checkpoint2, double checkpoint3) {
		double media = 0;
		
		if((checkpoint1 > 10 || checkpoint1 < 0) || (checkpoint2 > 10 || checkpoint2 < 0) || (checkpoint3 > 10 || checkpoint3 < 0)){
			media = 404;
		}else if(checkpoint1 <= checkpoint2 && checkpoint1 <= checkpoint3) {
			media = (checkpoint2 + checkpoint3)/2;
		}else if(checkpoint2 <= checkpoint1 && checkpoint2 <= checkpoint3) {
			media = (checkpoint1 + checkpoint3)/2; 
		}else{
			media = (checkpoint1 + checkpoint2)/2;
		}
		
		return media;
	}



	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
	
	
}
