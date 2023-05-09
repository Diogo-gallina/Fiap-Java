package br.com.fiap.tds.model.produto;

public class Produto {
	private int codigo;
	private double preco;
	
	public Produto(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
