package Lista03Repeticao;
import java.util.Scanner;
public class exerc36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//36. Desenvolva um programa que faça a tabuada de um número qualquer inteiro 
		//que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar 
		//em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, 
		//conforme exemplo abaixo:
			//Montar a tabuada de: 5
			//Começar por: 4
			//Terminar em: 7
			//Vou montar a tabuada de 5 começando em 4 e terminando em 7:
			//5 X 4 = 20
			//5 X 5 = 25
		
		Scanner scanner = new Scanner(System.in);
	       	   
	        System.out.print("Informe um numero inteiro para montarmos a tabuada : ");
	        int numero = scanner.nextInt();
	        	     
	        System.out.print("Iniciar por: ");
	        int inicio = scanner.nextInt();
	        	      
	        System.out.print("Terminar em: ");
	        int fim = scanner.nextInt();
	        
	        if (inicio > fim) {
	            System.out.println("O valor inicial deve ser menor ou igual ao valor final.");
	        } else {
	            System.out.println("Tabuada de " + numero + " >> inicio " + inicio + " >> termino em " + fim + ":");
	            for (int i = inicio; i <= fim; i++) {
	                System.out.println(numero + " X " + i + " = " + (numero * i));
	            }
	        }
	        
	       
	    }
	}
	