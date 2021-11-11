package ExerciciosAula04;

import java.util.Scanner;

//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
public class Exercicio01_vetorematriz {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
	  double pontuacao[] = new double[5], maiorp = 0.0;
	  int i; 
	  
	  for(i = 0; i <= 4; i++) {
		  System.out.println("Digite a " + (i + 1) + "º, pontuação: ");
		  pontuacao[i] = leia.nextDouble();
		  
	  if(maiorp < pontuacao[i]) {
		 maiorp = pontuacao[i]; 
	  }
	  
	  System.out.println("\nA maior pontuação é: " + maiorp);
	  }
	  
	  leia.close();
		
	}

}
