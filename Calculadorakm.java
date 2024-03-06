package exercicio0603;

import java.util.Scanner;

public class Calculadorakm {
	public static void main (String[]args) {
		//TODO Auto-generated method stub
		//Variaveis
		
		double litro, distancia, consumo, consumomedio, gasolina;
		
		//Instaciar classe Scanner
				
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados

				System.out.println("Informe o valor de gasolina por litro: ");
				litro= ler.nextDouble();
				
				System.out.println("Informe quantos km rodados: ");
				distancia= ler.nextDouble();
				
				System.out.println("Informe o consumo por km: ");
				consumo= ler.nextDouble();
				

				// Processamento
				
				
				consumomedio = distancia/consumo;
				gasolina = consumomedio*litro;
						
				//saida
				

				  System.out.println( "O valor do consumomedio é:" +consumomedio);
	
				  System.out.println( "quantidade de litros de gasolina gasta é:" +gasolina);
	}
	
}
