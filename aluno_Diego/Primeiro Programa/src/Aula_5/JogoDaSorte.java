package Aula_5;

import java.util.Iterator;

public class JogoDaSorte {

	public static void main(String[] args) {
		// Esse codigo gera 4 cartoes com
		// numeros aleatorios para um jogo
		
		for(int jogo = 1 ; jogo <= 4 ; jogo++) {
			String bilhete = "";
			for (int numCartao = 1 ; numCartao <= 6 ; numCartao ++) {
				int ngerado = (int) (Math.random() * 60);
				bilhete += ngerado + " ";
			}
			System.out.println("Os numeros do carao " + jogo + " sao : " + bilhete);
		}

	}

}
