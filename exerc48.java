package Lista03Repeticao;
import java.util.Scanner;
public class exerc48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//48. Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero invertido.
		
		 Scanner scanner = new Scanner(System.in);

	       System.out.print("Digite um número inteiro positivo: ");
	       int numero = scanner.nextInt();
	     
	        if (numero <= 0) {
	            System.out.println("Por favor, digite um número inteiro positivo válido.");
	        } else {
	        	// Converte o número para uma string e o inverte <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	            String numeroInvertido = new StringBuilder(String.valueOf(numero)).reverse().toString();
	                 
	            System.out.println("Número invertido: " + numeroInvertido);
	        }

	
	    }
	}
