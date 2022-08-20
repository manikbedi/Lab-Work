package lab1;

import java.util.Scanner;

public class Exercise4 {
	int n;
	Exercise4(int n){
		
	this.n=n;
	}
	boolean checkNumber() {
		boolean x= (int)(Math.ceil((Math.log(n) / Math.log(2))))
	            == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		Exercise4 s=new Exercise4(n);
		sc.close();
		if(s.checkNumber()) {
			System.out.println("yes");
		}
		else 
			System.out.println("No");
		
		

	}

}
