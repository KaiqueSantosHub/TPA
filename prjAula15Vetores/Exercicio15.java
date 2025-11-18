package prjAula14ExerciciosVetor;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		final int TAM = 10;
		int a[],b[],c[],i;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º vetor de A");
			a[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º vetor de B");
			b[i] = leia.nextInt();
		}
		
		for (i=0;i<TAM;i++) {
			if (a[i]>b[i]) {
				c[i] = 1;
			} else if (a[i]==b[i]) {
				c[i] = 0;
			}else {
				c[i] = -1;
			}
		}
		
		 System.out.print("C = [ ");
		 for (i=0;i<TAM;i++) {
			 System.out.print(c[i]+" ");
		 }
		 System.out.println(" ]");
		 
		 leia.close();



	}

	
}
