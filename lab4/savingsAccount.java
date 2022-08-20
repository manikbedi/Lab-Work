package lab4;

 class savingsAccount extends Account{
	

	public savingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}


	final double minimum_balance=500;
	

	@Override
	void withdraw(double money) {
		if(balance>money+500)
		balance=balance-money;
		else
			System.out.println("Low balance : money cannot be withdrawn");
	}
	

}
