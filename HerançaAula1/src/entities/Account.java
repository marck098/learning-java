package entities;

public class Account {

	private int numberAccount;
	private String holder;
	protected double balance;

	public Account() {
	}

	public Account(int numberAccount, String holder, double balance) {
		this.numberAccount = numberAccount;
		this.holder = holder;
		this.balance = balance;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void withDraw(double amount) {
		this.balance -= amount;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

}
