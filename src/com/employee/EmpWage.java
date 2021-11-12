package com.employee;

import java.util.Scanner;

public class EmpWage {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter How Many Companies Wage You Want To Calculate: ");
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			scan.nextLine();
			System.out.print("Enter Company Name: ");
			String name = scan.nextLine();
			
			System.out.print("Enter Max Working Days of Company in Month: ");
			int No_Of_Working_Days = scan.nextInt();
			
			System.out.print("Enter Max Working Hour of Company: ");
			int Emp_Max_Hours = scan.nextInt();
			
			System.out.print("Enter Wage Per Hour: ");
			int Emp_Rate = scan.nextInt();
			
			emp.computeEmpWage(name,No_Of_Working_Days,Emp_Max_Hours,Emp_Rate);	
		}
	}
}
