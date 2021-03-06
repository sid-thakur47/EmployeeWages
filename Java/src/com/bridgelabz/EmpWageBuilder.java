package com.bridgelabz;

import java.util.ArrayList;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    String company;
    int empRatePerHour;
    int numOfWorkingDays;
    int maxHourInMonth;
    private ArrayList<CompanyEmpWage> companyEmpWageArray;
    public EmpWageBuilder(){}


    public EmpWageBuilder(ArrayList<CompanyEmpWage> companyEmpWageArray) {
        this.companyEmpWageArray=companyEmpWageArray;
        for (CompanyEmpWage companyEmpWage : companyEmpWageArray) {
            company = companyEmpWage.getCompany();
            empRatePerHour = companyEmpWage.getEmpRatePerHour();
            numOfWorkingDays = companyEmpWage.getNumOfWorkingDays();
            maxHourInMonth = companyEmpWage.getMaxHourInMonth();
            computeEmployeeWages(companyEmpWage);
        }
    }

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
    public Integer getTotalWageByCompany(String companyName) {
        for (CompanyEmpWage companyEmpWage : companyEmpWageArray) {
            if(companyName.equalsIgnoreCase(companyEmpWage.getCompany())){
                return companyEmpWage.getTotalWage();
            }
        }
        return null;
    }

    public void computeEmployeeWages(CompanyEmpWage companyEmpWage) {
        int totalWorkHours = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int dailyWage = 0;
        while (totalWorkHours <= maxHourInMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            totalWorkHours = totalWorkHours + getWorkingHours();
        }
        dailyWage = getWorkingHours() + empRatePerHour;
        companyEmpWage.setTotalWage(dailyWage);
        totalEmpWage = totalWorkHours * empRatePerHour;
        companyEmpWage.setTotalWage(totalEmpWage);
        System.out.println("Total Employee wage of " + company + " is:" + totalEmpWage);
        System.out.println("Daily wage of " + company + " is:" + dailyWage);
    }
}