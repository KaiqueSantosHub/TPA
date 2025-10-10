package prjAula;
import java.util.Scanner;

public class avaliacaoAluno {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		
		//Declarando variáveis
		double n1,n2,n3,n4,mi,nm,ex;
		
		System.out.println("Leia a primeira nota:");
		n1 = leia.nextDouble();
		
		System.out.println("Leia a segunda nota:");
		n2 = leia.nextDouble();
		
		System.out.println("Leia a terceira nota:");
		n3 = leia.nextDouble();
		
		System.out.println("Leia a quarta nota:");
		n4 = leia.nextDouble();
		
		mi = (n1+n2+n3+n4)/4;
		
		System.out.println("A média inicial é: "+mi);
		
		if (mi>=7) {
			System.out.println("Aprovado");
		}else if (mi<5) {
			System.out.println("Reprovado");
		} else {
			System.out.println("O aluno está de exame");
			System.out.println("Leia a nota do exame");
			ex = leia.nextDouble();
			
			nm = (mi+ex)/2;
	         System.out.println("Sua nova média é: "+nm);
	         
	         if  (nm>=7){
	        	 System.out.println("Aprovado em exame");
	         }else {
        		 System.out.println("Reprovado em exame");
        	 }
		}
	}
}
