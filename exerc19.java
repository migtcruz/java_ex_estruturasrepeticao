package Lista03Repeticao;
import java.util.Scanner;
public class exerc19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 19. Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite qtde de numeros do conjunto:");
		int n=input.nextInt();
		
		int menor=Integer.MAX_VALUE;
		int maior=Integer.MIN_VALUE;
		int soma=0;
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite o valor do numero"+(i+1)+" : ");
			int valor = input.nextInt();
			
		if ( valor>=0 & valor<=1000) { // if para parametros de valores
			if (valor<menor) {
				menor=valor ;}
			
			if (valor>maior) {
				maior=valor;}
			soma +=valor;}
		
		else {
            System.out.println("ERRO !!!! >>>> Os numeros devem estar entre 0 e 1000 <<<<");
            i--; } // else caso nao esteja entre 0 e 1000
        }
		
		
		 System.out.println("MENOR valor: " + menor);
	        System.out.println("MAIOR valor: " + maior);
	        System.out.println("SOMA dos valores: " + soma);
		
		
	}

}
