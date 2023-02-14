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
		while(aux != 6) {
			System.out.println("ESCOLHA UMA OPÇÃO");
			aux = sc.nextInt();
			sc.nextLine();
			
			switch(aux) {
			case 1:
				System.out.println("INSIRA OS DADOS DA PESSOA: ");
				System.out.print("NOME: ");
				String name = sc.nextLine();
				System.out.print("IDADE: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("ALTURA: ");
				double height = sc.nextDouble();
				agenda.enterPeople(name, age, height);
				break;
			
			default:
				break;
			
			}
		}
		

	}

}
