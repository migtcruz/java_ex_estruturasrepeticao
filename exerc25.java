package Lista03Repeticao;
import java.util.Scanner;
public class exerc25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//25. Faça um programa que peça para n pessoas a sua idade, 
		//ao final o programa devera verificar se a média de idade da turma 
		//varia entre 0 e 25,26 e 60 e maior que 60; e então, 
		//dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de idades a serem inseridas: ");
		int n = input.nextInt();
		int soma = 0;
		
		for (int i=1; i<=n; i++) {
			System.out.print("Digite a idade da "+i+"º pessoa:");
			int idade = input.nextInt();
			soma = soma+idade;			
		}
		
		double media = soma / n;
		System.out.println("A média das idades é: " +media);
		
		if (media>=0 & media<=25){
			System.out.println("A turma é JOVEM");
		}else if(media>=26 & media<=60) {
			System.out.println("A turma é ADULTA");
		}else {
			System.out.println(" A turma é IDOSA");
		}
			
	}

}
