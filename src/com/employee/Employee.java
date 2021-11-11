package com.employee;

public class Employee {
		public static void main(String[] args) {
			double attendance =Math.floor(Math.random()*2);
	        System.out.println(attendance);
	          if(attendance == 1) {
	    	   System.out.println("Employee is present");
	          }
	          else {
	    	   System.out.println("Employee is absent");
	          }
	     }
}

