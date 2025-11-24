package prjAula08;
import java.util.Scanner;

public class SalarioUsuario {
	public static void main(String [] args) {
		
		//criando comando leia
		Scanner leia = new Scanner (System.in);
		
		//declarando variáveis
		double SalarioUsuario, DescontoIrpf;
		
		System.out.println("Escreva seu salário:");
		SalarioUsuario = leia.nextDouble();
		
		if (SalarioUsuario<1434.59) {
			System.out.println("Você não terá desconto do IRPF");
            }

		else if (SalarioUsuario>=1434.60 && SalarioUsuario<2150.00) {
			DescontoIrpf = SalarioUsuario*7.5/100-107.59;
					System.out.print("Seu desconto do IRPF será de: "+DescontoIrpf);
				}
			
			else if (SalarioUsuario>=2150.01 && SalarioUsuario<2866.70) {
				DescontoIrpf = SalarioUsuario*15/100-268.84;
					System.out.print("Seu desconto do IRPF será de: "+DescontoIrpf);
			 }
			
		else if (SalarioUsuario>=2866.71 && SalarioUsuario<3582.00) {
			DescontoIrpf = SalarioUsuario*22.5/100-483.84;
			System.out.print("Seu desconto do IRPF será de: "+DescontoIrpf);
		}	
		
		else  {
			DescontoIrpf = SalarioUsuario*27.5/100-662.94;
			System.out.print("Seu desconto do IRPF será de: "+DescontoIrpf);
		}
		
		leia.close();
	}

}
