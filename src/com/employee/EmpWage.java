package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpWage {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		ArrayList<CompanyEmpWage> company = new ArrayList<CompanyEmpWage>(); //Initializing ArrayList
		
		while(true) {
			System.out.println("Enter Your Choice: "
					+"1.TCS"
					+"  2.Tech-Mahindra"
					+"  3.Infosys");
			Scanner scan = new Scanner(System.in);
			int ch = scan.nextInt();
		
			switch(ch) {
			case 1:
				company.add(new CompanyEmpWage("TCS",20,120,40));
				employee.computeEmpWage(company.get(0));
				System.out.println("Employee Total Wage is "+company.get(0).getTotal_Emp_Wage());
				System.out.println( );
				break;
			case 2:
				company.add(new CompanyEmpWage("Tech-Mahindra",20,110,45));
				employee.computeEmpWage(company.get(1));
				System.out.println("EMployee Total Wage is "+company.get(1).getTotal_Emp_Wage());
				System.out.println( );
				break;
			case 3:
				company.add(new CompanyEmpWage("Infosys",20,100,50));
				employee.computeEmpWage(company.get(2));
				System.out.println("Employee Total Wage is "+company.get(2).getTotal_Emp_Wage());
				System.out.println( );
				break;
				
			default:
				System.out.println("Invalid Choice!!!");
				System.exit(0);
				}
			
		}
	/*	company.add(new CompanyEmpWage("TCS", 20, 120, 40));
		employee.computeEmpWage(company.get(0));
		
		company.add(new CompanyEmpWage("Tech-Mahindra", 20, 110, 45));
		employee.computeEmpWage(company.get(1));
		
		company.add(new CompanyEmpWage("Infosys", 20,100, 50));
		employee.computeEmpWage(company.get(2));*/
		
	}
}


