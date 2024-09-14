package Aula3;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		/*
		
		//Entreda
		
		System.out.println("Exemplos de operacoes aritmeticas ");
		
		System.out.println("Digite um numero qualquer : ");
		
		float num1 = teclado.nextFloat();
		
		System.out.println("Digite outro numero qualquer : ");
		
		float num2 = teclado.nextFloat();
		
		// Processamento
		
		float  num1menosnum2 = num1 - num2;
		
		float num1vezesnum2 = num1 * num2;
		
		float num1divnum2 = num1 / num2;
		
		float num1restonum2 = (int) (num1 % num2) ;
	
		//saida
		
		System.out.printf("O produto de %.2f e menos de %.2f é %.2f:\n ", num1 , num2 , num1menosnum2);
		System.out.printf("O produto de %.2f e vezes de %.2f é %.2f:\n ", num1 , num2 , num1vezesnum2);
		System.out.printf("O produto de %.2f e dividido por %.2f é %.2f:\n ", num1 , num2 , num1divnum2);
		   // Usando %d para o valor inteiro do resto
        System.out.printf("O produto de %.2f e resto de %.2f é %d:%n", num1, num2, num1restonum2);
		
        
        */
		//Codigo acima nao funcionou
        
        // CHAT GPT

        System.out.print("Digite um numero qualquer : ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite outro numero qualquer : ");
        double num2 = scanner.nextDouble();

        double produto = num1 * num2;
        double divisao = num1 / num2;
        int resto = (int) (num1 % num2); // Converter o resto para um inteiro

        System.out.printf("O produto de %.2f e menos de %.2f é %.2f:%n", num1, num2, produto);
        System.out.printf("O produto de %.2f e vezes de %.2f é %.2f:%n", num1, num2, produto);
        System.out.printf("O produto de %.2f e dividido por %.2f é %.2f:%n", num1, num2, divisao);
        // Usando %d para o valor inteiro do resto
        System.out.printf("O produto de %.2f e resto de %.2f é %d:%n", num1, num2, resto);

	}

}
