package Exercicios_Repeticao;

import java.util.Scanner;

public class Ex06_repeticao {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
		
		
		int numero;
		double media, multiplos = 0.0, soma = 0.0;
		
		
		do {
			System.out.println("Digite um n�mero inteiro: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				multiplos++;
				soma = soma + numero;
			}
		}
		
		while(numero != 0);
		
		media = soma / multiplos;
			
		System.out.println("A m�dia dos n�meros digitados que s�o m�ltiplos de 3 �: " + media);

	}

}
