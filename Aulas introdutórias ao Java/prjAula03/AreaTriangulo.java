package prjAula02;
import java.util.Scanner;

public class AreaTriangulo {
	public static void main (String[] args) {
		
		//Criando comando leia
		Scanner leia = new Scanner (System.in);
		
		//Declarando Variável
		double base, altura, area;
		
		System.out.println("Digite a base:");
		base = leia.nextDouble(); //Lendo a base
		
		System.out.println("Digite a altura:");
		altura = leia.nextDouble(); //Lendo a altura
		
		area = (altura*base)/2; //Cálculo área
		System.out.println("A Área é: " +area);
		
		leia.close();
	}
}
