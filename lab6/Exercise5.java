package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	int getSecondSmallest(int [] arr) 
	{
	Arrays.sort(arr);
	return arr[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i= 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Exercise5 e4= new Exercise5();
		System.out.println(e4.getSecondSmallest(arr));

	}

}
