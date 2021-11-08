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
		
		System.out.println("A soma de a com b é: " + soma);
		
		sub = a - b;
		
		System.out.println("A subtração de a com b é: " + sub);
		
		div = a / b;
		
		System.out.println("A divisão de a com b é: " + div);
		
		mult = a * b;
		
		System.out.println("A multiplicação de a com b é: " + mult);
		
		leia.close();

	}

}
