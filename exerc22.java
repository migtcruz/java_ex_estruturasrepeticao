package Lista03Repeticao;

import java.util.Scanner;

public class exerc22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 22. Altere o programa de cálculo dos números primos, informando,
		//caso o número não seja primo, por quais número ele é divisivel.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um Numero inteiro: ");
		int num = input.nextInt();
		
		boolean numprimo = true;
		String divisor = "";
		
		if (num<=1) {
			numprimo=false;
		}else {
			for(int i=2; i<=num/2; i++) {
				if (num % i == 0) {
					numprimo = false;
					 divisor = divisor + i + ", ";
				}
			}
		}
	      if (numprimo) {
	            System.out.println(num + " é um número primo.");
	        } else {
	            System.out.println(num + " não é um número primo.");
	            System.out.println(+num+ " é divisível por: " + divisor);
	        }
				
	}

}
	