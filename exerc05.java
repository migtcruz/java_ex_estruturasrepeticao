package Lista03Repeticao;
import java.util.Scanner;

public class exerc05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.Altere o programa anterior permitindo ao usuário informar 
		//as populações e as taxas de crescimento iniciais valide a  entrada e permita repetir a operação;


		Scanner input = new Scanner(System.in);
		  // Definição das populações iniciais e taxas de crescimento
			int populacaoA, populacaoB;
			 int anos = 0;
		        double taxaCrescimentoB = 0.015; // 1.5%
		        double taxaCrescimentoA = 0.03; // 3%
	      do {
			System.out.println("População de A deve ser menor que População de B");
	        System.out.println("=================================================");
			System.out.println("Informe População A:");
			populacaoA = input.nextInt();
	        System.out.println("Informe População B:");
	        populacaoB = input.nextInt();
	              } while (populacaoA>populacaoB);
	            
	        // Enquanto a população de A for menor ou igual a de B, continue calculando
	        while (populacaoA <= populacaoB) {
	          // Crescimento da população A
	        	populacaoA += populacaoA * taxaCrescimentoA; 
	         // Crescimento da população B 
	            populacaoB += populacaoB * taxaCrescimentoB; 
	          // Incremento do número de anos 
	            anos++;      }
	        // Exibindo o resultado
	        System.out.println(("São necessários ")+anos+(" anos para a população de A ultrapassar ou igualar a de B "));
	    }

	}


	
	
	

