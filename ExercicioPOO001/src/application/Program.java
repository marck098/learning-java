package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		
		System.out.println("----- CADASTRO DE ALUNO -----");
		System.out.print("Insira o ID: ");
		int id = sc.nextInt();
		aluno1.setId(id);
		sc.nextLine();
		
		System.out.print("Insira o Nome do Aluno: ");
		String name = sc.nextLine();
		aluno1.setName(name);
		
		System.out.println("Insira a nota da prova 1: ");
		double notaProva1 = sc.nextDouble();
		aluno1.setNotaProva1(notaProva1);
		
		System.out.println("Insira a nota da prova 2: ");
		double notaProva2 = sc.nextDouble();
		aluno1.setNotaProva2(notaProva2);
		
		System.out.println("Insira a nota do Trabalho: ");
		double notaTrabalho = sc.nextDouble();
		aluno1.setNotaTrabalho(notaTrabalho);
		
		System.out.print("MÉDIA ALUNO - ");
		aluno1.mediaAluno();
		
		
		
		
		sc.close();
		
	}
	
}
