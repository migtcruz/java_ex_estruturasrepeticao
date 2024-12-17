package Lista03Repeticao;
import java.util.Scanner;
public class exerc32a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//32. Faça um programa que calcule o fatorial de um número inteiro 
		//fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. 
		//A saída deve ser conforme o exemplo abaixo:
		//	Fatorial de: 5
		//	5! = 5. 4. 3 .2. 1 = 120

		Scanner scanner = new Scanner(System.in);

        // Solicita o número ao usuário
        System.out.print("Fatorial de: ");
        int numero = scanner.nextInt();

        // Calcula o fatorial e monta a string de saída
        long fatorial = 1;
        StringBuilder saida = new StringBuilder();
        saida.append(numero).append("! = ");

        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            saida.append(i);
            if (i > 1) {
                saida.append(". ");
            }
        }
        saida.append(" = ").append(fatorial);

        // Exibe a saída
        System.out.println(saida.toString());

        // Fecha o scanner
        scanner.close();
    }
}