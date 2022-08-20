package lab2;

import java.util.Scanner;

public class Exercise2 {
	
	void sort(String strAr[],int size) {
		 for(int i = 0; i < size-1; i++ ) {
	         for(int j = i+1; j < strAr.length; j++) {
	            if(strAr[i].compareTo(strAr[j])>0) {
	               String temp = strAr[i];
	               strAr[i] = strAr[j];
	               strAr[j] =  temp;
	            }
	         }
	      }
		  up_lc(strAr,size);
	}
	void up_lc(String strAr[],int n) {
		if(n%2==0) {
			for(int i=0;i<=(n/2);i++) {
				strAr[i]=strAr[i].toUpperCase();
			}
			for(int i=(n/2)+1;i<n;i++) {
				strAr[i]=strAr[i].toLowerCase();
			}
			
		}
		else
		{
			for(int i=0;i<=((n/2)+1);i++) {
				strAr[i]=strAr[i].toUpperCase();
			}
			for(int i=(n/2)+2;i<n;i++) {
				strAr[i]=strAr[i].toLowerCase();
			}
			
		}
		
	}
	void display(String strAr[]) {
		for(int i=0;i<strAr.length;i++) {
			System.out.println(strAr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of elements you want to enter");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String[] strAr = new String[n+1];
		for(int i =0;i<=n;i++) {
			strAr[i]=sc.nextLine();
		}
		sc.close();
		Exercise2 s=new Exercise2();
		s.sort(strAr,n);
		s.display(strAr);
		

	}

}
