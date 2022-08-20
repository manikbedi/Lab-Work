package lab4;

import java.util.Random;

public class Account {
	long accNum;
	double balance;
	public Account() {
		// TODO Auto-generated constructor stub
		this.balance=500;
		
	}

	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum() {
		Random rand = new Random(); //instance of random class
	      int upperbound = 9999999;
	      this.accNum= rand.nextInt(upperbound);
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	Person accHolder;

	
	void deposit(double money) {
		balance= balance +money;
		
	}
	void withdraw(double money) {
		balance=balance-money;
		
	}
	double getBalance() {
		return balance;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person smith = new Person("Smith",22);
		Account smithAc = new Account();
		smithAc.setAccHolder(smith);
		smithAc.setAccNum();
		smithAc.setBalance(2000);
		
		Person Kathy=new Person("Kathy",25);
		Account kathyAc=new Account();
		kathyAc.setAccHolder(Kathy);
		kathyAc.setAccNum();
		kathyAc.setBalance(3000);
		smithAc.deposit(2000);
		kathyAc.withdraw(2000);
		System.out.println("Balance of Smith: "+smithAc.getBalance());
		System.out.println("Balance of Kathy: "+kathyAc.getBalance());
		

	}

}

