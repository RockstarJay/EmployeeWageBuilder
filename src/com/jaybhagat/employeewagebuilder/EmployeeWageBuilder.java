package com.jaybhagat.employeewagebuilder;

/**
 * class to check the attendance and calculate the daily wage of employee
 * @author com.jaybhagat
 */

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		int IS_PRESENT = 1;
		int WagePerHour = 20;
		int DayHour = 0;
		int DailyWage = 0;
		double emp_Check = (int) (Math.floor(Math.random() * 10)) % 2;    // generates two random numbers either 0 or 1
		if (emp_Check == IS_PRESENT) {
			System.out.println("Employee is Present");
			DayHour = 8;
		}
		else {
			System.out.println("Employee is Absent");
		}
		DailyWage = WagePerHour * DayHour;     // calculate daily wage
		System.out.println("Employee Daily Wage is: " +DailyWage);
	}
}