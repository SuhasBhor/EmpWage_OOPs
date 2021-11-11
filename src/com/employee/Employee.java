package com.employee;

public class Employee {
	public static void main(String[] args) {
		double attendance = Math.floor(Math.random()*2);
		int wages,ratePerHour=20,empHrs=8; 
        System.out.println(attendance);
        if(attendance == 1) {
	   		wages=ratePerHour*empHrs;
	   		System.out.println("Employee is present \nwages = " + wages);
        }else {
	        wages=0;
	   		System.out.println("Employee is absent \nwages = " + wages);
        }
	}
}

