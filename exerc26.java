package Lista03Repeticao;
import java.util.Scanner;
public class exerc26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 26. Numa eleição existem três candidatos. 
		//Faça um programa que peça o número total de eleitores. 
		//Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato
		
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        
        for (int i = 1; i <= totalEleitores; i++) {
            System.out.println("\nEleitor " + i + ", digite seu voto ( Candidato 1, 2 ou 3 ):");
            
            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    System.out.println("Voto inválido!");
            }
        }

        System.out.println("\nResultados da Votação:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");
    }
}
