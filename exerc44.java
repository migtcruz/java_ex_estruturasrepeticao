package Lista03Repeticao;
import java.util.Scanner;
public class exerc44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//44. Em uma eleição presidencial existem quatro candidatos.
		//Os votos são informados por meio de código. Os códigos utilizados são:
		//	1 , 2, 3, 4 - Votos para os respectivos candidatos 
		//	(você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
		//	5 - Voto Nulo
		//	6 - Voto em Branco
		//	Faça um programa que calcule e mostre:
		//	• O total de votos para cada candidato;
		//	• O total de votos nulos;
		//	• O total de votos em branco;
		//	• A percentagem de votos nulos sobre o total de votos;
		//	• A percentagem de votos em branco sobre o total de votos.
		// finalizar o conjunto de votos tem-se o valor zero.

		Scanner scanner = new Scanner(System.in);
       
        String[] candidatos = {"Jose", "João", "Maria", "Ana"};
        int[] votosCandidatos = new int[4];
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;

        while (true) {
          
            System.out.print("Digite o código do voto (0 para encerrar): ");
            int codigoVoto = scanner.nextInt();
          
            if (codigoVoto == 0) {
                break;
            }
        
            switch (codigoVoto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votosCandidatos[codigoVoto - 1]++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.");
                    continue;
            }
            totalVotos++;
        }
        System.out.println("\nResultado da Eleição:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.printf("Total de votos Candidato %s: %d\n", candidatos[i], votosCandidatos[i]);
        }
        System.out.printf("Total de votos nulos: %d\n", votosNulos);
        System.out.printf("Total de votos em branco: %d\n", votosBrancos);

       double percentualNulos = (totalVotos > 0) ? (double) votosNulos / totalVotos * 100 : 0.0;
        double percentualBrancos = (totalVotos > 0) ? (double) votosBrancos / totalVotos * 100 : 0.0;
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos em branco: %.2f%%\n", percentualBrancos);
        
    }
}
