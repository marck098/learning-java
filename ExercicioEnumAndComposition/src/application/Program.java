package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat  sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Insira os Dados do Cliente:");
		System.out.print("NOME: ");
		String clientName = sc.nextLine();
		System.out.print("E-MAIL: ");
		String email = sc.nextLine();
		System.out.print("DATA DE NASCIMENTO: ");
		Date birthDate = sdf1.parse(sc.nextLine());
		Client client = new Client(clientName, email, birthDate);
		
		System.out.println(client);
		
		sc.close();
		
	}

}
