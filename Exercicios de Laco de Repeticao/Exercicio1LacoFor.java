package ExercicioLacoFor1;

import java.util.Scanner;

public class ExercicioLacoFor1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int scanner1 = 0;
		int numeroMenor = scanner.nextInt();
		
		System.out.println("Digite o segundo número:(deve ser maior que o primeiro): ");
		int numeroMaior = scanner.nextInt();
		
		if(numeroMenor>= numeroMaior) {
			System.out.println("Intervalo inválido! O primeiro número deve ser menor que o segundo.");
			System.exit(0);
		}
		
		System.out.println("Números múltiplos de 3 e 5 dentro do intervalo:");
		
		for (int cont = numeroMenor; cont<= numeroMaior; cont++) {
			if (cont % 3 == 0 && cont % 5 == 0) {
				System.out.println(cont + " ");
			}
		}
		
	}

}
