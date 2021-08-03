package com.jaybhagat.employeewagebuilder;

/**
 * class to check the attendance of employee
 * @author com.jaybhagat
 */

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		int IS_PRESENT = 1;
		double emp_Check = (int) (Math.floor(Math.random() * 10)) % 2;    // generates two random numbers either 0 or 1
		if (emp_Check == IS_PRESENT) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}