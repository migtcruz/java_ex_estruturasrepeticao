package Lista03Repeticao;
import java.util.Scanner;
public class exerc03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3.	Faça um programa que leia e valide as seguintes informações: 
			//A .nome: maior que 3 caracteres
			//B idade: entre de 0 a 150
			//C salário: maior que zero
			//D sexo : ‘F’ ou ‘M’
			//E estado civil: ‘s’ ‘c’ ‘v’ ‘d’
		 Scanner scanner = new Scanner(System.in);
	        // Leitura e validação do nome
	        String nome;
	        do {
	            System.out.print("Digite o nome (maior que 3 caracteres): ");
	            nome = scanner.nextLine().toLowerCase();
	        } while (nome.length() <= 3);
	        // Leitura e validação da idade
	        int idade;
	        do {
	            System.out.print("Digite a idade (entre 0 e 150): ");
	            idade = scanner.nextInt();
	        } while (idade < 0 || idade > 150);
	        // Leitura e validação do salário
	        double salario;
	        do {
	            System.out.print("Digite o salário (maior que zero): ");
	            salario = scanner.nextDouble();
	        } while (salario <= 0);
	        // Leitura e validação do sexo
	        char sexo;
	        do {
	            System.out.print("Digite o sexo ('F' ou 'M'): ");
	            sexo = scanner.next().toLowerCase().charAt(0);
	        } while (sexo != 'f' && sexo != 'm');
	        // Leitura e validação do estado civil
	        char estadoCivil;
	        do {
	            System.out.print("Digite o estado civil ('s', 'c', 'v' ou 'd'): ");
	            estadoCivil = scanner.next().toLowerCase().charAt(0);
	        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
	        // Exibindo as informações validadas
	        System.out.println("\nInformações validadas:");
	        System.out.println("=========================");
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Salário: " + salario);
	        System.out.println("Sexo: " + sexo);
	        System.out.println("Estado Civil: " + estadoCivil);

	        scanner.close();
		
		
	}

}
