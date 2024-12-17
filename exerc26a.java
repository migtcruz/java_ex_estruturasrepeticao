package Lista03Repeticao;
import java.util.Scanner;
public class exerc26a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// 26. Numa eleição existem três candidatos. 
		//Faça um programa que peça o número total de eleitores. 
		//Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato
		
		
		Scanner scanner = new Scanner(System.in);

	        System.out.print("Número total de eleitores: ");
	        int totalEleitores = scanner.nextInt();

	        int[] votos = new int[3]; // Array para armazenar os votos dos candidatos

	        for (int i = 0; i < totalEleitores; i++) {
	            System.out.println("Eleitor " + (i + 1) + ":");
	            System.out.println("Digite o número do candidato (1, 2 ou 3): ");
	            int voto = scanner.nextInt();

	            // Verifica se o voto é válido (1, 2 ou 3)
	            if (voto >= 1 && voto <= 3) {
	                votos[voto-1 ]++; // Incrementa o número de votos do candidato correspondente
	            } else {
	                System.out.println("Voto inválido. Vote novamente.");
	                i--; // Decrementa o contador para repetir a votação
	            }
	        }

	        // Exibe o número de votos de cada candidato
	        for (int i = 0; i < votos.length; i++) {
	            System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos.");
	        }

	        scanner.close();
	    }
	}
