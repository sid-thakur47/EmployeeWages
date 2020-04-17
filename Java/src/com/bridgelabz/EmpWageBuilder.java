package com.bridgelabz;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    String company;
    int empRatePerHour;
    int numOfWorkingDays;
    int maxHourInMonth;

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

    public EmpWageBuilder(String company, int empRatePerHour, int numOfWorkingDays, int maxHourInMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHourInMonth = maxHourInMonth;
    }

    public void computeEmployeeWages() {
        int totalWorkHours = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        while (totalWorkHours <= maxHourInMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            totalWorkHours = totalWorkHours + getWorkingHours();
        }
        totalEmpWage = totalWorkHours * empRatePerHour;
        System.out.println("Total Employee wage of " + company + " is:" + totalEmpWage);
    }
}