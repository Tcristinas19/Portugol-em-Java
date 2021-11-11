package ExerciciosAula04;

import java.util.Scanner;

public class Exercicio04_vetorematriz {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int valor[][] = new int[3][3], somav = 0, somapd = 0;
	
	for(int l = 0; l < 3; l++) {
		for(int c = 0; c < 3; c++) {
			
			System.out.println("\nDigite os valores da matriz: ");
			valor[l][c] = leia.nextInt();
		}
	}
	
	for(int l = 0; l < 3; l++) {
		for(int c = 0; c < 3; c++) {
			
			somav = somav + valor[l][c];
			somapd = (valor[0][0] + valor [1][1] + valor[2][2]);
			
		}
	}
	
		System.out.println("\nA soma dos valores é de: " + somav + "\n");
		System.out.println("\nA soma da primeira diagonal é de: " + somapd + ".\n");
		
		
	}

}
