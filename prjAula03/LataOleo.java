package prjAula02;
import java.util.Scanner;

public class LataOleo {
	public static  void main(String[] args) {
		
		//criando comando leia
		Scanner leia = new Scanner(System.in);
		
		//Declarando variaveis
		double raio, altura, volume;
		
		System.out.println("Digite o Raio: ");
		raio = leia.nextDouble(); //lendo o raio
		
		System.out.println("Digite a Altura ");
		altura = leia.nextDouble();//lendo a altura
		
		volume = 3.14*(raio*raio)*altura; //calculando o volume
		
		System.out.println("O volume da lata de óleo é: "+volume);
		
		leia.close();
		
	}
}
