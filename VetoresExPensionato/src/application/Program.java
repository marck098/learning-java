package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdHospedes = 0;

		Rent[] rent = new Rent[10];

		System.out.println("Quantas Pessoas serão hospedadas?");
		qtdHospedes = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < qtdHospedes; i++) {
			System.out.print("Nome: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			sc.nextLine();
			System.out.println("Quarto: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			rent[roomNumber] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("- QUARTOS OCUPADOS -");
		for (int i = 0; i <= 10; i++) {
			if (rent[i] != null) {
				System.out.println(rent[i] + " : " + i);
			}
		}
		sc.close();
	}

}
