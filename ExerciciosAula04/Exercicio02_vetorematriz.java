package ExerciciosAula04;

import java.util.Scanner;

//Um dado � lan�ado 10 vezes e o valor correspondente � anotado. fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
// imprima a m�dica aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
public class Exercicio02_vetorematriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dado[] = new int[10], maiorp = 0, ocmaiorp = 0;
		double media = 0.0, somalanc = 0.0;
		
			for(int l = 0; l <= 9; l++) {
				System.out.println("\nDigite o " + (l + 1) + "� de lan�amentos do dado: ");
				dado[l] = leia.nextInt();
				
				somalanc += dado[l];
				
				if(maiorp < dado[l]) {
					maiorp = dado[l];
				}
				media = somalanc / 10;
			}
			
			System.out.println("\nA m�dia aritm�tica dos lan�amento � de: " + media + "\n");
			for(int l = 0; l <= 9; l++) {
				if(dado[l] == maiorp) {
					
					ocmaiorp++;
				}
				System.out.println("\nOs lan�amentos dos dados: " + dado[l] + "\n");
				
			}
			System.out.println("\nA maior pontua��o do dado �: " + ocmaiorp);
			leia.close();

	}

}
