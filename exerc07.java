package Lista03Repeticao;
import java.util.Scanner;
public class exerc07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        //7.Faça um programa que leia 5 números e informe o maior número;
	       
		 // Inicialize a variável para armazenar o maior número com o menor valor possível
	        int maiorNumero = Integer.MIN_VALUE;
	        
	        System.out.println("Digite 5 números:");
	        
        // Loop para ler os 5 números
	        for (int i = 0; i < 5; i++) {
	            int numero = scanner.nextInt();
	            
	    // Verifique se o número atual é maior do que o maior número registrado até agora
	            if (numero > maiorNumero) {
	                maiorNumero = numero; }
	        }
	    // Imprima o maior número
	        System.out.println("O maior número é: " + maiorNumero);
	   
	        scanner.close();
	    }
	}