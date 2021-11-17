package com.employee;

import java.util.Random;

public class Employee implements EmpWageBuilder{
    int numberOfCompany = 0;
	final int isFullTime = 2;
    final int isPartTime = 1;
    int totalEmpWage;
  
    public void computeEmpWage(CompanyEmpWage companyEmpWage) {
      int empHrs = 0;
      int empWage = 0;
      int totalEmpHrs = 0;
      int numOfDays = 0;

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
        }
      companyEmpWage.setTotal_Emp_Wage(totalEmpHrs* companyEmpWage.Emp_Rate);
      System.out.println("Employee Monthly Wage of Company "+companyEmpWage.name+ " is "+companyEmpWage.Total_Emp_Wage);
   }
}


