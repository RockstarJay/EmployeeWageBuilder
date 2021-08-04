package com.jaybhagat.employeewagebuilder;

/**
 * class to check the attendance of employee if he present for full time, half time or absent using switch case
 * calculate the daily wage of employee depending on attendance
 * @author com.jaybhagat
 */

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		
		int dayHour = 0;
		int dailyWage = 0;
		double empCheck = (Math.floor(Math.random() * 10)) % 3;    // generates three random numbers either 0 or 1 or 2
		
		switch ((int)empCheck) {
			case IS_FULL_TIME:
				System.out.println("Employee is Present Full Time");
				dayHour = 8;
				break;
				
			case IS_PART_TIME:
				System.out.println("Employee Is Present Part Time");
				dayHour = 4;
				break;
				
			default:
				System.out.println("Employee Is Absent");
		}
		dailyWage = WAGE_PER_HOUR * dayHour;                         // calculate daily wage
		System.out.println("Employee Daily Wage is: " +dailyWage);
	}
}
