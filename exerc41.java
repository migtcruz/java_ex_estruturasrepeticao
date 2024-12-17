package Lista03Repeticao;
import java.util.Scanner;
public class exerc41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//41. Faça um programa que receba o valor de uma divida e mostre uma tabela 
		//com os seguintes dados: valor da dívida, valor dos juros, 
		//quantidade de parcelas e valor da parcela.
		//Os juros e a quantidade de parcelas seguem a tabela abaixo:
		//Quantidade de Parcelas :  % de Juros sobre o valor inicial da dívida
		//  1				0%
		//  3   			10%
		//	6				15%
		//	9				20%
		//	12				25%

		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe o valor da dívida: ");
        double valorDivida = scanner.nextDouble();

        int[] parcelas = {1, 3, 6, 9, 12};
        double[] juros = {0.0, 0.10, 0.15, 0.20, 0.25};

        System.out.println("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela");
        System.out.println("");

        for (int i = 0; i < parcelas.length; i++) {
            int qtdParcelas = parcelas[i];
            double percentualJuros = juros[i];

            double valorJuros = valorDivida * percentualJuros;
            double valorTotal = valorDivida + valorJuros;
            double valorParcela = valorTotal / qtdParcelas;
           
            System.out.printf("R$ %.2f       | R$ %.2f        | %d                     | R$ %.2f\n", valorTotal, valorJuros, qtdParcelas, valorParcela);
        }


    }
}
		
	

