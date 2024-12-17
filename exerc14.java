package Lista03Repeticao;
import java.util.Scanner;
public class exerc14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 14.	Faça um programa que peça 10 números inteiros
		//calcule e mostre a quantidade de números pares e a quantidade de números ímpares;
	
		Scanner input = new Scanner(System.in);
		int par=0;
		int impar=0;
		
		for (int i=1;i<=10;i++) {
			System.out.println("Digite o numero "+i+"º :");
			int numero = input.nextInt();
			
		if (numero%2==0 ) {
			par++; }
		else {
			impar++;}
		}
		System.out.println("Quantidade PARES: "+par);
		System.out.println("Quantidade IMPARES: "+impar);
	
	
	}
	
}
