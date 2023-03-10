package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Insira o Departamento do Funcionário: ");
		String nameDep = sc.nextLine();
		System.out.println("Insira os dados do Funcionario");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Salario Base: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(nameDep));

		System.out.print("Quantos contratos esse Trabalhador irá ter: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}

		System.out.println();
		System.out.println("Insira o MÊS e ANO para calculo o Salario(MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); // utiliza o Integer.parseInt para converter em INT e substring(index, index) 
		int year = Integer.parseInt(monthAndYear.substring(3));     // para selecionar dentro das string quais intervalos serão selecionados
		System.out.println("Name: " + worker.getName());
		System.out.println("Deptarment: " + worker.getDepartment().getName());
		System.out.println("Income for: " + monthAndYear + " : " + String.format("%.2f", worker.income(year, month)));

		sc.close();

	}
}
