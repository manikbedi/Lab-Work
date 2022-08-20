package com.eis.bean;

import java.util.Scanner;

public class Employee {
	int id;
	String name,designation;
	double salary;
	String inscheme;
	
	public Employee(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setinsScheme(String ins) {
		this.inscheme=ins;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Add employee");
		System.out.println("2. Update employee");
		System.out.println("3. Delete employee");
		System.out.println("4. View Schemes");
		
		System.out.println("Choose an option");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter ID");
			int id = sc.nextInt();
			System.out.println("Enter employee name");
			String name =sc.nextLine();
			System.out.println("Enter employee salary");
			double salary = sc.nextDouble();
			System.out.println("Enter designation");
			String dsg=sc.nextLine();
			String insscheme=null;
			if(salary>5000 && salary<20000 && dsg.equalsIgnoreCase("System Associate")) {
				insscheme="Scheme C";
			
			}
			Employee e=new Employee(id,name,dsg,salary);
		
		
		}

	}





}
