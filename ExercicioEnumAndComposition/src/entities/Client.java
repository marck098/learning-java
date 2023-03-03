package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private String name;
	private String email;
	private Date birthDay;
	
	public static SimpleDateFormat  sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client() {}
	
	public Client(String name, String email, Date birthDay) {
		this.name = name;
		this.email = email;
		this.birthDay = birthDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", email=" + email + ", birthDay=" + sdf1.format(birthDay) + "]";
	}
	
	
	
}
