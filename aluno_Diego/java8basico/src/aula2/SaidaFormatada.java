package aula2;

public class SaidaFormatada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 	definicao de variaveis
		
		
		
		float nota = 9.6f; // definir e inicializar a variavel
		
		String nome = "José Diego  "; // defini a variavel string
		
		// Processamento e Saída 
		System.out.println("\nSua nota é : " + nota); // concatenar é a mesma coisa que juntar
		
		System.out.print("\nSua nota é : " + nota); // concatenar é a mesma coisa que juntar
		
		// Um exemplo de saida formatada
		
		System.out.printf("\n\nA sua nota é %.2f \n" , nota);
		
		// Mais um jeito de saída 
		System.out.format("Saiba que a sua nota é %.2f \n" , nota );
	
	    //Personalizando a saida
		System.out.printf("A nota de %s é %.2f \n " , nome , nota);
		System.out.printf("A nota de %s é %.2f \n " , nome , nota);
	
		
		System.out.println("%");
	}

}
