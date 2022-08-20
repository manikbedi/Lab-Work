package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
	
	int [] modifyArray(int arr[]) {
		int count =0;
		for(int j=0;j<arr.length;j++) {
		for(int i=j+1;i<arr.length;i++) {
			if(arr[j]==arr[i]) {
				
				for(int k =i;k<arr.length-1;k++) {
					arr[k]=arr[k+1];
					
				}
				arr[arr.length-1]=0;
			}
			
		}
      }
		Arrays.sort(arr);
		int[] b = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }
        return b;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of elements you want to enter");
		int n = sc.nextInt();
		int[] arr= new int [n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		Exercise4 s= new Exercise4();
		arr=s.modifyArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
