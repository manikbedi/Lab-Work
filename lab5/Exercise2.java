package lab5;

import java.util.Scanner;
class NameException extends Exception{
	public NameException(String msg){
		super(msg);
	}
}

public class Exercise2 {
	String firstname;
	String lastname;
	Exercise2(String fname,String lname){
		this.firstname=fname;
		this.lastname=lname;
	}

	public static void main(String[] args) throws NameException {
		// TODO Auto-generated method stub
		try{
		Scanner sc= new Scanner(System.in);
		String firstname=sc.nextLine();
		String lastname=sc.nextLine();
		sc.close();
		Exercise2 e2= new Exercise2(firstname,lastname);
		if(firstname.isEmpty()||lastname.isEmpty()) {
			throw  new NameException("you left blank");
		}
		}
		catch(NameException e) {
			e.printStackTrace();
			
		}

	}

}
