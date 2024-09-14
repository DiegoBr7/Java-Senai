package Aula_5;

import java.util.Scanner;

public class RetirandoEspacos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com uma frase: ");
		String outraFrase = teclado.nextLine();
		
		outraFrase = "      " + outraFrase + "      ";
		
		// Processamento e Saida 
		
		System.out.println("Com espacos: " + "-" + outraFrase + "-");
		System.out.println("Sem espacos: " + "-" + outraFrase.trim() + "-");
	}

}
