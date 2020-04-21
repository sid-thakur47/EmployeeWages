package com.bridgelabz;

public class CompanyEmpWage {
    public  String company;
    public  int empRatePerHour;
    public  int numOfWorkingDays;
    public int maxHourInMonth;
    public int totalWage;


    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourInMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHourInMonth = maxHourInMonth;
    }

    public String getCompany() {
        return company;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public int getNumOfWorkingDays() {
        return numOfWorkingDays;
    }

    public int getMaxHourInMonth() {
        return maxHourInMonth;
    }
    public int getTotalWage() {
        return totalWage;
    }
    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }
}