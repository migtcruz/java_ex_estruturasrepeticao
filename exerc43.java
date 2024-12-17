package Lista03Repeticao;
import java.util.Scanner;
public class exerc43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//43. O cardápio de uma lanchonete é o seguinte:
		//	Especificação                    Código       Preço
		//	Cachorro Quente                   100       R$ 1,20
		//	Bauru Simples                     101		R$ 1,30
		//	Bauru com ovo                     102 		R$ 1,50
		//	Hambúrguer                        103		R$ 1,20
		//	Cheeseburguer                     104 		R$ 1,30
		//	Refrigerante                      105		R$ 1,00
		//	Faça um programa que leia o código dos itens pedidos e 
		//	as quantidades desejadas. Calcule e mostre o valor a ser pago por item 
		//	(preço* quantidade) e o total geral do pedido. Considere que o cliente
		//	deve informar quando o pedido deve ser encerrado.
		 
		Scanner scanner = new Scanner(System.in);
	        
	        int[] codigos = {100, 101, 102, 103, 104, 105};
	        String[] itens = {"Cachorro Quente", "Bauru Simples", "Bauru com ovo", "Hambúrguer", "Cheeseburguer", "Refrigerante"};
	        double[] precos = {1.20, 1.30, 1.50, 1.20, 1.30, 1.00};

	        double totalGeral = 0.0;
	        
	        while (true) {
	            
	            System.out.print("Digite o código do item (Codigo 0 para encerrar): ");
	            int codigo = scanner.nextInt();

	            if (codigo == 0) {
	                break;
	            }

	           int index = -1;
	            for (int i = 0; i < codigos.length; i++) {
	                if (codigos[i] == codigo) {
	                    index = i;
	                    break;
	                }
	            }
	                if (index == -1) {
	                System.out.println("Código inválido! Tente novamente.");
	                continue;
	            }
	            
	            System.out.print("Digite a quantidade desejada: ");
	            int quantidade = scanner.nextInt();

	            double valorItem = precos[index] * quantidade;
	            
	            System.out.printf("%s: R$ %.2f x %d = R$ %.2f\n", itens[index], precos[index], quantidade, valorItem);

	           totalGeral += valorItem;
	        }

	        System.out.printf("Total geral do pedido: R$ %.2f\n", totalGeral);

	        scanner.close();
	    }
	}