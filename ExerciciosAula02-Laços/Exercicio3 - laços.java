package ExerciciosAula02;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual a idade? ");
		idade = leia.nextInt();
		
		if(idade < 5) {
			System.out.println("Não possui idade para nenhuma categoria.");
		}
		else if(idade >= 10 && idade <= 14) {
			System.out.println("Idade referente a categoria: Infantil.");	
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Idade referente a categoria: Juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Idade referente a categoria: Adulto");
		}
		else {
			System.out.println("Nenhuma categoria referente a idade.");
		}
		
		leia.close();
	}

}
