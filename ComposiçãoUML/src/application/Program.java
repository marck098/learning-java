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
		Worker worker1 = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(nameDep));
		
		System.out.print("Quantos contratos esse Trabalhador irá ter: ");
		int qtdContract = sc.nextInt();
		
		for(int i = 1; i <= qtdContract ; i++) {
			System.out.println("Insira as informações do contrato #" + i + " : " );
			System.out.print("(DATA DD/MM/YYYY): "); 
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valueHour = sc.nextInt();
			System.out.print("Duração (Horas): ");
			int durationHour = sc.nextInt(); 
			HourContract hc1 = new HourContract(contractDate, valueHour, durationHour);
			worker1.addContratc(hc1);
		}
		
		System.out.println();
		System.out.println("Insira o MÊS e ANO para calculo o Salario(MM/YYYY): ");
		String monthAndYear = sc.next();
		int year = Integer.parseInt(monthAndYear.substring(0,2));
		int month = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker1.getName());
		System.out.println("Deptarment: " + worker1.getDepartment().getName());
		System.out.println("Income for: " + monthAndYear + " : " + String.format("%.2f", worker1.income(year, month)) );
		
		
		
		
		 
		sc.close();
	}

}
