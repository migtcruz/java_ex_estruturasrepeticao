package Lista03Repeticao;
import java.util.Scanner;
public class exerc23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//23. Faça um programa que mostre todos os primos entre 1 e N 
		//sendo N um número inteiro fornecido pelo usuário. 
		//O programa deverá mostrar também o número de divisões que ele executou para encontrar
		//os números primos. Serão avaliados o funcionamento, o estilo
		//e o número de testes (divisões) executados.
		
		Scanner teclado = new Scanner(System.in);

       
        System.out.print("Digite um número inteiro N: ");
        int N = teclado.nextInt();

       
        int primosEncontrados = 0;
        int divisoesRealizadas = 0;

       
        for (int numero = 2; numero <= N; numero++) {
            
            boolean ehPrimo = true;

            
            for (int divisor = 2; divisor * divisor <= numero; divisor++) {
                divisoesRealizadas++;
                if (numero % divisor == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            
           if (ehPrimo) {
                primosEncontrados++;
                System.out.print(numero + ", ");
            }
        }

        System.out.println("\nQTDE Primos encontrados: " + primosEncontrados);
        System.out.println("QTDE Divisões realizadas: " + divisoesRealizadas);
    }
}