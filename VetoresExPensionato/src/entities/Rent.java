package entities;

public class Rent {
	
	private String email;
	private String name;

	public Rent(String name, String email) {
		this.name = name;
		this.email = email;

	}

	public Rent() {		
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + this.name + " E-mail: " + this.email + " Room: ";
	}
	
	
	
}
