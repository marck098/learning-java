package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramArrayList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeesEntities> list = new ArrayList<>();

		int numberOfRegisters = 0;

		System.out.println("Quantidade de Funcionarios a Serem Cadastrados: ");
		numberOfRegisters = sc.nextInt();

		for (int i = 0; i < numberOfRegisters; i++) {
			System.out.println("Funcionário #" + (i + 1) + " :");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("NAME: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("SALARY: ");
			Double salary = sc.nextDouble();
			sc.nextLine();

			EmployeesEntities emp = new EmployeesEntities(id, name, salary);
			list.add(emp);
		}

		System.out.print("Insira o Funcionário que receberá um aumento: ");
		
		int idSalary = sc.nextInt();
		int pos = position(list, idSalary);
		if(pos == -1) {
			System.out.println("ID Inválido");
		}
		else {
			sc.nextLine();
			System.out.print("Insira a porcentagem de aumento: ");
			double percent = sc.nextDouble();
			list.get(pos).salaryIncresead(percent);
		}
		
		System.out.println("Lista de Funcionários");
		for(EmployeesEntities emp : list) {
			System.out.println(emp);
		}
		

		sc.close();
		;

	}

	public static int position(List<EmployeesEntities> list, int id) {
			for(int i = 0; i < list.size(); i++) {
				if (list.get(i).getId() == id) {
					return i;
					}
				}
			return -1;
			}
	}

