package com.jaybhagat.employeewagebuilder;

/**
 * class to check the attendance and calculate the daily wage of employee
 * @author com.jaybhagat
 */

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		int IS_PRESENT = 1;
		int wagePerHour = 20;
		int dayHour = 0;
		int dailyWage = 0;
		double empCheck = (int) (Math.floor(Math.random() * 10)) % 2;    // generates two random numbers either 0 or 1
		if (empCheck == IS_PRESENT) {
			System.out.println("Employee is Present");
			dayHour = 8;
		}
		else {
			System.out.println("Employee is Absent");
		}
		dailyWage = wagePerHour * dayHour;                         // calculate daily wage
		System.out.println("Employee Daily Wage is: " +dailyWage);
	}
}
