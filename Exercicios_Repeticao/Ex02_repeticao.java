package Exercicios_Repeticao;

import java.util.Scanner;

public class Ex02_repeticao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
			
		int n1, n2, n3, n4, n5, n6, n7, n8, n9,n10, i;
		int numero, pares = 0, impares = 0;
		
		System.out.println("Digite dez números a seguir. \n");
		
		for(i = 1; i <= 10; i++) {
		
			System.out.println("Digite o " + i + "º número: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				pares++;		
			}
			
			else {
				impares++;
			}
					
		}
		
		System.out.println("Você digitou " + pares + " números pares e " + impares + " números ímpares.");

	}

}
