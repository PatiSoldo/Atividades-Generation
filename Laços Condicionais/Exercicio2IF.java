package javatech;

import java.util.Scanner;

public class Exercicio2if { 

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		int A = leia.nextInt();
		System.out.println("\nDigite o valor de B: ");
		int B = leia.nextInt();
		System.out.println("\nDigite o valor de C: ");
		int C = leia.nextInt();
		int soma = A+B;
		
		if(soma>C) {
			System.out.println("A soma de A+B é maior que C. ");
		}
		else if (soma<C){
			System.out.println("A soma de A+B é menor que C. ");
		}
		else {
			System.out.println("A soma de A+B é igual a C. ");
		}
		

	}

}
