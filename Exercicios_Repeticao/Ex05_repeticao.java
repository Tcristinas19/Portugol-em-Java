package Exercicios_Repeticao;

import java.util.Scanner;

public class Ex05_repeticao {

	public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
		
		
       int numero, soma = 0;
		
		do {
			System.out.println("Digite um n?mero do teclado: ");
			numero = leia.nextInt();
			
			soma = soma + numero;
		}
		
		while(numero != 0);
		
		System.out.println("A soma dos n?meros digitados ?: " + soma);

	}

}
