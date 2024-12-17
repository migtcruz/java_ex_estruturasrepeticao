package Lista03Repeticao;
import java.util.Scanner;
public class exerc24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 24. Faça um programa que calcule o mostre a média aritmética de N notas.

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas a serem inseridas: ");
		int n = input.nextInt();
		double soma = 0;
		
		for (int i=1; i<=n ; i++) {
			System.out.print("Informe a "+i+"º nota:");
			double nota = input.nextDouble();
			soma = soma + nota;			
		}
		double media = soma/n;
		
		System.out.println("A Media Aritmetica das "+n+" notas inseridas é: "+media  );
		
		
		
		
	}

}
