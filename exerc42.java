package Lista03Repeticao;
import java.util.Scanner;
public class exerc42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//42 Faca um programa que leia uma quantidade indeterminada de números positivos e 
		//conte quantos deles estão nos seguintes  intervalos  (0-25], [26-50], [51-75] e [76-100]. 
		//A entrada de dados deverá terminar quando for lido um número negativo.
		
		 Scanner scanner = new Scanner(System.in);

	        int contador0a25 = 0;
	        int contador26a50 = 0;
	        int contador51a75 = 0;
	        int contador76a100 = 0;

	        while (true) {
	            
	            System.out.print("Digite um Nº Positivo (Nº Negativo para sair): ");
	            int numero = scanner.nextInt();
	           
	            if (numero < 0) {
	                break;
	            }
	            
	            if (numero > 0 && numero <= 25) {
	            	contador0a25++;
	            } else if (numero >= 26 && numero <= 50) {
	            	contador26a50++;
	            } else if (numero >= 51 && numero <= 75) {
	            	contador51a75++;
	            } else if (numero >= 76 && numero <= 100) {
	            	contador76a100++;
	            }
	        }
    
	        System.out.println("\nContagem numerica nos intervalos:");
	        System.out.println(" [0-25]: " + contador0a25);
	        System.out.println(" [26-50]: " + contador26a50);
	        System.out.println(" [51-75]: " + contador51a75);
	        System.out.println(" [76-100]: " + contador76a100);

	    }
	}
		

