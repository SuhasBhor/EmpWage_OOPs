package com.employee;

import java.util.Random;
public class Employee {
    int numberOfCompany = 0;
	final int isFullTime = 2;
    final int isPartTime = 1;
    int totalEmpWage;
    
    CompanyEmpWage [] companyEmpWage = new CompanyEmpWage[5];
    
    public void addCompany(String name, int Total_Working_Days, int Max_Working_Hours, int Emp_Rate) {
    	companyEmpWage[numberOfCompany] = new CompanyEmpWage(name, Total_Working_Days, Max_Working_Hours, Emp_Rate);
    	numberOfCompany++;
    }
    
    public void computeEmpWage() {
    	for (int i = 0; i < numberOfCompany; i++) {
			companyEmpWage[i].setTotal_Emp_Wage(this.computeEmpWage(companyEmpWage[i]));
			System.out.println(companyEmpWage[i]);
		}
    }
    

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {
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
      totalEmpWage = totalEmpHrs * companyEmpWage.Emp_Rate;
      return totalEmpWage;
   }
}


