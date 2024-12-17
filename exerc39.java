package Lista03Repeticao;
import java.util.Scanner;
public class exerc39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//39. Faça um programa que leia dez conjuntos de dois valores, 
		//o primeiro representando o número do aluno e o segundo representando 
		//a sua altura em centímetros. Encontre o aluno mais alto e o mais baixo. 
		//Mostre o número do aluno mais alto e o número do aluno mais baixo, junto com suas alturas.
		
		   Scanner scanner = new Scanner(System.in);

	        int[] numerosAlunos = new int[10];
	        int[] alturasAlunos = new int[10];
	       
	        int numeroAlunoMaisAlto = 0;
	        int alturaAlunoMaisAlto = 0;
	        int numeroAlunoMaisBaixo = 0;
	        int alturaAlunoMaisBaixo = Integer.MAX_VALUE;
	        
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o número do aluno " + (i + 1) + ": ");
	            numerosAlunos[i] = scanner.nextInt();
	            System.out.print("Digite a altura do aluno " + (i + 1) + " em centímetros: ");
	            alturasAlunos[i] = scanner.nextInt();
	            
	            if (alturasAlunos[i] > alturaAlunoMaisAlto) {
	                alturaAlunoMaisAlto = alturasAlunos[i];
	                numeroAlunoMaisAlto = numerosAlunos[i];
	            }

                if (alturasAlunos[i] < alturaAlunoMaisBaixo) {
	                alturaAlunoMaisBaixo = alturasAlunos[i];
	                numeroAlunoMaisBaixo = numerosAlunos[i];
	            }
	        }
	       
	        System.out.printf("\nO aluno mais alto é o número %d com altura de %d cm.%n",
	                numeroAlunoMaisAlto, alturaAlunoMaisAlto);
	        System.out.printf("O aluno mais baixo é o número %d com altura de %d cm.%n",
	                numeroAlunoMaisBaixo, alturaAlunoMaisBaixo);

	        scanner.close();
	    }
	}