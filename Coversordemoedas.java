package exercicio0603;

import java.util.Scanner;

public class Coversordemoedas {
		public static void main (String[]args) {
			//TODO Auto-generated method stub
			//Variaveis
			
			float real = 0,euro,dolar,yen;
			
			//Instaciar classe Scanner
					
			Scanner ler = new Scanner(System.in);
			
			//Entrada de dados
			
			        System.out.println("quantos reais voce quer converter: ");
			        real= ler.nextFloat();
					System.out.println("Informe a quantia em reais para a conversão: ");
					dolar= ler.nextFloat();
					System.out.println("Informe a quantia em reais para a conversão: ");
					euro= ler.nextFloat();
					System.out.println("Informe a quantia em reais para a conversão: ");
					yen= ler.nextFloat();

					// Processamento
					
					dolar = (float) (real*4.94);
					euro = (float) (real*5.37);
					yen = (float) (real*0.033);
					
					
					//saida
					

					  System.out.println( "1 dolar é igual a um :" +dolar );
					  System.out.println( "1 dolar é igual a um :" +euro);
					  System.out.println( "1 dolar é igual a um :" +yen );
		}
}
					 
