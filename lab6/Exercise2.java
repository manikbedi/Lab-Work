package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
	
	Map countChars(char[] arr) {
		HashMap <Character,Integer> map= new HashMap<>();
		
		char [] checkarr=new char [arr.length];
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=0;j<checkarr.length;j++) 
			{
				if(arr[i]==checkarr[j]) 
				{
					break;
				}
				else 
				{
				checkarr[j]=arr[i];
				for(int k=i;k<arr.length;k++) 
				{
					if(arr[k]==arr[i])
						count++;
				}
				}
				break;
			}
			map.put(arr[i], count);
			}
		return map;
		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		char [] arr= new char[s.length()];
		arr=s.toCharArray();
		sc.close();
		Exercise2 e2 = new Exercise2();
		System.out.println(e2.countChars(arr));
		
		

	}

}
