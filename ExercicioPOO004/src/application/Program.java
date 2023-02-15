package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Agenda;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int aux = 0;
		while (aux != 6) {
			System.out.println("ESCOLHA UMA OPÇÃO");
			System.out.println("[1] - CADASTRAR CONTATO ");
			System.out.println("[2] - IMPRIMIR TODOS OS CONTATOS ");
			System.out.println("[3] - BUSCAR CONTATO PELA POSIÇÃO");
			System.out.println("[4] - BUSCAR CONTATO PELO NOME");
			System.out.println("[5] - DELETAR CONTATO ");
			System.out.println("[6] - ENCERRAR PROGRAMA");
			aux = sc.nextInt();
			sc.nextLine();

			switch (aux) {
			case 1:
				System.out.println("INSIRA OS DADOS DA PESSOA: ");
				System.out.print("NOME: ");
				String name = sc.nextLine();
				System.out.print("IDADE: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("ALTURA: ");
				double height = sc.nextDouble();
				sc.nextLine();
				agenda.enterPeople(name, age, height);
				break;

			case 2:
				agenda.printAgenda();
				break;

			case 3:
				System.out.println("Insira a posição da pessoa que você deseja obter informações");
				int searchIndex = sc.nextInt();
				sc.nextLine();
				agenda.printPersonIndex(searchIndex);
				break;

			case 4:
				System.out.println("Insira o NOME que deseja buscar: ");
				String nameSearch = sc.nextLine();
				agenda.searchPersonName(nameSearch);
				break;

			case 5:
				System.out.print("Insira a POSICAO do contato que deseja excluir: ");
				int deletePeople = sc.nextInt();
				agenda.deletePeople(deletePeople);
				break;

			default:
				System.out.println("OPCAO INVALIDA");
				break;

			}
		}

		sc.close();

	}

}
