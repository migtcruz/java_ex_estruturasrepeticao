package Lista03Repeticao;
import java.util.Scanner;
public class exerc20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//20. Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial 
		// várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
		
		Scanner input=new Scanner(System.in);
		while (true) {
            int numero;

            // Solicita ao usuário um número inteiro positivo menor que 16
            do {
                System.out.println("Informe um numero maior que 0 e menor que 16 << numeros negativos ou 0, encerram o programa>> fatorial : ");
                numero = input.nextInt();
                } while ( numero >= 16);

            // Verifica se o usuário deseja sair do programa
            if (numero <=0) {
                System.out.println("Programa encerrado.");
               break;
               }
		
		
		int fatorial=1;
		for(int i = 1; i <= numero; i++) {
			fatorial *= i;
			System.out.print("Fatorial de " + i + "! é : ");
			for (int j = i; j >= 1; j--) {
				if (j== 1) {
					System.out.print(j + " = ");}
				else {   
					System.out.print(j+" x ");}
			
		}
		
				System.out.println(fatorial);	}
		
		}
	}
}
	
	
	



