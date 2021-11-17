package com.employee;

import java.util.Scanner;

public class EmpWage {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		CompanyEmpWage[] company = new CompanyEmpWage[5];
		company[0] = new CompanyEmpWage("TCS", 20, 120, 40);
		employee.computeEmpWage(company[0]);
		
		company[1] = new CompanyEmpWage("Tech-Mahindra", 20, 110, 45);
		employee.computeEmpWage(company[1]);
		
		company[2] = new CompanyEmpWage("Infosys", 20,100, 50);
		employee.computeEmpWage(company[2]);
		
	}
}


