package Lista03Repeticao;
import java.util.Scanner;
public class exerc21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//21. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. 
		//Um número primo é aquele que é divisível somente por ele mesmo e por 1.
		
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
