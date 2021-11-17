package com.employee;

import java.util.ArrayList;
import java.util.Random;

public class Employee implements EmpWageBuilder{
    int numberOfCompany = 0;
	final int isFullTime = 2;
    final int isPartTime = 1;
    int totalEmpWage;
    
    ArrayList<Integer> dailyEmpWageArray = new ArrayList<Integer>();
    public void computeEmpWage(CompanyEmpWage companyEmpWage) {
      int empHrs = 0;
      int empWage = 0;
      int totalEmpHrs = 0;
      int numOfDays = 0;
      int dailyEmpWage=0;
      
      while (totalEmpHrs <= companyEmpWage.Max_Working_Hours && numOfDays < companyEmpWage.Total_Working_Days ) {
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
         dailyEmpWage = totalEmpHrs * companyEmpWage.Emp_Rate;
         dailyEmpWageArray.add(dailyEmpWage);
         System.out.println("Day "+numOfDays+ " EmpWage is "+dailyEmpWage);
        }
      companyEmpWage.setTotal_Emp_Wage(totalEmpHrs* companyEmpWage.Emp_Rate);
      System.out.println("\nEmployee Monthly Wage of Company "+companyEmpWage.name+ " is "+companyEmpWage.Total_Emp_Wage+"\n");
   }
}


