package br.com.fiap.pratica1.terminal;
import java.util.Scanner;
import br.com.fiap.pratica1.model.*;

public class TesteFormacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

			System.out.println("Qual formacao deseja se cadastrar? "
					+ "\n1 - Medio "
					+ "\n2 - Tecnologo "
					+ "\n3 - Bacharelado");
			int resposta = scan.nextInt();
	
			System.out.println("Qual o nome do curso?");
			String curso = scan.next();
			
			System.out.println("Em que periodo? "
					+ "\n1 - Matinal "
					+ "\n2 - Noturno");
			int periodo = scan.nextInt();
		
			
			switch(resposta) {
				case 1:
					
					Medio medio = new Medio(curso, periodo, resposta, resposta, null);
					break;
				case 2:
					System.out.println("Qual o nome do curso?");
					curso = scan.next();
					
					Tecnologo tecnologo = new Tecnologo(curso, periodo, resposta, resposta, false);
					break;
				case 3:
					System.out.println("Qual o nome do curso?");
					curso = scan.next();
					
					Bacharelado bacharelado = new Bacharelado(curso, periodo, resposta, resposta, null, resposta);
					break;
				default:
					System.out.println("Digite uma das opcoes acima!");
					break;
			}
		
		
	}
}
