package Aula_5;

import java.util.Scanner;

public class TransformacoesNaFrase {

	public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  
  //Entrada
  System.out.println("Entre com uma frase : ");
  String frase = scn.nextLine();
  
  // Processo e Saida 
  
  System.out.println("A frase fornecida foi : " + frase);
  System.out.println("A frase maiuscula : " + frase.toUpperCase());
  System.out.println("A frase minuscula : " + frase.toLowerCase());
  

	}

}
