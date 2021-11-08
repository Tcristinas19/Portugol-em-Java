package br.com.generation.exerciciosport;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, t, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = leia.nextDouble();
		
		System.out.println("Digite o valor de T: ");
		t = leia.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = leia.nextDouble();
		
		x = ((c*t) - (b*f)) / ((a*t) - (b*d));
		y = ((a*f) - (c*d)) / ((a*t) - (b*d));
		
		System.out.println("O valor de X é: " + x + " e o valor de Y é: " + y);
		
		leia.close();
		
	}

}
