package lab5;

import java.util.Scanner;

class ageexception extends Exception{
	public ageexception(String msg){
	      super(msg);
	   }
}

public class Exercise1 {
	int age;
	
	Exercise1(int age){
		this.age=age;
	}

	public static void main(String[] args) throws ageexception{
		// TODO Auto-generated method stub
		try {
		Scanner sc= new Scanner(System.in);
		int age= sc.nextInt();
		sc.close();
		if(age<15) {
			throw new ageexception("You age is below 15 years ");
		}
		Exercise1 e1 = new Exercise1(age);
		}
		catch(ageexception e) {
			e.printStackTrace();
			
		}

	}

}
