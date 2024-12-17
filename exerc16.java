package Lista03Repeticao;
import java.util.Scanner;
public class exerc16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 16. A série de Fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,34,55,.. 
		// Faça um programa que gere a série até que o valor seja maior que 500.
		
		int limite = 500;
        int termo1 = 0;
        int termo2 = 1;
        int proximoTermo = termo1 + termo2;

        System.out.println("Série de Fibonacci até que o valor seja maior que " + limite + ":");

        while (termo1 <= limite) {
            System.out.print(termo1 + "\n");

            termo1 = termo2;
            termo2 = proximoTermo;
            proximoTermo = termo1 + termo2;
        }
    }
}
