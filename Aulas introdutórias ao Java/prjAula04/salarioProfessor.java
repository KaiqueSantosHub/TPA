package prjAula06;
import java.util.Scanner;

public class salarioProfessor {
	public static void main(String[] args) {
		
		//criando um comando leia
		Scanner ler = new Scanner(System.in);
		
		//declarando variáveis
		double salarioLiquido, valorHoraaula,numeroAula, descontoInss;
		
		System.out.println("Digite o valor da hora aula:");
		valorHoraaula = ler.nextDouble(); //lendo hora aula dada
		
		System.out.println("Digite a quantidade de aula dada no mês:");
		numeroAula = ler.nextDouble(); //lendo aula no mês
		
		System.out.println("Digite o valor PERCENTUAL do desconto do INSS:");
		descontoInss = ler.nextDouble(); //lendo o desconto do INSS
		
	    salarioLiquido = (valorHoraaula*numeroAula)-(valorHoraaula*numeroAula*(descontoInss/100));
		
		System.out.println("Seu salário liquído é: "+salarioLiquido);
	
		ler.close();		
	}
}