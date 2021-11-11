package ExerciciosAula04;

import java.util.Scanner;

//Um dado é lançado 10 vezes e o valor correspondente é anotado. faça um programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
// imprima a médica aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
public class Exercicio02_vetorematriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dado[] = new int[10], maiorp = 0, ocmaiorp = 0;
		double media = 0.0, somalanc = 0.0;
		
			for(int l = 0; l <= 9; l++) {
				System.out.println("\nDigite o " + (l + 1) + "º de lançamentos do dado: ");
				dado[l] = leia.nextInt();
				
				somalanc += dado[l];
				
				if(maiorp < dado[l]) {
					maiorp = dado[l];
				}
				media = somalanc / 10;
			}
			
			System.out.println("\nA média aritmética dos lançamento é de: " + media + "\n");
			for(int l = 0; l <= 9; l++) {
				if(dado[l] == maiorp) {
					
					ocmaiorp++;
				}
				System.out.println("\nOs lançamentos dos dados: " + dado[l] + "\n");
				
			}
			System.out.println("\nA maior pontuação do dado é: " + ocmaiorp);
			leia.close();

	}

}
