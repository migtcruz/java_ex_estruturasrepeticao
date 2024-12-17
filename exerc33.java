package Lista03Repeticao;
import java.util.Scanner;
public class exerc33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//33. O Departamento Estadual de Meteorologia lhe contratou para desenvolver
		//um programa que leia um conjunto indeterminado de temperaturas, 
		//e informe ao final a menor e a maior temperaturas informadas, 
		//bem como a média das temperaturas.
		
		Scanner scanner = new Scanner(System.in);
        
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0.0;
        int contador = 0;

        System.out.println("Digite as temperaturas: (digite uma letra para finalizar):");

        while (true) {
            System.out.print("Temperatura: ");
            
            if (scanner.hasNextDouble()) { //scanner.hasNextDouble() verifica se a próxima entrada é um número.
                double temp = scanner.nextDouble();
                if (temp < menor) {
                    menor = temp;
                }
                if (temp > maior) {
                    maior = temp;
                }
                soma += temp;
                contador++;
            } else {
                break;  // Saída do loop ao encontrar uma entrada não numérica
            }
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Menor temperatura: " + menor);
            System.out.println("Maior temperatura: " + maior);
            System.out.println("Média das temperaturas: " + media);
        } else {
            System.out.println("Nenhuma temperatura foi informada.");
        }

        scanner.close();
    }
}