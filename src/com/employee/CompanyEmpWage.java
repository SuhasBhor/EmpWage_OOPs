package com.employee;

import java.util.Scanner;

public class CompanyEmpWage {
	String name;
	int Total_Working_Days;
	int Max_Working_Hours;
	int Emp_Rate;
	int Total_Emp_Wage;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal_Working_Days() {
		return Total_Working_Days;
	}

	public void setTotal_Working_Days(int total_Working_Days) {
		Total_Working_Days = total_Working_Days;
	}

	public int getMax_Working_Hours() {
		return Max_Working_Hours;
	}

	public void setMax_Working_Hours(int max_Working_Hours) {
		Max_Working_Hours = max_Working_Hours;
	}

	public int getEmp_Rate() {
		return Emp_Rate;
	}

	public void setEmp_Rate(int emp_Rate) {
		Emp_Rate = emp_Rate;
	}

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
	
	
}
