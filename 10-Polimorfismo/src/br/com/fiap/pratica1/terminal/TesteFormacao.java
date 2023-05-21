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
			String curso = scan.next() + scan.nextLine();
			
			System.out.println("Em que periodo? "
					+ "\n1 - Matinal "
					+ "\n2 - Noturno");
			int periodo = scan.nextInt();
		
			double mensalidade = 0;
			
			Formacao formacao;
			switch(resposta) {
				case 1:
					System.out.println("Tipo do curso?");
					String tipo = scan.next() + scan.nextLine();
					
					Medio medio = new Medio(curso, periodo, resposta, tipo);
					medio.definirDuracao();
					medio.setMensalidade(medio.calcularMensalidade(10));
					
					System.out.println(medio.toString());
					break;
				case 2:
					System.out.println("Plano estendido? (true/false)");
					boolean planoEstendido = scan.nextBoolean();
					System.out.println();
					Tecnologo tecnologo = new Tecnologo(curso, periodo, resposta, planoEstendido);
					tecnologo.definirDuracao();
					tecnologo.setMensalidade(tecnologo.calcularMensalidade(10));
					
					System.out.println(tecnologo.toString());
					break;
				case 3:
					System.out.println("Qual o nome Projeto de conclusao?");
					String projetoConclusao = scan.next() + scan.nextLine();
					
					if(curso.equals(null)) {
						System.out.println("Descricao não pode ser vazia");
					}
					
					Bacharelado bacharelado = new Bacharelado(curso, periodo, resposta, projetoConclusao, resposta);
					bacharelado.definirDuracao();
					bacharelado.setMensalidade(bacharelado.calcularMensalidade(10));
					
					System.out.println(bacharelado.toString());
					break;
				default:
					System.out.println("Digite uma das opcoes acima!");
					break;
			}
		
		
	}
}
