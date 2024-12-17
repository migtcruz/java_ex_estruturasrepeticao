package Lista03Repeticao;
import java.util.Scanner;
public class exerc04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4.Supondo que a população de um país a seja da ordem de 80000 habitantes
		//como a taxa anual de crescimento de 3% e que a população de 
		//b seja 200000 habitantes como a taxa de crescimento de um e meio por cento 
		//faça um programa que calcule e escreva o número de anos necessários 
		//para que a população do país A ultrapasse 
		//ou iguale a população do país B mantidas as taxas de crescimento;
		Scanner input = new Scanner(System.in);
		    // População inicial dos países
	        int populacaoA = 80000;
	        int populacaoB = 200000;
	
	        // Taxas de crescimento anual
	        double taxaCrescimentoA = 0.03; // 3%
	        double taxaCrescimentoB = 0.015; // 1.5%
	
	        int anos = 0;
	
	        // Loop para calcular o número de anos necessários
	        while (populacaoA <= populacaoB) {
	            // Incrementa as populações de acordo com as taxas de crescimento
	            populacaoA += (int) (populacaoA * taxaCrescimentoA);
	            populacaoB += (int) (populacaoB * taxaCrescimentoB);
	            anos++;
	        }
	
	        System.out.println("Número de anos necessários: " + anos);
	    }
	}




	
	
	