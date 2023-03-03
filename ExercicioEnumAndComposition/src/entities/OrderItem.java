package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	
	private double price;
	private int quantity;
	
	public List<Product> product = new ArrayList<>();
	
	public OrderItem() {}
	
	public OrderItem(double price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}
		
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double subtotal(double price, Integer quantity) {
		return price * quantity;
	}
	
	

}
