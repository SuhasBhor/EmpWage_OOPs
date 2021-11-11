package com.employee;

import java.util.Random;
public class Employee {
	public static void main(String[] args) {
		int ratePerHour=20,empHrs=0,totalWorkingHrs=0,salary=0;
		int workingDays=20,workingHours=100,day=1;
		while( day <= workingDays && totalWorkingHrs <= workingHours ) {
			Random rd = new Random();
			int empcheck = rd.nextInt(3);
			switch(empcheck) {
				case 1:
					System.out.println(empHrs=8);
					break;
				case 2:
					System.out.println(empHrs=4);
					break;
				default:
					System.out.println(empHrs=0);
				}
			day++;
			System.out.println(totalWorkingHrs=totalWorkingHrs + empHrs);
		}
		System.out.println("Total Working Hour:" +totalWorkingHrs);
		System.out.print("Total Salary:");
		System.out.print(salary=totalWorkingHrs * ratePerHour);
	}
}

