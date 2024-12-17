package Lista03Repeticao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class exerc47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//47. Em uma competição de ginástica, cada atleta recebe votos de sete jurados. A melhor ....
		
		
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nome do ginasta (ou deixe em branco para encerrar): ");
            String nome = scanner.nextLine().trim();

            if (nome.isEmpty()) {
                break;
            }

            ArrayList<Double> notas = new ArrayList<>();

            for (int i = 1; i <= 7; i++) {
                System.out.printf("Nota do jurado %d: ", i);
                notas.add(scanner.nextDouble());
            }
            scanner.nextLine(); // Consumir a nova linha restante

            double melhorNota = Collections.max(notas);
            double piorNota = Collections.min(notas);

            notas.remove(melhorNota);
            notas.remove(piorNota);

            double soma = 0.0;
            for (double nota : notas) {
                soma += nota;
            }

            double media = soma / notas.size();

            System.out.println("\nResultado final:");
            System.out.printf("Atleta: %s\n", nome);
            System.out.printf("Melhor nota: %.1f\n", melhorNota);
            System.out.printf("Pior nota: %.1f\n", piorNota);
            System.out.printf("Média: %.2f\n", media);
        }

        }
}