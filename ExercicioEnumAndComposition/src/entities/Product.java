package entities;

public class Product {

	private String productName;
	private double price;

	public Product() {}

	public Product(String name, double price) {
		this.productName = name;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String name) {
		this.productName = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
