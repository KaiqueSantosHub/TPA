package prjAula14ExerciciosVetor;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		final int TAM = 5;
		int a[], i, x;
		boolean encontrado = false;
		
		a = new int[TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"º número vetor de A");
			a[i] = leia.nextInt();
		}
		
		System.out.println();
		
	    System.out.println("Digite o número para a busca: ");
	    x = leia.nextInt();
		
		for (i=0;i<TAM;i++) {
			
			if (a[i]==x) {
				encontrado = true;
				break;
			}
		      
			}
		
		if (encontrado ) {
			System.out.println("O número "+x+" foi encontrado dentro do vetor A");
		
			}else {
				System.out.println("O número "+x+" não foi encontrado dentro do vetor A");
			}
		
		leia.close();
			
		}

	}


