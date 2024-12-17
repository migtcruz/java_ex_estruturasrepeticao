package Lista03Repeticao;
import java.util.Scanner;
public class exerc35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//35. Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma 
		//lista dos números primos existentes entre
		//1 e um número inteiro informado pelo usuário.
		
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int limite = entrada.nextInt();

        System.out.println("Números primos entre 1 e " + limite + ":");

        for (int num = 2; num <= limite; num++) {
            if (éPrimo(num)) {
                System.out.print(num + " ");
            }
        }

        entrada.close();
    }

    static boolean éPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
