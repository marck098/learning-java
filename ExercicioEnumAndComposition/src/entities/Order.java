package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;

	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}

	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subtotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("RESUMO DO PEDIDO: \n");
		sb.append("ORDER MOMENT: " + moment + " \n");
		sb.append("STATUS: " + status + " \n");
		sb.append("CLIENTE: " + client + " \n");
		sb.append("ITENS DO PEDIDO: \n");

		for (OrderItem it : items) {
			sb.append(it + "\n");
		}
		sb.append("TOTAL PRICE: ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();

	}

}
