package com.jaybhagat.employeewagebuilder;

/**
 * class to check the attendance of employee if he present for full time, half time or absent 
 * calculate the daily wage of employee depending on attendance
 * @author com.jaybhagat
 */

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int wagePerHour = 20;
		int dayHour = 0;
		int dailyWage = 0;
		double empCheck = (int) (Math.floor(Math.random() * 10)) % 3;    // generates three random numbers either 0 or 1 or 2
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present Full Time");
			dayHour = 8;
		}
		else if (empCheck == IS_PART_TIME) {
			System.out.println("Employee is Present Part Time");
			dayHour = 4;
		}
		else {
			System.out.println("Employee is Absent");
		}
		dailyWage = wagePerHour * dayHour;                         // calculate daily wage
		System.out.println("Employee Daily Wage is: " +dailyWage);
	}
}
