package Lista03Repeticao;
import java.util.Scanner;
public class exerc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.Faça um programa que leia um nome de usuário e a sua senha
		//e não aceite a senha igual ao nome do usuário mostrando uma mensagem 
		// de erro e voltando a pedir as informações
		
		 Scanner scanner = new Scanner(System.in);
	        
		 String nomeUsuario, senha;
	        do {
	            System.out.print("Digite o nome de usuário: ");
	            nomeUsuario = scanner.nextLine();
	            System.out.print("Digite a senha: ");
	            senha = scanner.nextLine();
	            if (senha.equalsIgnoreCase(nomeUsuario)) {
	                System.out.println("ERRO: SENHA IGUAL AO NOME DO USUARIO >> TENTE NOVAMENTE <<");}
	        } while (senha.equalsIgnoreCase(nomeUsuario));

	        System.out.println(">>>>> USUARIO E SENHA OK <<<<<");
	    }
	
		}


