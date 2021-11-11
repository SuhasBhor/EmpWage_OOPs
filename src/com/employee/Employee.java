package com.employee;

public class Employee {
	public static void main(String[] args) {
		double attendance = Math.floor(Math.random()*3);
		int ratePerHour=20;
		int empHrsFull = 8;
		int empHrsPartTime= 4;
		if(attendance==1) {
			System.out.println("FullTime Wage");
			System.out.println( ratePerHour * empHrsFull );
		}
		else if(attendance==2) {
			System.out.println("PartTime Wage");
			System.out.println( ratePerHour * empHrsPartTime);
		}
		else {
			System.out.println("Absent");
			System.out.println("Salary = 0");
		}
	}
}

