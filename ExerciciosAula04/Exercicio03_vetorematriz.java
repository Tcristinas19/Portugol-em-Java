package ExerciciosAula04;

import java.util.Scanner;
//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
//das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//posição das matrizes N1 e N2.

public class Exercicio03_vetorematriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1[][] = new int [4][6];
		int n2[][] = new int [4][6];
		int m1[][] = new int [4][6];
		int m2[][] = new int [4][6];
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.println("Digite os valores de N1: ");
				n1[l][c] = leia.nextInt();
				System.out.println("Digite os valores de N2: ");
				n2[l][c] = leia.nextInt();
				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.println("\nMatriz M1: " + m1[l][c]);
				System.out.println("\nMatriz M2: " + m2[l][c]);
			}
		}
		leia.close();
		
	}

}
