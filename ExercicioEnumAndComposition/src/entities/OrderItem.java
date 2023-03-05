package entities;

public class OrderItem {

	private double price;
	private int quantity;

	private Product product;

	public OrderItem() {
	}

	public OrderItem(double price, int quantity, Product product) {
		this.price = price;
		this.quantity = quantity;
		this.product = product;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double subtotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return product + " QTD: " + quantity + " - " + "SubTotal = " + subtotal();

	}

}
