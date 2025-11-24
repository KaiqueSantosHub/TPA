package prjAula02;
import java.util.Scanner;

public class VolumeCubo {
	public static void main(String[] args) {
		
		//Criando o comando leia:
		Scanner leia = new Scanner(System.in);
		
		//Declarando as variáveis:
		double volume, lado;
		
		System.out.println("Digite o lado do cubo:");
		lado = leia.nextDouble(); //leia o lado
		
		volume = lado*lado*lado; //calculo do volume
		System.out.println("O volume do cubo é: "+volume);
		
		leia.close();
	}
}
