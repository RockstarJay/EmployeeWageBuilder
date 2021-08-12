package com.jaybhagat.employeewagebuilder;

/**
 * class to check the attendance of employee if he present for full time, half time or absent using switch case
 * calculate the daily wage of employee depending on attendance
 * calculating working hours to compare with monthly working hours
 * looping till monthly working days or working hours reached to required
 * adding daily wage to calculate monthly wage and showing result
 * @author com.jaybhagat
 */

public class EmployeeWageBuilder {
	// class level variable or constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	public static final int MONTHLY_WORKING_DAYS = 20;
	public static final int MONTHLY_WORKING_HOURS = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		EmployeeWageBuilder empwage = new EmployeeWageBuilder();
		empwage.getEmployeeWage();
	}
	
	/*
	 * generates three random numbers either 0 or 1 or 2
	 * calculate daily wage
	 * adding into monthly wage
	 * calculating working hours to compare with monthly working hours
	 */
	public void getEmployeeWage() {
		int dayHour = 0;
		int dailyWage = 0;
		int monthlyWage = 0;
		int workingHours = 0;
		
		for (int i = 0; i < MONTHLY_WORKING_DAYS && workingHours < MONTHLY_WORKING_HOURS; i++) {
			double emp_Check = (Math.floor(Math.random() * 10)) % 3;
			
			switch ((int)emp_Check) {
				case IS_FULL_TIME:
					dayHour = 8;
					break;
					
				case IS_PART_TIME:
					dayHour = 4;
					break;
					
				default:
					dayHour = 0;
			}
			dailyWage = WAGE_PER_HOUR * dayHour;
			monthlyWage += dailyWage;
			workingHours += dayHour;
		}	
		System.out.println("\nMonthly Employee Wage is: " +monthlyWage);
	}
}