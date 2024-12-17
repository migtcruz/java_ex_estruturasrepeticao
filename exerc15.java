package Lista03Repeticao;
import java.util.Scanner;
public class exerc15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 15 . A série de Fibonacci é formada pela sequência 1,1,2,3,5,8,13,21,34,55,...
		//Faça um programa capaz de gerar a série até o n-ésimo termo.
		
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Digite a qtde de termos da série de Fibonacci: ");
	        int n = scanner.nextInt();
	       
	        System.out.println("Série de Fibonacci até o " + n + "-ésimo termo:");
	        for (int i = 1; i <= n; i++) {
	            System.out.print(calculoFibonacci(i) + " "); }
			}
	   
	    public static int calculoFibonacci(int n) {
	    	
	        if (n <= 1) {
	            return n;
	        } else {
	            return calculoFibonacci(n - 1) + calculoFibonacci(n - 2); }
	    }
					
	}


