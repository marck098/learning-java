package application;

public class EmployeesEntities {
	private Integer id;
	private Double salary;
	private String name;
	
	public EmployeesEntities() {
	}
	public EmployeesEntities(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double salaryIncresead(double percent) {
		return this.salary = this.salary + (this.salary * percent / 100);
	}
	
	public String toString(){
		return id + ", " + name + "," + String.format("%.2f", salary);
	}

}
