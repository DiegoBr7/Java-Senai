package Aula_5;

import java.text.DecimalFormat; //Formatação
import java.util.Locale;  // Iternacionalizacao

public class ConfiguracoesRegionais {

	public static void main(String[] args) {
		// Variaveis
		
		DecimalFormat df = new DecimalFormat();
		Locale local = Locale.getDefault();
	    double valor = 1350.76	;
	if (local.getCountry().equals("BR")) {
		df.applyPattern("R$ #,##0.00");
	}
	
	//Saida
	System.out.println("\n "+ "Configuracoes do Sistema Operacional");
	System.out.println("\nSigla: " + local.getCountry());
	System.out.println("\nIdioma: " + local.getDisplayLanguage());
	System.out.println("\nTeclado " + local.getDisplayName());
	System.out.println("\nValor: " + df.format(valor));
	}

}
