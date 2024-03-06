package exercicio0603;

import java.util.Scanner;

public class Exercicios {
	public static void main (String[]args) {
		//TODO Auto-generated method stub
		//Variaveis
		
		int Fahrenheit, Celsius;
		
		//Instaciar classe Scanner
				
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados

				System.out.println("Informe a temperatura em Fahrenheit: ");
				Fahrenheit= ler.nextInt();

				// Processamento
				
				Celsius = ((Fahrenheit-32)*5)/9;
				 
				//saida
				  System.out.println( "O valor da temperatura em celsius é:" +Celsius);
	}
	

}
