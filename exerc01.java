package Lista03Repeticao;
import java.util.Scanner;
public class exerc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 01 Faca um programa que peça uma nota entre 0 e 10.
		// Mostre a mensagem caso valor seja invalido e continue pedindo ate que
		// o usuario informe um valor valido;
		
		Scanner input = new Scanner(System.in);
		// Variavel
		double valor;
		//Ler e receber valor
		// Verificar condições >> INICIOESTRUTURA DE REPETIÇÃO
		do {
			System.out.println("Informe um valor entre 0 e 10 : ");
			 valor = input.nextDouble();
		if ( valor <0 | valor >10) {
			System.out.println("Valor informado : "+valor+" >> ESTE VALOR É INVALIDO <<");	}
		}	while ( valor <0 | valor >10);
		//FIM ESTRUTURA REPETIÇÃO
		//IMPRIMIR VALOR VALIDO
		System.out.println("Valor informado : "+valor);
		
	}
}
			
	


		
		
	


