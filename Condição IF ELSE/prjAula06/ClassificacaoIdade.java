package prjAula08;
import java.util.Scanner;

public class ClassificacaoIdade {
	public static void main(String[] args) {
		
		
		//criando comando leia
		Scanner leia = new Scanner (System.in);
		
		//declarando variáveis
		int anoAtual, anoNascimento, idade;
		
		System.out.println("Digite o o ano atual:");
		anoAtual = leia.nextInt();
		
		System.out.println("Digite seu ano de nascimento:");
		anoNascimento = leia.nextInt();
		
		idade = anoAtual-anoNascimento;
		
		
		if (idade<10) {
			System.out.println("Criança de "+idade+" anos");
		}
		
		  if (idade>=10) {
		System.out.println("Adolescente de "+idade+" anos");
		  }
		  
		
		  else if ( idade<18) {
				System.out.println("Adolescente de "+idade+" anos");
		}
		  
		
		 if (idade>=18 ) {
			System.out.println("Adulto de "+idade+" anos");
			}
		 
			else if (idade<60) {
				System.out.println("Adulto de "+idade+" anos");
			}
		
		
		else {
			System.out.println("Idoso de "+idade+" anos");
		}
				
	leia.close();
					
		
  }
	
}
