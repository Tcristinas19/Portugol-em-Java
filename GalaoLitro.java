package br.com.generation.aula01;

import java.util.Scanner;

public class GalaoLitro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.println("Escreva o valor em gal�es: ");
		galoes = leia.nextInt();
		
		
		litros = galoes * 3.785;
		
		System.out.println(galoes + " gal�es s�o: " + litros + " Litros.");
		
		leia.close();
		
		
	}

}
