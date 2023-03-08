package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BussinesAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- BANCO MM --- ");
		System.out.print("Titular da Conta: ");
		String holderName = sc.nextLine();
		System.out.print("Numero da Conta: ");
		int numberAcc = sc.nextInt();
		System.out.print("Valor do Deposito: ");
		double amountDeposit = sc.nextDouble();
		System.out.print("Limite para emprestimo: ");
		double loanLimit = sc.nextDouble();
		
		BussinesAccount bussAccount = new BussinesAccount(numberAcc, holderName, amountDeposit, loanLimit);
		
		System.out.println(bussAccount);
		System.out.println("");
		
		System.out.print("Insira o Valor o qual deseja realizar um emprestimo:");
		double loan = sc.nextDouble();
		System.out.println();
		bussAccount.loan(loan);
		System.out.println();
		
		System.out.println(bussAccount);
		
		sc.close();
	}

}
