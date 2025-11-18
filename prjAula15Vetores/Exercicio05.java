package prjAula14ExerciciosVetor;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		final int TAM = 10;
		int a[], i, j;
		
		a = new int[TAM];
		
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º número do vetor A");
			 a[i] = leia.nextInt();
		}
		
	   	 
		   	
		for (i=0;i<TAM;i++) {
			System.out.print("Os divisores do elemento "+a[i]+" são: ");
			
			for (j = 1; j<=a[i];j++) {
				
				if (a[i] % j ==  0) {
					System.out.print(j+" ");
					
				}
				
			}
			System.out.println();
		
		   	 
		  
		}

	}

}
