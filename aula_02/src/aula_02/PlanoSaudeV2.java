package aula_02;

import java.util.Scanner;

public class PlanoSaudeV2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int faixa;
		
		System.out.println("Digite um numero correspondente a sua faixa etária(idade): ");
		System.out.println("-----------Faixa Etária-----------");
		System.out.println("1 - \taté 10 anos");
		System.out.println("2 - \tde 10 a 29 anos");
		System.out.println("3 - \tde 29 a 45 anos");
		System.out.println("4 - \tde 45 a 59 anos");
		System.out.println("5 - \tde 59 a 65 anos");
		System.out.println("6 - \tacima de 65 anos");
		System.out.println("-------------------------------------------------");
		faixa = leia.nextInt();
		
		switch(faixa) {
		
		case 1:
			System.out.println("O valor do plano de saúde será de R$100,00");
			break;
		case 2:
			System.out.println("O valor do plano de saúde será de R$200,00");
			break;
		case 3:
			System.out.println("O valor do plano de saúde será de R$300,00");
			break;
		case 4:
			System.out.println("O valor do plano de saúde será de R$500,00");
			break;
		case 5:
			System.out.println("O valor do plano de saúde será de R$600,00");
			break;
		case 6:
			System.out.println("O valor do plano de saúde será de R$1000,00");
			break;
		default:
			System.out.println("Faixa etária invalida!");
		}

	}

}
