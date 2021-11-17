package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpWage {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		ArrayList<CompanyEmpWage> company = new ArrayList<CompanyEmpWage>(); //Initializing ArrayList
		
		company.add(new CompanyEmpWage("TCS", 20, 120, 40));
		employee.computeEmpWage(company.get(0));
		
		company.add(new CompanyEmpWage("Tech-Mahindra", 20, 110, 45));
		employee.computeEmpWage(company.get(1));
		
		company.add(new CompanyEmpWage("Infosys", 20,100, 50));
		employee.computeEmpWage(company.get(2));
		
	}
}


