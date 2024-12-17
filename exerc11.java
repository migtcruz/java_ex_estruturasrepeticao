package Lista03Repeticao;
import java.util.Scanner;
public class exerc11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11.	Altere o programa anterior para mostrar no final a soma dos números;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
	        int numero1 = scanner.nextInt();
	    System.out.print("Digite o segundo número: ");
	        int numero2 = scanner.nextInt();
	        	       
	        int menorNumero = Math.min(numero1, numero2);
	        int maiorNumero = Math.max(numero1, numero2);
	        	        
	        int soma = 0;
	        	       
	        System.out.println("Números no intervalo entre " + menorNumero + " e " + maiorNumero + " são:");
	        for (int i = menorNumero; i <= maiorNumero; i++) {
	            System.out.print(" "+i);
	            soma += i;    }
	        
	  	        System.out.println("\n A soma dos números é: " + soma);
	        
	        scanner.close();
	    }
	}
