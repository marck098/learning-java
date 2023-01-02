package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("BEM VINDO AO BANCO MM");
		System.out.print("Insira o número da conta: ");
		int accNumber = sc.nextInt();
		System.out.print("Insira o Nome do Proprietário da Conta: ");
		String userAccName = sc.next();
		System.out.print("Insira o Valor Inicial a ser depositado: ");
		double valueMoneyAcc = sc.nextDouble();
		Account acc = new Account(accNumber, userAccName, valueMoneyAcc);
		System.out.println(acc);

		System.out.println("Qual o valor que deseja DEPOSITAR? ");
		double moneyIn = sc.nextDouble();
		acc.valueDeposited(moneyIn);
		System.out.println("UPDATE - " + acc);

		System.out.println("Qual o valor que deseja RETIRAR? ");
		double moneyOut = sc.nextDouble();
		acc.valueWithdrawal(moneyOut);
		System.out.println("UPDATE - " + acc);
		sc.close();
	}

}
