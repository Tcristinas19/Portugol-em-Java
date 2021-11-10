package Exercicios_Repeticao;

public class Ex01_repeticao {

	public static void main(String[] args) {
		
		System.out.println("Números de mil até 1999 que dividido por 11 sobra 5: ");
		for(int i = 1000; i < 2000; i++) {
			if(i % 11 == 5) {
				
			System.out.println(i);
			}
		}

	}

}
