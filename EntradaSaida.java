package br.com.generation.aula01;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma, sub, div, mult;
		
		System.out.println("Escreva o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Escreva o valor de b: ");
		b = leia.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma de a com b �: " + soma);
		
		sub = a - b;
		
		System.out.println("A subtra��o de a com b �: " + sub);
		
		div = a / b;
		
		System.out.println("A divis�o de a com b �: " + div);
		
		mult = a * b;
		
		System.out.println("A multiplica��o de a com b �: " + mult);
		
		leia.close();

	}

}
