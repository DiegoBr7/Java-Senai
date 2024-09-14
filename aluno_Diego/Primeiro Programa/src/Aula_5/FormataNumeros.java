package Aula_5;

import java.text.DecimalFormat ;

public class FormataNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat();

		short idade = 39;

		df.applyPattern("000");
		System.out.println(df.format(idade));

		int quantidade = 19750;

		df.applyPattern("#0,000");
		System.out.println(df.format(quantidade));
		
		int estoque = 4119764;

		df.applyPattern("# , ##0,000");
		System.out.println(df.format(estoque));
	
	
		float altura = 1.74f;
		df.applyPattern("#0.00");
		System.out.println(df.format(altura));
		
		double peso = 80.25;
		df.applyPattern("#0.00");
		System.out.println((df.format(peso)));
		
		
		double valoremreais = 2583.75;
		df.applyPattern("R$ #,##0.00");
		System.out.println(df.format(valoremreais));
	}

}
