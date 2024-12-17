package Lista03Repeticao;

import java.util.Scanner;

public class exerc08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 8.	Faça um programa que leia 5 números informe a soma e a média dos números;
		
		Scanner input = new Scanner(System.in);
		//Array
		double[]numeros= new double[5];
		
		double soma = 0;
		double media = 0;
		
		for (int i=0; i<numeros.length;i++) {
			System.out.print("Informe o "+(i+1)+"º Numero : ");
			numeros[i]=input.nextDouble();
			soma += numeros[i];	
			}
		
		 media = soma / numeros.length;
	        
	        // Exibindo a soma e a média
	        System.out.println("Soma: " + soma);
	        System.out.println("Média: " + media);
	        
	        input.close();
				
	}

}
