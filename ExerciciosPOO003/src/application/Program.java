package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Elevador;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		Elevador elevador = new Elevador();
		int option = 0;

		while (option != 6) {
			option = 0;
			System.out.println("--- MENU --- ");
			System.out.println("[1] INICIALIZAR");
			System.out.println("[2] ENTRAR");
			System.out.println("[3] SAIR");
			System.out.println("[4] SUBIR");
			System.out.println("[5] DESCER");
			System.out.println("[6] SAIR1");
			option = leitor.nextInt();

			switch (option) {

			case 1:
				System.out.println("Qtd de Andares: ");
				int totalFloors = leitor.nextInt();
				System.out.println("Carga Máxima do Elevador: ");
				int maxLoad = leitor.nextInt();
				elevador.inicializa(totalFloors, maxLoad);
				break;

			case 2:
				elevador.enter();
				break;

			case 3:
				elevador.exit();
				break;

			case 4:
				elevador.upFloor();
				break;

			case 5:
				elevador.downFloor();
				break;
				
			case 6:
				break;

			default:
				System.out.println("OPÇÃO INVÁLIDA");
				break;
			}

		}

	}
}
