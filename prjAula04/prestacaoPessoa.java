package prjAula06;
import java.util.Scanner;

public class prestacaoPessoa {
	public static void main(String[] args) {
		
		//criando um comando leia
		Scanner ler = new Scanner(System.in);
		
		//declarando variáveis
		double valorTaxa, tempoAtraso, valorPrestacao,valorTaxaPrestacao;
		
		System.out.println("Digite o valor inicial da prestação:");
		valorPrestacao = ler.nextDouble(); //lendo o atraso em dias
		
		System.out.println("Digite o tempo de atraso da prestação:");
		tempoAtraso = ler.nextDouble(); //lendo o atraso em dias
		
		System.out.println("Digite a taxa a ser cobrada por dia:");
		valorTaxa = ler.nextDouble(); //lendo valor a taxa

		valorTaxaPrestacao =  valorPrestacao+(valorPrestacao*(valorTaxa/100)*tempoAtraso); //calculando a prestação com atraso
		
		System.out.println("O valor da prestação a ser paga com atraso é: "+valorTaxaPrestacao);
		
		ler.close();	
		
	}

}