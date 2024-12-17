package Lista03Repeticao;
import java.util.Scanner;
public class exerc37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//37. Uma academia deseja fazer um senso entre seus clientes para descobrir 
		//o mais alto, o mais baixo, a mais gordo e o mais magro, 
		//para isto você deve fazer um programa que pergunte a cada um dos clientes
		//da academia seu código, sua altura e seu peso. O final da digitação de dados 
		//deve ser dada quando o usuário digitar 0 (zero) no campo código. 
		//Ao encerrar o programa também deve ser informados os códigos e 
		//valores do clente mais alto, do mais baixo, do mais gordo e do mais magro,
		//além da média das alturas e dos pesos dos clientes
		
		Scanner input=new Scanner (System.in);
		
		int cod;
		double alt,peso;
		double codmenoralt=0,menoralt=Double.MAX_VALUE;
		double codmaioralt=0,maioralt=0;
		double codmenorpeso=0,menorpeso=Double.MAX_VALUE;
		double codmaiorpeso=0,maiorpeso=0;
		
		double somapeso=0;
		double somaalt=0;
		int contador=0;
		
		while (true) {
			System.out.print("Informe o Codigo do Cliente (Digite 0 para Finalizar):");
			cod = input.nextInt();
			if (cod==0) break;
			
			System.out.print("Digite a ALTURA(em metros): ");
            alt = input.nextDouble();
            System.out.print("Digite o PESO(em kg): ");
            peso = input.nextDouble();
            
            somaalt += alt;
            somapeso += peso;
            contador ++;
            
            if (peso < menorpeso) {
            	menorpeso=peso;
            	codmenorpeso=cod;
            }
            
            if (peso > maiorpeso) {
            	maiorpeso=peso;
            	codmaiorpeso=cod;
            }
            
            if (alt < menoralt) {
            	menoralt=alt;
            	codmenoralt=cod;
            }
            
			if( alt > maioralt) {
				maioralt=alt;
				codmaioralt=cod;
			}
		}
									
			if (contador > 0) {
				double mediaalt = somaalt / contador;
				double mediapeso = somapeso / contador;
				
				System.out.println("Cliente Mais Alto >> Codigo: "+codmaioralt+" >> Altura: "+maioralt+" metros");
				System.out.println("Cliente Mais Baixo >> Codigo: "+codmenoralt+" >> Altura: "+menoralt+" metros");
				System.out.println("Cliente Maior Peso >> Codigo: "+codmaiorpeso+" >> Peso: "+maiorpeso+" Kg");
				System.out.println("Cliente Menor Peso >> Codigo: "+codmenorpeso+" >> Peso: "+menorpeso+" Kg");
				System.out.println("Media das Alturas: "+mediaalt+" metros");		
				System.out.println("Media dos Pesos: "+mediapeso+" Kg");
			}else {
	            System.out.println("Nenhum dado foi inserido.");
			}
		}
		}


