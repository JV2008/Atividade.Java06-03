package exercicio0603;

import java.util.Scanner;

public class Algoritimos {
	public static void main (String[]args) {
		//TODO Auto-generated method stub
		//Variaveis
		
		int A, B,resul1,resul2,resul3,resul4;
		
		//Instaciar classe Scanner
				
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados

				System.out.println("Informe o primeiro valor : ");
				A= ler.nextInt();
				
				System.out.println("Informe o segundo valor: ");
				B= ler.nextInt();
				

				// Processamento
				
				
				resul1 = A+B;
				resul2 = A-B;
				resul3 = A/B;
				resul4 = A*B;
				
				//saida
				

				  System.out.println( "O resultado da soma é:" +resul1);
	
				  System.out.println( "O resultado da subtração é:" +resul2);
				  
				  System.out.println( "O resultado da divisão é:" +resul3);
				  
				  System.out.println( "O resultado da multiplicação é:" +resul4);
	}
	
}
