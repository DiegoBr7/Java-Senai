package Aula_5;

public class SenhaAleatoria {

	public static void main(String[] args) {
		String senha = ""; //cria a variavel senha 
		
		// Processamento
		for (int i = 1 ; i <= 10 ; i ++) { //repetir 10x 
			int num = (int) (Math.random() * 10) ; //gerar um  numero aleatorio de 0 a 10
			senha += num ;
			
			
		}
		
		//Saída
		
		System.out.println("\nA senha gerada é: " + senha);
		System.out.println("Boa Sorte!");
		
		
		

	}

}
