package br.com.fiap.empresa.model;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	private String cpf;
	private String nivel;
	
	//aumentar o salario em 2%
	public void aumentarSalario() {
		salario *= 1.02;
	}
	
	//aumentar o sálario de acordo com a porcentagem
	public void aumentarSalario(double porcentagem) {
		salario *= (porcentagem /100 +1);
	}
	
	//Aumenta salário de acordo com nivel: Junior(2000), Plêno(5000), Sênior(8000)
	public void aumentarSalario(String nivel) {
		
		if(nivel.equalsIgnoreCase("junior")) {
			salario = 2000;
		}else if(nivel.equalsIgnoreCase("pleno")) {
			salario = 5000;
		}else if(nivel.equalsIgnoreCase("senior")) {
			salario = 8000;
		}
	}
	
	
	public Funcionario() {
	}
	
	public Funcionario(int id, String nome, double salario, String cpf, String nivel) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.nivel = nivel;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}
