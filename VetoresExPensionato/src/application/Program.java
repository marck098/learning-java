package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdHospedes = 0;

		Rent[] vect = new Rent[10];

		System.out.println("Quantas Pessoas serão hospedadas?");
		qtdHospedes = sc.nextInt();

		for (int i = 0; i < qtdHospedes; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int roomNumber = sc.nextInt();
			Rent rent = new Rent(name, email);
			vect[roomNumber] = rent;
		}
		System.out.println();
		System.out.println("- QUARTOS OCUPADOS -");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i] + " : " + i);
			}
		}
		sc.close();
	}
}