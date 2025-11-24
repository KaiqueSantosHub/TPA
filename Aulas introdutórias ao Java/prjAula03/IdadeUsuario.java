package prjAula02;
import java.util.Scanner;

public class IdadeUsuario {
	public static void main(String[] args) {
		//Criando o comando leia
		Scanner leia = new Scanner(System.in);
		
		//Variaveis
		int anoNascimento, anoAtual, idade;
		
		System.out.println("Digite o seu ano de nascimento:");
		anoNascimento = leia.nextInt(); //lendo o ano de nascimento
		
		System.out.println("Digite o ano atual:");
		anoAtual = leia.nextInt(); //lendo o ano atual
		
		idade = anoAtual-anoNascimento; //calculando a idade
		System.out.println("Sua idade é: "+idade);
		
		leia.close();
	}
}
