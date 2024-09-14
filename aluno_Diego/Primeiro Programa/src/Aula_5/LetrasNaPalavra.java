package Aula_5;

import java.util.Scanner;

public class LetrasNaPalavra {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		
		System.out.println("Forneca uma palavra com pelo menos 4 letras: ");
		String palavra = teclado.nextLine();
		
		//Processo e Saida
		
		System.out.println("Palavra: " + palavra);
		System.out.println("\nCaracter 1: " + palavra.charAt(0));
		System.out.println("\nCaracter 2: " + palavra.charAt(1));
		System.out.println("\nCaracter 3: " + palavra.charAt(2));
		System.out.println("\nCaracter 4: " + palavra.charAt(3));
		System.out.println("\nCaracter 5: " + palavra.charAt(4));
		System.out.println("\nCaracter 6: " + palavra.charAt(5));
		System.out.println("\nCaracter 7 : " + palavra.charAt(6));
		

	}

}
