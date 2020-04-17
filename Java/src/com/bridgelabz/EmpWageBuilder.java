package com.bridgelabz;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
<<<<<<< HEAD
    public static final int MAX_HR_IN_MONTH = 4;
    public static final int NUM_WORKING_DAYS = 20;
    public static final int EMP_RATE_PER_HOUR = 20;
=======
>>>>>>> UC8-ForMultipleCompany

    private static int getWorkingHours() {
        int empHrs;
        int empCheck = (int) Math.floor(Math.random() * 100) % 3;
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
<<<<<<< HEAD
        int totalWorkHours = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        while (totalWorkHours <= MAX_HR_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS) {
            totalWorkingDays++;
            totalWorkHours = totalWorkHours + getWorkingHours();
        }
        totalEmpWage = totalWorkHours * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee wage is:" + totalEmpWage);
=======
        computeEmployeeWage("Birla", 50, 20, 100);
        computeEmployeeWage("Tata", 60, 40, 200);
    }

    public void computeEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourInMonth) {
        int totalWorkHours = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        while (totalWorkHours <= maxHourInMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            totalWorkHours = totalWorkHours + getWorkingHours();
        }
        totalEmpWage = totalWorkHours * empRatePerHour;
        System.out.println("Total Employee wage of " + company + " is:" + totalEmpWage);
>>>>>>> UC8-ForMultipleCompany
    }

    public static void main(String[] args) {
        new EmpWageBuilder();
    }
}