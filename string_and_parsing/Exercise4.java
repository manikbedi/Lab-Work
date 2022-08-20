package string_and_parsing;

import java.util.Scanner;

public class Exercise4 {
	int modifyNumber(int number1) {
		String s= Integer.toString(number1);
		StringBuffer str = new StringBuffer(s);
		for(int k =1;k<s.length()-1;k++) {
			str.deleteCharAt(k);
			str.insert(k,(Math.abs(s.charAt(k-1)-s.charAt(k+1)) ));
			
		}
		
		int number = Integer.parseInt(str.toString());
		
		return number;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		Exercise4 e4= new Exercise4();
		System.out.println(e4.modifyNumber(n));

	}

}
