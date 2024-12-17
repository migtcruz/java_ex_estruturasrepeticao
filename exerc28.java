package Lista03Repeticao;
import java.util.Scanner;
public class exerc28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//28. Faça um programa que calcule o valor total investido por um colecionador
		//em sua coleção de CDs e o valor médio gasto em cada um deles. 
		//O usuário deverá informar a quantidade de CDs e o valor para em cada um.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Informe a qtde total de Cds na coleção:");
		int ncds=input.nextInt();
		double totalinvestido=0;
		
		for (int i=1; i<=ncds; i++) {
			System.out.print("Informe o preço do cd "+i+" :");
			double precocd=input.nextDouble();
			totalinvestido=totalinvestido+precocd;
			}
		double mediocd = totalinvestido/ncds;
		
		System.out.println("O Total investido na coleção - R$ "+totalinvestido);
		System.out.println("O preço medio por CD - R$ "+mediocd);
	}

}
