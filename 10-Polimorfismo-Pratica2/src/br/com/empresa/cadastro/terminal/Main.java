package br.com.empresa.cadastro.terminal;
import br.com.empresa.cadastro.entidades.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cadastro");
		System.out.println("Digite seu nome");
		String nome = scan.next() + scan.nextLine();
		
		System.out.println("informe seu titulo");
		String titulo = scan.next() + scan.nextLine();
		
		Cliente cliente = new Cliente(nome, titulo);
		System.out.println(cliente.exibirNomeFormatado());
	}
	
}
