package com.jaybhagat.employeewagebuilder;

/**
 * class to get employee wages  for different companies as Each Company has its own 
 * wage, number of working days and working hours per month
 * @author com.jaybhagat
 */

public class EmployeeWageBuilder {
	// class level variable or constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static int wagePerHour;
	public static int monthlyWorkingDays;
	public static int monthlyWorkingHours;
	public static String companyName;
	
	EmployeeWageBuilder(String companyName, int monthlyWorkingHours, int monthlyWorkingDays, int wagePerHour) {
		EmployeeWageBuilder.companyName = companyName;
		EmployeeWageBuilder.monthlyWorkingHours = monthlyWorkingHours;
		EmployeeWageBuilder.monthlyWorkingDays = monthlyWorkingDays;
		EmployeeWageBuilder.wagePerHour = wagePerHour;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		// object for providing arguments to the method 
		EmployeeWageBuilder empwage = new EmployeeWageBuilder(companyName,monthlyWorkingHours,monthlyWorkingDays,wagePerHour);
		empwage.getEmployeeWage("Jay", 100,20,20);
		empwage.getEmployeeWage("Kumar", 100,20,20);
	}
	
	/*
	 * generates three random numbers either 0 or 1 or 2
	 * calculate daily wage
	 * adding into monthly wage
	 * calculating working hours to compare with monthly working hours
	 */
	public void getEmployeeWage(String companyName,int monthlyWorkingHours,int monthlyWorkingDays,int wagePerHour) {
		int dayHour = 0;
		int dailyWage = 0;
		int monthlyWage = 0;
		int workingHours = 0;
		
		for (int i = 0; i < monthlyWorkingDays && workingHours < monthlyWorkingHours; i++) {
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
			dailyWage = wagePerHour * dayHour;
			monthlyWage += dailyWage;
			workingHours += dayHour;
		}	
		System.out.println("\nMonthly Employee Wage for Company "+ companyName+ " is : " +monthlyWage);
	}
}