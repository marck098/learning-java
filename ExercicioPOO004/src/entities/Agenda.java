package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	public Agenda() {}

	List<Contato> agenda = new ArrayList<Contato>();

	public void enterPeople(String name, int age, double height) {
		Contato pessoa = new Contato(name, age, height);
		agenda.add(pessoa);
	}

	public void deletePeople() {
	}

	public void searchPople(String name) {
		
	}

	public void printPeople() {
	}

	public void printAgenda() {
	}

}
