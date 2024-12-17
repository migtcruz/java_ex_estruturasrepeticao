package Lista03Repeticao;
import java.util.Scanner;
public class exerc10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10.	Faça um programa que receba 2 números inteiros e 
		// 		gere os números inteiros que estão no intervalo compreendido por eles;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro : ");	
		int num1 = input.nextInt();
		System.out.println("Digite outro numero inteiro :");
		
		int num2 = input.nextInt();
		
		int maiornum = Math.max(num1, num2);
		int menornum = Math.min(num1, num2);
		
		System.out.println("Números no intervalo entre " + menornum + " e " + maiornum + " são:");
		
		for( int i = menornum; i<=maiornum; i++) {
			System.out.print(" " +i);
		}
		
	}

}
