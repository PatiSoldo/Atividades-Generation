package Exercicio5;

import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero, somaPositivos = 0;	
		
		do  {
			 System.out.println("Digite um número: ");
			 numero = leia.nextInt();
			 
			 if (numero>0) {
				 somaPositivos += numero;
			 }
		}while (numero != 0);
		
		System.out.println("A soma dos números positivos é: "+somaPositivos);
			 
		}
		
	}

