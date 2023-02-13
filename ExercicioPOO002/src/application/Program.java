package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ContaCorrente user1;
		
		System.out.println("--- BEM - VINDO AO BANCO MC ---");
		System.out.println("Insira seus dados a seguir para acessar sua Conta Corrente");
		System.out.print("NÚMERO DE CONTA CORRENTE: ");
		int numAcc = leitor.nextInt();
		leitor.nextLine();
		System.out.print("NOME DO CORRENTISTA: ");
		String name = leitor.next();
		leitor.nextLine();
		user1 = new ContaCorrente(numAcc, name);
		System.out.println(user1);
		
		System.out.println("--- DEPOSITO ---");
		System.out.println("Insira o valor que deseja depositar: R$");
		double deposito = leitor.nextDouble();
		leitor.nextLine();
		user1.deposito(deposito);
		
		System.out.println("--- SAQUE ---");
		System.out.print("Insira o valor que deseja Sacar: R$ ");
		double saque = leitor.nextDouble();
		leitor.nextLine();
		user1.saque(saque);
		
	
		
		
		
		leitor.close();

	}

}
