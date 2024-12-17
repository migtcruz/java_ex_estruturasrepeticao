package Lista03Repeticao;
import java.util.Scanner;
public class exerc32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//32. Faça um programa que calcule o fatorial de um número inteiro 
		//fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. 
		//A saída deve ser conforme o exemplo abaixo:
		//	Fatorial de: 5
		//	5! = 5. 4. 3 .2. 1 = 120

		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de: " + numero);
        System.out.print(numero + "! = ");

        for (int i = numero; i > 1; i--) {
            System.out.print(i + " . ");
        }

        System.out.println(1 + " = " + fatorial);
    }
}