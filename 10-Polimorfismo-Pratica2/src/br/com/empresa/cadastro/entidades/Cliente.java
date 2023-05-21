package br.com.empresa.cadastro.entidades;

public class Cliente extends Pessoa{
	private String titulo;

	public Cliente(String nome, String titulo) {
		super(nome);
		this.titulo = titulo;
	}
	

	public String exibirNomeFormatado() {
		return titulo.toUpperCase() + " - " + super.getNome().toUpperCase();
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
