package ExerciciosAula04;

import java.util.Scanner;

//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
public class Exercicio01_vetorematriz {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
	  double pontuacao[] = new double[5], maiorp = 0.0;
	  int i; 
	  
	  for(i = 0; i <= 4; i++) {
		  System.out.println("Digite a " + (i + 1) + "�, pontua��o: ");
		  pontuacao[i] = leia.nextDouble();
		  
	  if(maiorp < pontuacao[i]) {
		 maiorp = pontuacao[i]; 
	  }
	  
	  System.out.println("\nA maior pontua��o �: " + maiorp);
	  }
	  
	  leia.close();
		
	}

}
