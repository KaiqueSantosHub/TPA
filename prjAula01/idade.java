package prjAula;
import java.util.Scanner;

public class idade {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		//Declarando variáveis
		int idade1, idade2, idade3, idade4, idade5;
		double qntMaior, qntMenor, porcentagemMaior, porcentagemMenor;;
		
		qntMaior = 0;
		qntMenor = 0;
		
		System.out.println("Digite a primeira idade:");
		idade1 = leia.nextInt();
		
		System.out.println("Digite a segunda idade:");
		idade2 = leia.nextInt();
		
		System.out.println("Digite a terceira idade:");
		idade3 = leia.nextInt();
		
		System.out.println("Digite a quarta idade:");
		idade4 = leia.nextInt();
		
		System.out.println("Digite a quinta idade:");
		idade5 = leia.nextInt();
		
		if (idade1>=18) {
			System.out.println("Maior de idade");
			qntMaior = qntMaior+1;
		}else {
			System.out.println("Menor de idade");
			qntMenor = qntMenor+1;
		}
		
		if (idade2>=18) {
			System.out.println("Maior de idade");
			qntMaior = qntMaior+1;
		}else {
			System.out.println("Menor de idade");
			qntMenor = qntMenor+1;
		}
		
		if (idade3>=18) {
			System.out.println("Maior de idade");
			qntMaior = qntMaior+1;
		}else {
			System.out.println("Menor de idade");
			qntMenor = qntMenor+1;
		}
		
		if (idade4>=18) {
			System.out.println("Maior de idade");
			qntMaior = qntMaior+1;
		}else {
			System.out.println("Menor de idade");
			qntMenor = qntMenor+1;
		}
		
		if (idade5>=18) {
			System.out.println("Maior de idade");
			qntMaior = qntMaior+1;
		}else {
			System.out.println("Menor de idade");
			qntMenor = qntMenor+1;
		}
		
		System.out.println("A quantidade de pessoas maiores de idade é: "+qntMaior);
		System.out.println("A quantidade de pessoas menores de idade é: "+qntMenor);
		
		porcentagemMaior = (qntMaior/5)*100;
		porcentagemMenor = (qntMenor/5)*100;
		
		System.out.println("A porcentagem de pessoas maiores de idade é: "+porcentagemMaior+"%");
		System.out.println("A porcentagem de pessoas menores de idade é: "+porcentagemMenor+"%");
	}
}
