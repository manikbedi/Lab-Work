package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	Map getSquares(int[] arr) 
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) 
		{
			map.put(arr[i], (arr[i]*arr[i]));
		}
		return map;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size of array");
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		Exercise3 e3= new Exercise3();
		System.out.println(e3.getSquares(arr));
		

	}

}
