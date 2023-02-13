package entities;

public class ContaCorrente {

	private int numberAccount;
	private String userName;
	private double saldo;

	public ContaCorrente() {

	}

	public ContaCorrente(Integer numberAccount, String userName) {
		this.numberAccount = numberAccount;
		this.userName = userName;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void alterarNome(String name) {
		this.userName = name;
	}

	public void deposito(double valorDeposito ) {
		this.saldo += valorDeposito;
		System.out.printf("NUMBER ACC : %d NAME: %s SALDO: %.2f ", this.numberAccount, this.userName, this.saldo);

	}
	
	public void saque(double valorSaque) {
		this.saldo -= valorSaque;
		System.out.printf("NUMBER ACC : %d NAME: %s SALDO: %.2f ", this.numberAccount, this.userName, this.saldo);
	}

	
	public String toString() {
		return "ContaCorrente [numberAccount=" + numberAccount + ", userName=" + userName + ", saldo=" + saldo + "]";
	}
	
	
	

}
