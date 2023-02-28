package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Department department;
	private List<HourContract> contracts = new ArrayList<>(); // NÃO É INSTANCIADA DENTRO DO CONSTRUTOR

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) {
		double soma = baseSalary;
		Calendar cal = Calendar.getInstance(); // cria um objeto tipo Calendário e usa o .getInstance() para retornar um calendário 
		for (HourContract c : contracts) {    // ...dentro do local e zona padrão da máquina.
			cal.setTime(c.getDate()); //  c.getDate irá pegar a data a qual será "setada" em cal.setTime ou seja, seta em Cal a data do contrato c.
			int c_year = cal.get(Calendar.YEAR); // cal.get(Calendar.YEAR) pega o ano q o objeto c passou para cal
			int c_month = 1 + cal.get(Calendar.MONTH); // cal.get(Calendar.MONTH) pega o mês q o objeto c passou para cal
			if (year == c_year && month == c_month) {
				soma += c.totalValue();
				System.out.println(c.totalValue());
				System.out.println(soma);
			}
		}
	
		return soma;
	}

}
