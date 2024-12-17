package Lista03Repeticao;
import java.util.Scanner;

public class exerc13 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			
		//13 .Faça um programa que peça dois números, base e expoente, 
		//calcule e mostre o primeiro número elevado ao segundo número.
		//Não utilize a função de potência da linguagem
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a base :");
		double base = input.nextDouble();
		System.out.println("Digite o expoente :");
		int expoente = input.nextInt();
		
		double resultado = 1;
		
		for(int i=0; i<expoente; i++) {
			resultado=resultado*base;
			}
		
		System.out.println("Resultado do numero com base: "+base+" e expoente: "+expoente+" = "+resultado);
		
		
		
		
		
		
	}

}
