package Lista03Repeticao;
import java.util.Scanner;
public class exerc06a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6.Faça um programa que imprima na tela os números de 1 a 20 um abaixo do outro 
				//depois modifique o programa para que ele mostre os números um ao lado do outro;
		
		Scanner input = new Scanner(System.in);
		
		// Imprimir os números um ao lado do outro
		
        System.out.println("\nNúmeros um ao lado do outro:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
	}

	}
}
