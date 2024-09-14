package Aula_5;

import java.util.Scanner;

public class TamanhooDaFrase {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Forneca uma frase : ");
		
		String frase = teclado.nextLine();
		
		//Processamento
		
		int tamanho = frase.length();
		
		//Saída
		
		System.out.println("Frase: " + frase + "\nQuantidade de letras: " + tamanho);
		
		teclado.close();
		
		
		
	}

}
