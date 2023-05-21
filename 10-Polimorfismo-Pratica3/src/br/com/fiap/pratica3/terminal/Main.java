package br.com.fiap.pratica3.terminal;
import br.com.fiap.pratica3.model.*;


public class Main {
	
	public static void main(String[] args) {
		Titular titular = new Titular("Diogo Dias", "51414514256");
		ContaCorrente cc = new ContaCorrente(1500, titular, 5865, "4564637327", 1000);
		ContaPoupanca cp = new ContaPoupanca(2000, titular, 5865, "4524534534", 15);
		
		cc.depositar(500);
		cc.exibirSaldo();
		
		cc.sacar(300);
		cc.exibirSaldo();
		
		cp.depositar(500);
		cp.exibirSaldo();
		
		cp.sacar(300);
		cp.exibirSaldo();
	}
	
}
