package com.lab4.cg.eis.exception;

import java.util.Scanner;

class EmployeeException extends Exception{
	public EmployeeException(String s) {
	super(s);
	}
}

public class Exercise3 {
	double salary;

	public static void main(String args[]) throws EmployeeException {
		try {
		Scanner sc = new Scanner (System.in);
		double salary=sc.nextDouble();
		
		if(salary<3000) {
			throw new EmployeeException("Salary is less than 3000");
		}
		}
		catch(EmployeeException e) {
			e.printStackTrace();
		}
	}

}
