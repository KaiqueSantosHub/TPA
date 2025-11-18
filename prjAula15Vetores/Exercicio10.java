package prjAula14ExerciciosVetor;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		final int TAM = 10;
		int a[], b[], c[], i, j=0;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º número do vetor A");
			 a[i] = leia.nextInt();
		}
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º número do vetor B");
			 b[i] = leia.nextInt();
		}
		
		for (i=0;i<TAM;i++) {
			if (a[i] != b[i])  {
				c[j] = a[i];
				j++;
			}
		}
		

		 
    	 System.out.print("C = [ ");
	 for (i=0;i<TAM;i++) {
		 System.out.print(c[i]+" ");
	 }
	 System.out.println(" ]");
		


	}

}
