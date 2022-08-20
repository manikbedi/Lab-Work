package lab1;

import java.util.Scanner;

public class Exercise3 {
	int n;
	Exercise3(int n){
		this.n=n;
	}
	
	boolean checkNumber() {
		int count=0;
		String s= Integer.toString(n);
		for(int i =0;i<s.length()-1;i++) {
			if((int)s.charAt(i)<(int)s.charAt(i+1)) {
				count++;
			}
		}
		if(count==s.length()-2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		sc.close();
		Exercise3 s=new Exercise3(n);
		if(s.checkNumber()) {
			System.out.println("The number is increasing");
		}
		else
		{
			System.out.println("The number is not increasing");
		}
		
         
	}

}
