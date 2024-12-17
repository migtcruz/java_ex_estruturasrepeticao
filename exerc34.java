package Lista03Repeticao;

import java.util.Scanner;

public class exerc34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//34. Os números primos possuem várias aplicações dentro da Computação, 
		//por exemplo na Criptografia. Um número primo é aquele que é divisível 
		//apenas por um e por ele mesmo. Faça um programa que peça um número inteiro
		//e determine se ele é ou não um número primo.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um Numero inteiro: ");
		int num = input.nextInt();
		
		boolean numprimo = true;
		
		if (num<=1) {
			numprimo=false;
		}else {
			for(int i=2; i<=num/2; i++) {
				if (num % i == 0) {
					numprimo = false;
					break;
				}
			}
		}
	      if (numprimo) {
	            System.out.println(num + " é um número primo.");
	        } else {
	            System.out.println(num + " não é um número primo.");
	        }
				
	}

}
