package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas Linhas haverá na Matriz: ");
		int linhasMatriz = sc.nextInt();
		System.out.print("Quantas Colunas haverá na Matriz: ");
		int colunasMatriz = sc.nextInt();

		int[][] matriz = new int[linhasMatriz][colunasMatriz];

		for (int i = 0; i < linhasMatriz; i++) {
			for (int j = 0; j < colunasMatriz; j++) {
				System.out.print("Insira os numeros da matariz: ");
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("---------------MATRIZ---------------");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("Insira o número que deseja encontrar na Matriz: ");
		int numberSearch = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (numberSearch == matriz[i][j]) {
					System.out.println("Position:" + i + "," + j);

					if (i > 0) {
						System.out.println("UP: " + matriz[i - 1][j]);
					}
					if (i < matriz.length - 1) {
						System.out.println("DOWN: " + matriz[i + 1][j]);
					}
					if (j > 0) {
						System.out.println("LEFT: " + matriz[i][j - 1]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("RIGHT: " + matriz[i][j + 1]);
					}	
				}
			}
		}
		sc.close();

	}

}
