package Lista03Repeticao;
import java.util.Scanner;
public class exerc12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//12.	Desenvolva um gerador de tabuada capaz de gerar a tabuada
		//de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número 
		//ele deseja ver a tabuada. A saída deve se ser conforme o exemplo abaixo:
			//	Tabuada de 5:
			// 5x1=5 
			// 5x2=10
			// ....
			// 5x10=50;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digte um numero entre 1 e 10 para visualizar a tabuada :");
		int numero = input.nextInt();
		
		if (numero <1 | numero>10) {
		System.out.println("Numero nao compreendido entre 1 e 10");
		}
		
		else {
			System.out.println("A Tabuada de "+numero+" é :");
			
		for(int i=0; i<=10; i++) {
		int resultado = numero*i;
		System.out.println(numero+" x "+i+" = "+resultado);}
		}

	}

}
