package com.bridgelabz;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        int empHrs;
        int empWage = 0;
        int totalEmpWage = 0;
        int day;
        for (day = 0; day <= WORKING_DAYS_PER_MONTH; day++) {
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
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage = totalEmpWage + empWage;
            System.out.println("Employee Wage is:" + empWage);
        }
        System.out.println("Total Employee wage is:" + totalEmpWage);
    }
}