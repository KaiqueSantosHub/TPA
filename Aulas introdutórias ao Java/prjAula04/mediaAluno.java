package prjAula06;
import java.util.Scanner;

public class mediaAluno {
	public static void main(String[] args) {
		
		//criando um comando leia
		Scanner ler = new Scanner(System.in);
		
		//declarando variáveis
		double usuario1, usuario2, usuario3, usuario4, media;
		
		System.out.println("Digite a nota do primeiro usuário:");
		usuario1 = ler.nextDouble(); //lendo usuario1
		
		System.out.println("Digite a nota do segundo usuário:");
		usuario2 = ler.nextDouble(); //lendo usuario2
		
		System.out.println("Digite a nota do terceiro usuário:");
		usuario3 = ler.nextDouble(); //lendo usuario3
		
		System.out.println("Digite a nota do quarto usuário:");
		usuario4 = ler.nextDouble(); //lendo usuario4
		
		media = (usuario1+usuario2+usuario3+usuario4)/4; //calculando média do usuário
		
		System.out.println("A média dos 4 usuários é: "+media);
		
		ler.close();	
		
	}

}
