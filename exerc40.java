package Lista03Repeticao;
import java.util.Scanner;
public class exerc40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//40. Foi feita uma estatistica em cinco cidades brasileiras para coletar dados sobre 
		//acidentes de trânsito. Foram obtidos os seguintes dados:
		//	a. Codigo da cidade
		//	b. Número de veículos de passeio (em 1999);
		//	c. Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
		//	d. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
		//	e. Qual a média de veículos nas cinco cidades juntas;
		//	f. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.

		
		
		 Scanner scanner = new Scanner(System.in);

	        // Arrays para armazenar os dados das cidades
	        int[] codigos = new int[5];
	        int[] numVeiculos = new int[5];
	        int[] numAcidentes = new int[5];

	        // Coleta de dados
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Digite o código da cidade " + (i + 1) + ":");
	            codigos[i] = scanner.nextInt();
	            System.out.println("Digite o número de veículos de passeio na cidade " + (i + 1) + ":");
	            numVeiculos[i] = scanner.nextInt();
	            System.out.println("Digite o número de acidentes com vítimas na cidade " + (i + 1) + ":");
	            numAcidentes[i] = scanner.nextInt();
	        }

	        // Calcula o maior e menor índice de acidentes
	        double maiorIndice = Double.MIN_VALUE;
	        double menorIndice = Double.MAX_VALUE;
	        int codigoMaiorIndice = -1;
	        int codigoMenorIndice = -1;

	        for (int i = 0; i < 5; i++) {
	            double indiceAcidentes = (double) numAcidentes[i] / numVeiculos[i];
	            if (indiceAcidentes > maiorIndice) {
	                maiorIndice = indiceAcidentes;
	                codigoMaiorIndice = codigos[i];
	            }
	            if (indiceAcidentes < menorIndice) {
	                menorIndice = indiceAcidentes;
	                codigoMenorIndice = codigos[i];
	            }
	        }

	        // Calcula a média de veículos
	        int somaVeiculos = 0;
	        for (int i = 0; i < 5; i++) {
	            somaVeiculos += numVeiculos[i];
	        }
	        double mediaVeiculos = (double) somaVeiculos / 5;

	        // Calcula a média de acidentes nas cidades com menos de 2.000 veículos
	        int somaAcidentesMenos2000 = 0;
	        int contadorMenos2000 = 0;
	        for (int i = 0; i < 5; i++) {
	            if (numVeiculos[i] < 2000) {
	                somaAcidentesMenos2000 += numAcidentes[i];
	                contadorMenos2000++;
	            }
	        }
	        double mediaAcidentesMenos2000 = contadorMenos2000 > 0 ? (double) somaAcidentesMenos2000 / contadorMenos2000 : 0;

	        // Resultados
	        System.out.println("\n\nResultados:");
	        System.out.println("Maior índice de acidentes: " + String.format("%.2f", maiorIndice )+ ", Código da cidade: " + codigoMaiorIndice);
	        System.out.println("Menor índice de acidentes: " + String.format("%.2f", menorIndice )+ ", Código da cidade: " + codigoMenorIndice);
	        System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);
	        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos: " + mediaAcidentesMenos2000);
	    }
	}
	


