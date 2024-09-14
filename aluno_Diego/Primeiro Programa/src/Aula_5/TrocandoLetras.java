package Aula_5;

import java.util.Scanner;

public class TrocandoLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		
		System.out.println("Insira uma frase: ");
		String texto = teclado.nextLine();
		
		//Processamento e Saida 
		
		System.out.println("A frase inserida foi : " + texto);
		
		System.out.println("\n Retirando os espacos: " + texto.replace(" ",""));
		
		System.out.println("\n Substituindo por u: " + texto.replace("a","u"));
		
		
		
		
	}

}
