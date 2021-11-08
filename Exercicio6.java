package br.com.generation.exerciciosport;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x1, y1, x2, y2; 
		double valorA, valorB, d;
		
		System.out.println("Qual o valor x do primeiro ponto? ");
		x1 = leia.nextInt();
		
		System.out.println("Qual o valor y no primeiro ponto? ");
		y1 = leia.nextInt();
		
		System.out.println("Qual o valor x do segundo ponto? ");
		x2 = leia.nextInt();
		
		System.out.println("Qual o valor y do segundo ponto? ");
		y2 = leia.nextInt();
		
		valorA = Math.pow((x2-x1), 2.0);
		valorB = Math.pow((y2-y1), 2.0);
		
		d = Math.sqrt((valorA + valorB));
		
		System.out.println("A distância entre os pontos é de " + d + ".");
		
		leia.close();
		

	}

}
