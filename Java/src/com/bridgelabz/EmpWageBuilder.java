package com.bridgelabz;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int MAX_HR_IN_MONTH = 100;
    public static final int NUM_WORKING_DAYS = 20;
    public static final int EMP_RATE_PER_HOUR = 20;

    private static int getWorkingHours() {
        int empHrs;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        return empHrs;
    }
    public EmpWageBuilder() {
        int totalEmpHour = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        while (totalEmpHour <= MAX_HR_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS) {
            totalWorkingDays++;
            int empWage = 0;
            int empHrs = getWorkingHours();

            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage = totalEmpWage + empWage;
            totalEmpHour = totalEmpHour + empHrs;
            System.out.println("Employee Wage is:" + empWage);
        }
        System.out.println("Total Employee wage is:" + totalEmpWage);
        System.out.println("Total Employee Hours is:" + totalEmpHour);
    }
    public static void main(String[] args) {
        new EmpWageBuilder();
    }
}