package prjAula12FaçaEnquanto;

import java.util.Scanner;

import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); //criando comando leia
        int anterior = 0, proximo , atual = 1, i = 1,termo;
        
        System.out.print("Digite quantos termos da série de Fibonacci deseja: ");
        termo = leia.nextInt();

 
       
    do {
    	 System.out.print(atual+ " ");
    	proximo = anterior + atual;
    	 anterior = atual;
    	 atual = proximo  ;
    	i++;
    }while (i<termo);
   
    }
}

    
    
    


		