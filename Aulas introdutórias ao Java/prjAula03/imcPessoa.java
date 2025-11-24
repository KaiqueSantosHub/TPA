package prjAula02;
import java.util.Scanner;

public class imcPessoa {
	public static void main(String[] args) {
		
		//Criando o comando leia
		Scanner leia = new Scanner(System.in);
		
		//Declarando as variáveis
		double imc, altura, peso;
		
		System.out.println("Digite sua altura: ");
		altura = leia.nextDouble(); //Lendo a altura
		
		System.out.println("Digite seu peso: ");
		peso = leia.nextDouble(); //Lendo o peso
		
		imc = peso/(altura*altura); //Calculo IMC
		System.out.println("Seu IMC é igual a: "+imc);
		
		leia.close();
	}
}
