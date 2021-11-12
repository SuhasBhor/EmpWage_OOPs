package com.employee;

import java.util.Random;
public class Employee {
	public static final int Is_Part = 1;
	public static final int Is_Full = 2;
	public static final int Emp_Rate = 20;
	public static final int Emp_Max_Hours = 100;
	public static final int No_Of_Working_Days = 21;
	
	public int computeEmpWage(String name,int No_Of_Working_Days,int Emp_Max_Hours,int Emp_Rate) {
		int empHrs = 0;
		int totalHrsInMonth = 0;
		int totalWorkingDaysInMonth = 0;
		
		while(totalHrsInMonth <= Emp_Max_Hours && totalWorkingDaysInMonth <= No_Of_Working_Days) {
			Random rand = new Random();
			int empStatus = rand.nextInt(2)+1;
			switch(empStatus) {
			case Is_Part:
				empHrs = 4;
				break;
			case Is_Full:
				empHrs = 8;
				break;
				default:
					empHrs = 0;
			}
			totalHrsInMonth += empHrs;
		}
		int totalWage = totalHrsInMonth * Emp_Rate;
		System.out.println("------ "+name+" ------");
		System.out.println("Total EmpWage For a Month is : "+totalWage);
		return totalWage;
		
	}
}

