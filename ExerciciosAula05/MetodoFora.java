package br.com.generation.metodos;
//Existe uma classe main que pode chamar outros m�todos escrito em outras classes
public class MetodoFora {

	public static String metodo7(int i, int f) {
		String numeroString = "";
		
		for(int c = i; c < f; c++) {
			numeroString += c + " - ";
		}
		
		
		return numeroString;
	}


	}


