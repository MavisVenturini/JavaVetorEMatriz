import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner inVetor = new Scanner(System.in);
		double [] vetor = new double[5];
		double maiorNota = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Pontuacao da atividade " + (i+1));
			vetor[i] = inVetor.nextDouble();	
			if(maiorNota < vetor[i]) {
				maiorNota = vetor[i];
			}
		}
		System.out.println("A maior nota de atividade inserida foi: " + maiorNota);			
		
	}

}
/*Faça um programa que crie um vetor por leitura com 5 valores 
de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação 
e a apresente.*/