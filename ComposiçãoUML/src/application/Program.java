package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o Departamento do Funcionário: ");
		String nameDep = sc.nextLine();
		System.out.println("Insira os dados do Funcionario");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Salario Base: ");
		double baseSalary = sc.nextDouble();
		Worker worker1 = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(nameDep));
		
		
		 
		sc.close();
	}

}
