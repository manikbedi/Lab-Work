package string_and_parsing;

import java.util.Scanner;

public class Exercise2 {
	
	String getImage(String s) {
		StringBuffer str
        = new StringBuffer(s);
		 StringBuffer reverseStr = str.reverse();
		 String image= reverseStr.toString();
		 return (s+" | "+image);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		 sc.close();
		 Exercise2 e2= new Exercise2();
		 System.out.println(e2.getImage(s));

	}

}
