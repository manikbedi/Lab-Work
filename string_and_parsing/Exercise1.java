package string_and_parsing;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		int sum=0,digit;
		Integer number = Integer.valueOf(s);
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
			
		} 
		while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
		
		System.out.println("Sum of number is :"  + sum);
		
		
	}

}
