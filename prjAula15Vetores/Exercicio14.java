package prjAula14ExerciciosVetor;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		final int TAM = 10;
		int a[], b[], i;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for (i = 0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º vetor de A");
			a[i] = leia.nextInt();
		}
		
		for (i=0;i<TAM;i++) {
			if (a[i] % 2 == 0) {
				b[i] = 1;
			}else {
				b[i] = 0;
			}
		}
		

   	 System.out.print("B = [ ");
	 for (i=0;i<TAM;i++) {
		 System.out.print(b[i]+" ");
	 }
	 System.out.println(" ]");
	 
	 leia.close();
		

	}

}
