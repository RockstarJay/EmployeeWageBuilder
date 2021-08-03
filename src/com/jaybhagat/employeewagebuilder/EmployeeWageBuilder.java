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
		int WagePerHour = 20;
		int DayHour = 0;
		int DailyWage = 0;
		double emp_Check = (int) (Math.floor(Math.random() * 10)) % 3;    // generates three random numbers either 0 or 1 or 2
		if (emp_Check == IS_FULL_TIME) {
			System.out.println("Employee is Present Full Time");
			DayHour = 8;
		}
		else if (emp_Check == IS_PART_TIME) {
			System.out.println("Employee is Present Part Time");
			DayHour = 4;
		}
		else {
			System.out.println("Employee is Absent");
		}
		DailyWage = WagePerHour * DayHour;                         // calculate daily wage
		System.out.println("Employee Daily Wage is: " +DailyWage);
	}
}