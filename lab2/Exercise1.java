package lab2;

import java.util.Scanner;

public class Exercise1 {
	int sort_smallest(int arr[]) {
		int min=0,index = 0;
		for(int j=0;j<arr.length;j++) {
			min=arr[j];
			for(int i=j;i<arr.length-1;i++) {
				if(arr[i+1]<arr[i]) {
					min=arr[i+1];
					index=i+1;
				}
			}
			int temp=arr[index];
			arr[index]=arr[j];
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		return arr[1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements to be added");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		Exercise1 sort= new Exercise1();
		System.out.println("The second smallest number is "+sort.sort_smallest(arr));

	}

}
