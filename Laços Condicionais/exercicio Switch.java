package exercicio5;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

			System.out.println("\nDigite o código do produto: (número do 1 ao 6):  ");
			int codigoProduto = scanner.nextInt();

			System.out.println("Quantidade: ");
			int quantidade = scanner.nextInt();
			
			String produto = null;
			double precoUnitario = 1;
			
			switch (codigoProduto) {
					case 1: produto = "Cachorro Quente";
			        precoUnitario = 10.00;
			        break;
					case 2: produto = "X-Salada";
					precoUnitario = 15.00;
			        break;
					case 3: produto = "X-Bacon";
			        precoUnitario = 18.00;
			        break;
					case 4: produto = "Bauru";
			        precoUnitario = 12.00;
			        break;
					case 5: produto = "Refrigerante";
			        precoUnitario = 8.00;
			        break;
					case 6: produto = "Suco de laranja";
			        precoUnitario = 13.00;
			        break;
			        default:
			        	System.out.println("Código do produto inválido!");
			        	return;
			       
	        
			}
	        
	        double valorTotal = quantidade*precoUnitario;
	        System.out.println("\nProduto: "+produto);
	        System.out.println("Valor total:R$ "+valorTotal);
	        
	        scanner.close();
			 
			
		}
	}


