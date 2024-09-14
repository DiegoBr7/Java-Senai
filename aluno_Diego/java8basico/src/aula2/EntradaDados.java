package aula2;

import java.util.Scanner; //importar a biblioteca scanner

public class EntradaDados {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine() ; 
        System.out.println("Digite o nota do alien : ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota do alien %s é %.1f \n",nome ,nota);
        
	}
}
