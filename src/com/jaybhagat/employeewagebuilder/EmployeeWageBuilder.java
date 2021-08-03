package com.jaybhagat.employeewagebuilder;

/**
 * class to check the attendance of employee if he present for full time, half time or absent using switch case
 * calculate the daily wage of employee depending on attendance
 * adding daily wage to calculate  monthly wage
 * @author com.jaybhagat
 */

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int MONTHLY_WORKING_DAYS = 20;
		
		int dayHour = 0;
		int dailyWage = 0;
		int monthlyWage = 0;
		
		for (int i = 0; i < MONTHLY_WORKING_DAYS; i++) {
			double emp_Check = (Math.floor(Math.random() * 10)) % 3;    // generates three random numbers either 0 or 1 or 2
			
			switch ((int)emp_Check) {
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
			monthlyWage += dailyWage;                                    // adding into monthly wage
		}	
		System.out.println("\nMonthly Employee Wage is: " +monthlyWage);
	}
}