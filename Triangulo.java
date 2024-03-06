package exercicio0603;

import java.util.Scanner;

public class Triangulo {
	public static void main (String[]args) {
	
	//TODO Auto-generated method stub
	//Variaveis
	
	float area, base, altura;
	
	//Instaciar classe Scanner
			
	Scanner ler = new Scanner(System.in);
	
	//Entrada de dados

			System.out.println("Informe a base : ");
			base= ler.nextFloat();
			
			System.out.println("Informe a altura: ");
			altura= ler.nextFloat();
			

			// Processamento
			
			
			area = (base*altura)/2;
			
			//saida
			

			  System.out.println( "A Área do triangulo é:" +area);

}
}
