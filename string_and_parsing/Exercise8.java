package string_and_parsing;

import java.util.Scanner;

public class Exercise8 {
	boolean positive(String s) {
		boolean check =true;
		for(int i=0;i<s.length();i++) {
          for(int j =i+1;j<s.length()-1;j++) {
        	  if((int)s.charAt(i)<(int)s.charAt(j)) {
        		  continue;
        	  }
        	  else 
        		  check=false;
        	  break;
          }
          break;
	}
		return check;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		sc.close();
		Exercise8 e8=new Exercise8();
		if(e8.positive(s)) {
			System.out.println("Positive String");
			
		}
		else
			System.out.println("Not a positive string");

	}

}
