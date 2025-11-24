package prjAula14ExerciciosVetor;

import java.util.Scanner;

public class FatorialVetorA {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		final int TAM =5;
		int a[], b[], i, fatorial = 1, j;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º número");
			 a[i] = leia.nextInt();
		}
		
		for (i=0;i<TAM;i++) {
			
			fatorial = 1;
			 for(j=1;j<=a[i];j++) {
				 fatorial = fatorial*j;
				 b[i] = fatorial;
			 }
			
		}
		
		 System.out.println("O fatorial dos índices do vetor A é: ");
     	 System.out.print("B = [ ");
	 for (i=0;i<TAM;i++) {
		 System.out.print(b[i]+" ");
	 }
	 System.out.println(" ]");
		
	 	leia.close();
	}

}
