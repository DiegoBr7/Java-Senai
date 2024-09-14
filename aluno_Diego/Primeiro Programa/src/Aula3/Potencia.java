package Aula3;

import java.util.Locale;
import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		
		//Entrada 
		
		System.out.println("Digite um numero qualquer : ");
		
		double numero = teclado.nextDouble();
		
		//Potencia
		
		double p = Math.pow(numero, 3);
		int p2 = (int) Math.pow(numero, 2);
		System.out.println("O quadrado de "+ numero + "é = " + p);
		System.out.println("O quadrado de "+ numero + "é = " + p2);
		System.out.println(p);

	}

}
