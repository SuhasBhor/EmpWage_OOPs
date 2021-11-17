package com.employee;

import java.util.Random;
public class Employee {
    final int isFullTime = 2;
    final int isPartTime = 1;
    final String company_name;
    final int totalWorkDays;
    final int maxHrsPMonth; 
    final int empRatePHr;
    int totalEmpWage;
    
   public Employee(String company_name, int totalWorkDays, int maxHrsPMonth, int empRatePHr) {
		this.company_name = company_name;
		this.totalWorkDays = totalWorkDays;
		this.maxHrsPMonth = maxHrsPMonth;
		this.empRatePHr = empRatePHr;
	}

   public int computeEmpWage() {
      int empHrs = 0;
      int empWage = 0;
      int totalEmpHrs = 0;
      int numOfDays = 0;

      while (totalEmpHrs <= maxHrsPMonth && numOfDays < totalWorkDays ) {
         numOfDays++;
         int empCheck = (int) Math.floor(Math.random()*3);
         switch (empCheck) {
            case isFullTime:
               empHrs = 8;
               break;
            case isPartTime:
               empHrs = 4;
               break;
            default:
               empHrs = 0;
            }
         totalEmpHrs += empHrs;
        }
      totalEmpWage = totalEmpHrs * empRatePHr;
      return totalEmpWage;
   }
   
   @Override
   public String toString() {
	   return company_name + " employee total wage :- " + totalEmpWage;
   }
}


