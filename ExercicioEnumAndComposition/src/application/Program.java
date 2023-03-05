package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Insira os Dados do Cliente:");
		System.out.print("NOME: ");
		String clientName = sc.nextLine();
		System.out.print("E-MAIL: ");
		String email = sc.nextLine();
		System.out.print("DATA DE NASCIMENTO: ");
		Date birthDate = sdf1.parse(sc.nextLine());
		Client client = new Client(clientName, email, birthDate);

		System.out.println("ORDER DATA: ");
		System.out.print("Insira o status do Pedido:  ");
		OrderStatus Status = OrderStatus.valueOf(sc.nextLine());
		System.out.print("Quantas Itens haverao nesse pedido: ");
		int qtyItensOrder = sc.nextInt();
		sc.nextLine();

		Order order = new Order(new Date(), Status, client);

		for (int i = 0; i < qtyItensOrder; i++) {

			System.out.println("Dados do #" + (i + 1) + " Pedido: ");
			System.out.print("Produt Name: ");
			String productName = sc.nextLine();
			System.out.print("Produt Price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQty = sc.nextInt();
			sc.nextLine();

			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productPrice, productQty, product);
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println(order);
		sc.close();

	}

}
