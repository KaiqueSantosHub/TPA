package prjAula02;
import java.util.Scanner;

public class InversaoAeB {
	public static void main(String[] args) {
	
		//Criando comando leia
		Scanner leia = new Scanner (System.in);
		
		int a, b, c;
		 
		System.out.println("Digite o valor de A:");
		a = leia.nextInt(); // lendo valor de A
		
		System.out.println("Digite o valor de B:");
		b = leia.nextInt(); //lendo o valor de B
		
		//Invertendo os valores de A e B
		c = b;
		b = a;
		a = c;
		
		System.out.println("O valor de A é: "+a); //valor de A convertido
		
		System.out.println("O valor de B é: "+b); //valor de B convertido
		
		leia.close();
		
		
	}
}
