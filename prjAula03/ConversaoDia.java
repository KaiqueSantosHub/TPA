package prjAula02;
import java.util.Scanner;

public class ConversaoDia {
	public static void main(String[] args) {
		//criando o comando leia
		Scanner leia = new Scanner(System.in);
		double dia, mes, ano;
		
		System.out.println("Digite o número de dias: ");
		dia = leia.nextDouble(); //ler número de dias
		mes = dia / 30; //calculo de mes
		ano = dia / 365; //calculo de ano
		
		System.out.println("Dias convertidos em meses: "+mes);
		System.out.println("Dias convertidos em anos: "+ano);
		
		leia.close();
	}
}
 