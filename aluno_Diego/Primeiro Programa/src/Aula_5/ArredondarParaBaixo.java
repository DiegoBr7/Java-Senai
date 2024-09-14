package Aula_5;

import java.util.Scanner;
import java.util.Locale;

public class ArredondarParaBaixo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		teclado.useLocale(Locale.US);
		
		//Entrada
		
		System.out.println("\nIforme sua nota : ");
		
		float nota = teclado.nextFloat();  //Armazenar na variavel float
		
		//Processamento e Saida
		
		System.out.println("A nota original é : " + nota);
		System.out.println();
		System.out.println("Nota arredonda para baixo : " + Math.floor(nota));
	}

}
