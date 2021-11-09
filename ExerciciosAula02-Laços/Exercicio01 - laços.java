package ExerciciosAula02;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor1 = 0, valor2 = 0, valor3 = 0;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = leia.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = leia.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		valor3 = leia.nextInt();
		
		if(valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor é: " + valor1);	
		}
		if(valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior valor é: " + valor2);
		}
		if(valor3 > valor1 && valor3 > valor2) {
			System.out.println("O maior valor é: " + valor3);
		}
		
		leia.close();
		
		

	}

}
