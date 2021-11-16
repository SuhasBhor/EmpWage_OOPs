package com.employee;

import java.util.Scanner;

public class EmpWage {
	public static void main(String[] args) {
		 Employee BridgeLabz = new Employee("BrideLabz" , 20 , 120 , 40);
		   BridgeLabz.computeEmpWage();
		   
		   System.out.println(BridgeLabz + "\n");
		   
		
		   Employee TechMahindra = new Employee("Tech-Mahindra", 20 , 110 , 45);
		   TechMahindra.computeEmpWage();
		   
		   System.out.println(TechMahindra + "\n");
		   
		   
		   Employee Infosys = new Employee("Infosys", 20 , 100 , 50);
		   Infosys.computeEmpWage();
		   
		   System.out.println(Infosys + "\n");
	}
}


