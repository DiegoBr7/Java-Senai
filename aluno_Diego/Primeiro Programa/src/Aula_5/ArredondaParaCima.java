package Aula_5;

import java.util.Scanner;

public class ArredondaParaCima {

	public static void main(String[] args) {
		
		
		final float LOTACAO_ONIBUS = 50.0f;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantas pessoas vao embarcar no RockinRio ? ");
		
		int numeroPassageiros = teclado.nextInt();
		
		float qtdeOnibus = numeroPassageiros / LOTACAO_ONIBUS ; 
		
		System.out.println("\n uantidade de passageiros : " + numeroPassageiros);
		System.out.println();
		System.out.println("\nQuantidade calculada: "+ qtdeOnibus);
		System.out.println();
		System.out.println("\nQuantidade de ônibus necessários : " + Math.ceil(qtdeOnibus));
		
		teclado.close();
		

	}

}
