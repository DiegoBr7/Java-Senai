package Aula_5;

import java.util.Scanner;

public class PedacoDaFrase {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		//Entrada 
		
		System.out.println("Insira uma frase ");
		String frase = scn.nextLine();
		
		
		//Processamento e Saida
		
		System.out.println("A frase inserida foi : " + frase);
		
		System.out.println("(0 , 2): " + frase.substring(0,2));
		
		System.out.println("(0 , 8): " + frase.substring(0,8));
		
		System.out.println("(9 , 11): " + frase.substring(9,11));
		
		System.out.println("(12 , 14): " + frase.substring(12,14));

	}

}
