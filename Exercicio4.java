package br.com.generation.exerciciosport;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numeroA, numeroB, numeroC, ab, r, bc, s, d;
		
		System.out.println("Digite o valor de A: ");
		numeroA = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		numeroB = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		numeroC = leia.nextDouble();
		
		ab = (numeroA + numeroB);
		r = Math.pow(ab, 2.0);
		
		bc = (numeroB + numeroC);
		s = Math.pow(bc, 2.0);
		
		d = ((r + s) / 2);
		
		System.out.println("D = r+s/2 resulta em = " + d);
		
		leia.close();
		

	}

}
