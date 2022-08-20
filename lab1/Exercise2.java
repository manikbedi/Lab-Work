package lab1;

import java.util.Scanner;

public class Exercise2 {
	int n;
	Exercise2(int n){
		this.n=n;
	}
	int calculateDifference() {
		int sum1=0,sum2=0;
		for(int i=0;i<=n;i++) {
			sum1=sum1+(i*i);
			sum2 =sum2 +i;
		}
		int fsum=sum1-(sum2*sum2);
		return fsum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		Exercise2 s=new Exercise2(n);
		sc.close();
		System.out.println(s.calculateDifference());
		

	}

}
