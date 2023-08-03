package ExercicioWhile1;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		int contMenor21 = 0;
		int contMaior50 = 0;
		
		System.out.println("\nDigite sua idade:  ");
		idade = leia.nextInt();
				
		while (idade >0) {
			
		
			if(idade < 21) {
			  contMenor21++;
			  
			}else if(idade>50) {
			   contMaior50++;
			   
			}
				System.out.println("\nDigite sua idade: ");
				idade = leia.nextInt();
		    }			
			System.out.println("\nTotal de pessoas menores de 21 anos:" +contMenor21);
			System.out.println("\nTotal de pessoas maiores de 50 anos:" +contMaior50);
  	}

 }
