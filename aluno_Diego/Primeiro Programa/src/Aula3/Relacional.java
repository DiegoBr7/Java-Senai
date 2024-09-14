package Aula3;

import java.util.Scanner;

public class Relacional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número : ");
		int n1 = teclado.nextInt();
		System.out.println("Iforme o segundo numero : ");
		int n2 = teclado.nextInt();
		
		
		//Processamento
		
		boolean igualdade = (n1 == n2);  //testa a igualdade
		boolean maior = (n1 > n2);
		boolean menor = (n1 < n2);
		boolean diferente = (n1 != n2);
		boolean menorigual = (n1 <= n2);
	
	
		//Saida
		
		System.out.printf("igualdade entre %d == %d resulta em %b \n", n1,n2,igualdade);
		System.out.printf("igualdade entre %d > %d resulta em %b \n", n1,n2,maior);
		System.out.printf("igualdade entre %d < %d resulta em %b \n", n1,n2,menor);
		System.out.printf("igualdade entre %d != %d resulta em %b \n", n1,n2,diferente);
		System.out.printf("igualdade entre %d <= %d resulta em %b \n", n1,n2,menorigual);
	
	}

}
