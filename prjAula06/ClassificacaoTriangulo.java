package prjAula08;
import java.util.Scanner;

public class ClassificacaoTriangulo {
	public static void main(String [] args) {
		
		//criando comando leia
		Scanner leia = new Scanner (System.in);
		
		//declarando variáveis 
		double a, b, c;
		
		System.out.println( "Coloque a primeira aresta do triângulo:");
		a = leia.nextDouble();
		
		System.out.println("Coloque a segunda aresta do triângulo:");	
		b = leia.nextDouble();
		
		System.out.println("Coloque a terceira aresta do triângulo:");
		c = leia.nextDouble();
	
		
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Forma um:");
			
			 if  (a==b && b==c) {
					System.out.println("Triângulo Equlátero");
				}
				
				else if (a!=b && b!=c && c!=a) {
					System.out.println("Triângulo Escaleno");
				}
				
				else {
					System.out.println("Triângulo Isósceles");
				}
		
			}
		
		 else {
			 System.out.println("Não forma um triângulo!");
		 }
			
		leia.close();
		
	}

}
