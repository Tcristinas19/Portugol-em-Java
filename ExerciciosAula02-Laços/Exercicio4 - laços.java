package ExerciciosAula02;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, raiz, pot = 0;
		
		System.out.println("Digite o n�mero: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			raiz = (int) Math.sqrt(numero);
			
			System.out.println("O n�mero " + numero + " � par e sua raiz �: " + raiz + ".");		
		}
		else {
			pot = (int) Math.pow(numero, 2);
			
			System.out.println("O n�mero " + numero + " � �mpar e sua raiz �: " + pot + ".");
			
		}
		
		leia.close();	
	}

}
