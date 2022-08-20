package lab1;

import java.util.Scanner;

public class Exercise1 {
	int n ;
	
	Exercise1(int n){
		this.n=n;
	}
	
	
	 int calculateSum() {
		 int sum=0;
		 for(int i =0;i<=n;i++) {
			 if(i%3==0 || i%5==0) {
				 sum=sum+i;
			 }
		 }
		 return sum;
		
	}
	
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		Exercise1 s=new Exercise1(n);
		sc.close();
		System.out.println(s.calculateSum());
		
		
	}

}
