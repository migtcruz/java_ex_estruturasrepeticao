package Lista03Repeticao;
import java.util.Scanner;
public class exerc38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//38. Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
		//	a. Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
		//	b. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
		//	C. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem
		//	ao dobro do percentual do ano anterior.
		//	Faça um programa que determine o salário atual desse funcionário. 
		//	Após concluir isto, altere o programa permitindo que o usuário 
		//	digite o salário inicial do funcionário.
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário inicial do funcionário: ");
        double salarioInicial = scanner.nextDouble();

        int anoContratacao = 1995;
        double salarioAtual = 0;
        double aumentoPercentual = 1.5; 

        salarioAtual += salarioInicial * (aumentoPercentual / 100);

        int anoAtual = 2024;
        for (int ano = 1997; ano <= anoAtual; ano++) {
            aumentoPercentual *=  2; 
            salarioAtual +=  (aumentoPercentual / 100);
        }
         System.out.printf("O salário atual do funcionário em %d é: R$ %.2f%n", anoAtual, salarioAtual);

        scanner.close();
    }
}
