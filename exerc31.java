package Lista03Repeticao;
import java.util.Scanner;
public class exerc31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//31. O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 
		//e agora possui uma loja de conveniências. Faça um programa que implemente
		//caixa registradora rudimentar. O programa deverá receber um número
		//desconhecido de valores referentes aos preços das mercadorias. 
		//Um valor zero deve ser informado pelo operador para indicar o final da compra.
		//O programa deve então mostrar o total da compra e perguntar o valor em dinheiro 
		//que o cliente forneceu, para então calcular e mostrar o valor do troco. 
		///Após esta operação, o programa deverá voltar ao ponto inicial, para registrar 
		//a próxima compra. A saida deve ser contorme o exemplo abaixo:
		//Lojas Tabajara
		//Produto 1: R$ 2.20
		//Produto 2: R$ 5.80
		//Produto 3: 	R$ 0
		//Total: R$ 9.00
		//Dinheiro: R$ 20.00
		//Troco: R$ 11.00
		Scanner scanner=new Scanner(System.in);
		 while (true) {
	            System.out.println("Lojas Tabajara");
	            System.out.println("###############");
	            double total = 0;
	            int contador = 1;
	            
	    while (true) {
	           System.out.print("Produto " + contador + ":(ou digite 0 para finalizar) >> R$ ");
	           double valor = scanner.nextDouble();
	                if (valor == 0) {
	                    break;
	                }
	                total += valor;
	                contador++;
	            }
	            
	            
	            System.out.printf(">>>>>> Total: R$ %.2f%n", total);
	            
	            
	            System.out.print("Digite o valor recebido em Dinheiro: R$ ");
	            double dinheiro = scanner.nextDouble();
	            
	            
	            double troco = dinheiro - total;
	            System.out.printf(">>>>>> Troco: R$ %.2f%n", troco);
	            
	            System.out.println();  
	            }
	    }
	}
