package com.employee;

import java.util.Scanner;

public class EmpWage {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.computeEmpWage("TCS",20,120,40);
		
		emp.computeEmpWage("Infosys", 20, 110, 45);
		
		emp.computeEmpWage("Tech-Mahindra", 20, 100, 50);
	}
}


