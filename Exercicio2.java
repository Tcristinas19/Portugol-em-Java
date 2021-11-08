package br.com.generation.exerciciosport;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idade;
		
		System.out.println("Há quantos dias você brilha? ");
		dias = leia.nextInt();
		
		anos = (dias / 365);
		meses = ((dias % 365) / 30);
		dias = ((dias % 365) % 30);
		
		System.out.println("Você brilhou o mundo há " + anos + " anos, " + meses + " meses e " + dias + " dias.");
		
		leia.close();
		

	}

}
