package entities;

public class BussinesAccount extends Account {

	private double loanLimit;

	public BussinesAccount() {
		super();
	}

	public BussinesAccount(int numberAccount, String holder, double balance, double loanLimit) {
		super(numberAccount, holder, balance);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= this.loanLimit) {
			System.out.println("EMPRESTIMO CONCEDIDO - TAXA R$ 10.00");
			balance += amount - 10.0;
		} else {
			System.out.println("EMPRÉSTIMO NEGADO - CONSULTE SEU GERENTE");
		}
	}

	@Override
	public String toString() {
		return "BussinesAccount [loanLimit=" + loanLimit + ", numberAccount=" + numberAccount + ", holder=" + holder
				+ ", balance=" + balance + "]";
	}

	
	
	

	
}
