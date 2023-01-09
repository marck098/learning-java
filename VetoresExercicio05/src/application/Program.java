package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0, qtdHomens = 0, qtdMulheres = 0;
		double menorAltura = 0.0, maiorAltura = 0.0, alturaMediaMulheres = 0.0;

		System.out.println("Quantas pessoas serão inseridas no Sistema? ");
		n = sc.nextInt();
		sc.nextLine();

		char[] genero = new char[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.println("Altura: ");
			altura[i] = sc.nextDouble();
			sc.nextLine();
			System.out.println("Gênero: ");
			genero[i] = sc.nextLine().charAt(0);
			genero[i] = Character.toUpperCase(genero[i]);
		}

		menorAltura = altura[0];
		maiorAltura = altura[0];

		for (int i = 0; i < n; i++) { // menor e maior altura
			double aux = altura[i];
			if (aux >= maiorAltura) {
				maiorAltura = aux;
			} else if (aux <= menorAltura) {
				menorAltura = aux;
			}
		}
		System.out.println("menor altura " + menorAltura);
		System.out.println("maior altura " + maiorAltura);

		for (int i = 0; i < n; i++) {
			if (genero[i] == 'F') {
				alturaMediaMulheres += altura[i];
				qtdMulheres++;
			} else {
				qtdHomens++;
			}
		}

		alturaMediaMulheres = alturaMediaMulheres / qtdMulheres;
		System.out.printf("MEDIA DE ALTURA DAS MULHERES: %.2f%n", alturaMediaMulheres);
		System.out.println("NUMERO DE HOMENS: " + qtdHomens);
		sc.close();

	}

}
