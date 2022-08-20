package lab4;

public class currentAccount extends Account {
	final double overdraft_limit=500;
	
	@Override
	void withdraw(double money) {
		if(balance>money+500)
		balance=balance-money;
		else
			System.out.println("Low balance : money cannot be withdrawn");
	}

}
