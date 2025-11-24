package prjAula14ExerciciosVetor;

import java.util.Scanner;

public class TabuadaVetorA {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		final int TAM = 5;
		int a[], i, j;
		
		a = new int[TAM];
		
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º número");
			 a[i] = leia.nextInt();
		}
		
		for (i=0;i<TAM;i++) {
			
			for (j =1;j<11;j++) {
				System.out.println(a[i]+" X "+j+" = "+a[i]*j);
				 
			}
			 
		}
		
		leia.close();
		

	}

}
