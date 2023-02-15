package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	public Agenda() {
	}

	List<Contato> agenda = new ArrayList<Contato>();

	public void enterPeople(String name, int age, double height) {
		Contato pessoa = new Contato(name, age, height);
		agenda.add(pessoa);
	}

	public void deletePeople(int index) {
		agenda.remove(index);
	}

	public void searchPersonName(String name) {
		for (Contato contato : agenda) {
			if (contato.getName().equals(name)) {
				System.out.println(contato);

			}
		}
	}

	public void printPersonIndex(int IndexPerson) {
		System.out.println(agenda.get(IndexPerson));

	}

	public void printAgenda() {
		for (Contato contatos : agenda) {
			System.out.println(contatos + ", POSIÇÃO:  " + agenda.indexOf(contatos));
		}
	}

}
