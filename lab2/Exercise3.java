package lab2;

import java.util.Scanner;
import java.util.Arrays;   
public class Exercise3 {
	int[] getSorted(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int reversed=0;
			while(arr[i] != 0) {
			    
			      // get last digit from num
			      int digit = arr[i] % 10;
			      reversed = reversed * 10 + digit;

			      // remove the last digit from num
			      arr[i] /= 10;
			    }
			arr[i]=reversed;
		}
		int sortarray[]=new int [arr.length];
				Arrays.sort(arr);
		return arr;
				
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements you want to enter");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		Exercise3 s= new Exercise3();
		int sortedarray[]=new int[n];
		sortedarray=s.getSorted(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		

	}

}
