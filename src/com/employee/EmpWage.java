package com.employee;

import java.util.Scanner;

public class EmpWage {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.addCompany("TCS", 20, 120, 40);
		employee.addCompany("Tech-Mahindra", 20, 110, 45);
		employee.addCompany("Infosys", 20,100, 50);
		
		employee.computeEmpWage();
	}
}


