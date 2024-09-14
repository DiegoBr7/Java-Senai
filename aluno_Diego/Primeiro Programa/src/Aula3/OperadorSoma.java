package Aula3;

import java.util.Locale;
import java.util.Scanner;

public class OperadorSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);  // Capturar a entrada via teclado 
		teclado.useLocale(Locale.ENGLISH); 
		//O cara profissa comenta o codigo

		
		//Entrada
		System.out.print("Operacao de Adicao: ");
		System.out.print("Digite um numero: ");
		
		float n1 = teclado.nextFloat();  //armazena a variavel n1
		
		System.out.println("Alien , Digite o outro numero ? ");
		
		float n2 = teclado.nextFloat() ;//armazena a variavel n2
				
		//Processamento
				
				
		float soma = n1 + n2 ;  //armazena a soma de n1 com n2
		
		System.out.println(" A soma de n1 "+ n1 + " + " + n2 + " = " + soma);
		
		
		teclado.close();
		
				
 		 
		
	}

}
