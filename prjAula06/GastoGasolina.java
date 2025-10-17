package prjAula08;
import java.util.Scanner;

public class GastoGasolina {
	public static void main(String[] args) {
		
		//criando comando leia
		Scanner leia = new Scanner (System.in);
		
		//declarando varáveis
		double distanciaPercorrida, tanque, gastoMedio;
		
		System.out.println("Escreva a distância percorrida (em km);");
		distanciaPercorrida = leia.nextDouble();
		
		System.out.println("Escreva a capacidade do tanque (em litro) do veículo:");
		tanque = leia.nextDouble();
		
		gastoMedio = distanciaPercorrida/tanque;
		
		if (gastoMedio<=10) {
			System.out.println("seu veículo é econômico: "+gastoMedio+"Km/L");
		}
		
		else {
			System.out.println("seu veículo não é econômico: "+gastoMedio+" Km/L");
		}
			
	 leia.close();
		
		
	}

}
