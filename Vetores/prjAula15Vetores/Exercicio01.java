package prjAula14ExerciciosVetor;

import java.util.Scanner;

public class ElementoPareImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		final int TAM = 5;
		int a[], b[],i, j = 0;
		
		 a = new int[TAM];
		 b = new int[TAM];
		 
		 for (i=0;i<TAM;i++) {
          System.out.println("Digite o "+(i+1)+"º número");
			 a[i] = leia.nextInt();
		 }
		 
		 for (i=0;i<TAM;i++) {
			 
	          if (a[i] % 2 ==0) {
	        	  b[j] = a[i];
	        	 j++;
	          }
	          
		 }
	        	
	     	 for (i=0;i<TAM;i++) {
				 
		          if (a[i] % 2 != 0) {
		        	  b[j] = a[i];
		        	 j++;
		          }
	          
			 }
		 
	     	 System.out.println("Organizando em pares e ímpares o vetor B fica: ");
	     	 System.out.print("B = [ ");
		 for (i=0;i<TAM;i++) {
			 System.out.print(b[i]+" ");
		 }
		 System.out.println(" ]");
		 
		 

		 }

	}

