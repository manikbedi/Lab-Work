package string_and_parsing;

import java.util.Scanner;

public class Exercise3 {
	String alterString(String s) {
		//StringBuffer sb=new StringBuffer(s);
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U') {
				continue;
			}
			else
				ch[i]=(char)(((int)s.charAt(i))+1);
				
				//sb.insert(i, (char)(((int)s.charAt(i))+1));
			//System.out.println(sb); 
			
		}
		
		return ch.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		sc.close();
		Exercise3 e3 = new Exercise3(); 
		System.out.println(e3.alterString(s));

	}

}
