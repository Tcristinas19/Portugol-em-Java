package br.com.generation.exerciciosport;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idade;
		
		System.out.println("Qual a sua idade? ");
		anos = leia.nextInt();
		
		System.out.println("Quantos meses faz desde o seu último aniversário? ");
		meses = leia.nextInt();
		
		System.out.println("Há quantos dias você completou " + anos + " anos e " + meses + " meses? ");
		dias = leia.nextInt();
		
		idade = (365 * anos) + (30 * meses) + dias;
		
		System.out.println("Você já viveu " + idade + " dias.");
		
		leia.close();
				
				

	}

}
