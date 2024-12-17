package Lista03Repeticao;
import java.util.Scanner;
public class exerc18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//18. Faça um programa que, dado um conjunto de N números, 
		//determine o menor valor, o maior valor e a soma dos valores.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite qtde de numeros do conjunto:");
		int n=input.nextInt();
		
		int menor=Integer.MAX_VALUE;
		int maior=Integer.MIN_VALUE;
		int soma=0;
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite o valor do numero"+(i+1)+" : ");
			int valor = input.nextInt();
			if (valor<menor) {
				menor=valor ;}
			if (valor>maior) {
				maior=valor;}
			soma +=valor;
		}
		
		 System.out.println("MENOR valor: " + menor);
	        System.out.println("MAIOR valor: " + maior);
	        System.out.println("SOMA dos valores: " + soma);
		
		
	}

}