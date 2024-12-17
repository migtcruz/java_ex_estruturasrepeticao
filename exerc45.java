package Lista03Repeticao;
import java.util.Scanner;
public class exerc45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//. Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questões,
		//o programa deve perguntar ao aluno a resposta de cada questão e ao final 
		//comparar com o gabarito da prova e assim calcular o total de acertos e a nota
		//(atribuir 1 ponto por resposta certa). Após cada aluno utilizar o sistema deve ser
		//feita uma pergunta se outro aluno vai utilizar o sistema. Após todos os alunos terem 
		// informar:
		//	a. Maior e Menor Acerto;
		//	b. Total de Alunos que utilizaram o sistema;
		//	c. A Média das Notas da Turma.
		//	Gabarito da Prova:
		//	01 – A
		//	02 – B
		//	03 – C
		//	04 – D
		//	05 – E
		//	06 – E
		//	07 – D
		//	08 – C
		//	09 – B
		//	10 – A
		//	Após concluir isto você poderia incrementar o programa permitindo que o professor
		//	digite o gabarito da prova antes dos alunos usarem o programa.

		Scanner scanner = new Scanner(System.in);
        
        char[] gabarito = new char[10];
        System.out.println("Professor, digite o gabarito da prova:");
        for (int i = 0; i < gabarito.length; i++) {
            System.out.printf("Questão %02d: ", i + 1);
            gabarito[i] = scanner.next().toUpperCase().charAt(0);
        }

        int totalAlunos = 0;
        int totalAcertos = 0;
        int maiorAcerto = 0;
        int menorAcerto = 10;

        boolean continuar = true;
        while (continuar) {
            int acertos = 0;
            
            System.out.println("Aluno, responda as questões da prova:");
            for (int i = 0; i < gabarito.length; i++) {
                System.out.printf("Questão %02d: ", i + 1);
                char resposta = scanner.next().toUpperCase().charAt(0);
                if (resposta == gabarito[i]) {
                    acertos++;
                }
            }
            
            totalAlunos++;
            totalAcertos += acertos;
            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }
            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }
           
            System.out.printf("Você acertou %d questões e sua nota é %d.\n", acertos, acertos);
            
            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            char resposta = scanner.next().toUpperCase().charAt(0);
            if (resposta != 'S') {
                continuar = false;
            }
        }
        double media = totalAlunos > 0 ? (double) totalAcertos / totalAlunos : 0;

        System.out.println("\nEstatísticas da turma:");
        System.out.printf("Maior acerto: %d\n", maiorAcerto);
        System.out.printf("Menor acerto: %d\n", menorAcerto);
        System.out.printf("Total de alunos que utilizaram o sistema: %d\n", totalAlunos);
        System.out.printf("Média das notas da turma: %.2f\n", media);

        }
}