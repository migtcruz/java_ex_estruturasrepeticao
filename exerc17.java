package Lista03Repeticao;
import java.util.Scanner;
public class exerc17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 17. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
		// Ex.: 5!=5.4.3.2.1=120
		
		Scanner input=new Scanner(System.in);
		int numero, fatorial;
		
		System.out.println("Digite um numero inteiro : ");
		numero = input.nextInt();
		
		fatorial=1;
		for(int i = 1; i <= numero; i++) {
			fatorial *= i;
			System.out.print("Fatorial de " + i + "! é : ");
			for (int j = i; j >= 1; j--) {
				if (j== 1) {
					System.out.print(j + " = ");}
				else {   
					System.out.print(j+" x ");}
			
		}
				System.out.println(fatorial);	}
		
	}	
	
	}


