package Lista03Repeticao;
import java.util.Scanner;
public class exerc27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 27. Faça um programa que calcule o número médio de alunos por turma.
		// Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. 
		// As turmas não podem ter mais de 40 alunos.
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Informe a quantidade de turmas:");
		int nturmas=input.nextInt();
		int totalalunos=0;
		for (int i=1; i<=nturmas; i++) {
			int qtdealunos;
			do {
				System.out.print("Informe a quantidade de alunos na turma "+i+" :");
				qtdealunos=input.nextInt();
				if (qtdealunos>40) {
					System.out.println("Quantidade de alunos nao pode ser superior a 40");}
			}while(qtdealunos>40);
		
			totalalunos = totalalunos+qtdealunos;				
			}
		double media = totalalunos/nturmas;
		
		
		System.out.println("A media de alunos por turma é: "+media);
		
		}
		}


