package com.employee;

import java.util.Scanner;

public class CompanyEmpWage {
	String name;
	int Total_Working_Days;
	int Max_Working_Hours;
	int Emp_Rate;
	int Total_Emp_Wage;
	
	public int getTotal_Emp_Wage() {
		return Total_Emp_Wage;
	}

	public void setTotal_Emp_Wage(int total_Emp_Wage) {
		Total_Emp_Wage = total_Emp_Wage;
	}
	
	public CompanyEmpWage(String name, int total_Working_Days, int max_Working_Hours, int emp_Rate) {
		super();
		this.name = name;
		Total_Working_Days = total_Working_Days;
		Max_Working_Hours = max_Working_Hours;
		Emp_Rate = emp_Rate;
	}

	@Override
	public String toString() {
		return "------" + name + "------" + "\n"
			  + " Total_Emp_Wage=" + Total_Emp_Wage + "\n";
	}
	
	
}
