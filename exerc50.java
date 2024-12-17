package Lista03Repeticao;
import java.util.Scanner;
public class exerc50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//50. Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, 
		//Faça um programa que calcule o valor de H com N termos.
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Informe a QTDE de termos (N): ");
	        int n = scanner.nextInt();

	        double h = 0.0;

	        for (int i = 1; i <= n; i++) {
	            h += 1.0 / i;
	        }
	        System.out.println("\nO valor de H é: " + h);
	  
	    }
	}