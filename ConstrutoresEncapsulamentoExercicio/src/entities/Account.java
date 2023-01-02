package entities;

public class Account {
	private int accNumber;
	private String userAccName;
	private double valueMoneyAcc;

	public Account(int accNumber, String userAccName, double accInitialValue) {
		this.accNumber = accNumber;
		this.userAccName = userAccName;
		this.valueMoneyAcc = accInitialValue;

	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getUserAccName() {
		return userAccName;
	}

	public void setUserAccName(String userAccName) {
		this.userAccName = userAccName;
	}

	public double getValueMoneyAcc() {
		return valueMoneyAcc;
	}

	public double valueDeposited(double moneyIn) {
		return this.valueMoneyAcc += moneyIn;
	}

	public double valueWithdrawal(double moneyOut) {
		return this.valueMoneyAcc -= moneyOut + 5;
	}

	public String toString() {
		return "USER: " + userAccName + " - Account Nº: " + accNumber + " CURRENT BALANCE: " + valueMoneyAcc;
	}

}
