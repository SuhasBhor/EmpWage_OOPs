package com.employee;

import java.util.Random;

public class Employee {
	public static void main(String[] args) {
		int ratePerHour=20,empHrsFull=8,empHrsPartTime=4;
		Random rd = new Random();
		int empcheck = rd.nextInt(3);
		switch(empcheck) {
		case 1:
			System.out.println("Salary of Fulltime Employee:" + ratePerHour * empHrsFull);
		break;
		case 2:
			System.out.println("Salary of Parttime Employee:" + ratePerHour * empHrsPartTime );
		break;
		default:
			System.out.println("Employee is Absent Salary: 0");
		}
	}
}

