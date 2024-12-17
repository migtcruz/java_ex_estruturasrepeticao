package Lista03Repeticao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class exerc46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//46. Em uma competição de salto em distância cada atleta tem .....
			
		Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nome do atleta (ou deixe em branco para encerrar): ");
            String nome = scanner.nextLine().trim();
            
            if (nome.isEmpty()) {
                break;
            }
            
            ArrayList<Double> saltos = new ArrayList<>();
         
            for (int i = 1; i <= 5; i++) {
                System.out.printf("Distância do Salto %d: ", i);
                double distancia = scanner.nextDouble();
                saltos.add(distancia);
            }
            scanner.nextLine(); // Consumir a nova linha restante
            
            double melhorSalto = Collections.max(saltos);
            double piorSalto = Collections.min(saltos);
            
            saltos.remove(melhorSalto);
            saltos.remove(piorSalto);
           
            double soma = 0.0;
            for (double salto : saltos) {
                soma += salto;
            }

            double media = soma / saltos.size();
        
            System.out.println("\nResultado final:");
            System.out.printf("Atleta: %s\n", nome);
            System.out.printf("Melhor salto: %.1f m\n", melhorSalto);
            System.out.printf("Pior salto: %.1f m\n", piorSalto);
            System.out.printf("Média dos demais saltos: %.1f m\n", media);
            System.out.printf("Resultado final: %s: %.1f m\n", nome, media);
        }

          }
}