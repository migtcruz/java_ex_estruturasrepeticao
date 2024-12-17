package Lista03Repeticao;

import java.util.Scanner;

public class exerc51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXERCICIO REPETIDO <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

	//	51. Faça um programa que mostre os n termos da Série a seguir:
	//		S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
	//		Imprima no final a soma da série.
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Informe a QTDE de termos da série: ");
	        int n = scanner.nextInt();

	        double soma = 0.0;
	        int numerador = 1;
	        int denominador = 1;

	        System.out.print("Série: ");
	        for (int i = 1; i <= n; i++) {
	            if (i > 1) {
	                System.out.print(" + ");
	            }
	            System.out.printf("%d/%d", numerador, denominador);
	            soma += (double) numerador / denominador;
	            numerador++;
	            denominador += 2;
	        }

	        System.out.printf("\nSoma da série: %.2f\n", soma);

	      
	    }
	}
	