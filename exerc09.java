package Lista03Repeticao;
import java.util.Scanner;
public class exerc09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 9.	Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50;
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<=50; i++) {
			if(i%2 !=0) {
				System.out.print(" "+(i));
			}
		}
	}
}
		
		
		
	


