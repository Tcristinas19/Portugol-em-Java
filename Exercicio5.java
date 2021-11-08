package br.com.generation.exerciciosport;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int notaA, notaB, notaC, notaAtotal, notaBtotal, notaCtotal, media;
		
		System.out.println("Primeira nota: ");
		notaA = leia.nextInt();
		
		System.out.println("Segunda nota: ");
		notaB = leia.nextInt();
		
		System.out.println("Terceira nota: ");
		notaC = leia.nextInt();
		
		notaAtotal = (notaA * 2);
		notaBtotal = (notaB * 3);
		notaCtotal = (notaB * 5);
		
		media = (notaAtotal + notaBtotal + notaCtotal) / 10;
		
		System.out.println("O aluno tem média: " + media + ".");
		
		leia.close();
 
	}

}
