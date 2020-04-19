package com.bridgelabz;

public class EmpBuilderMultiple {
    public static void main(String[] args) {

        CompanyEmpWage  companyEmpWageArray[] = new CompanyEmpWage[3];
        companyEmpWageArray[0] = new CompanyEmpWage("Birla", 50, 20, 100);
        companyEmpWageArray[1] = new CompanyEmpWage("Tata", 50, 20, 80);
        companyEmpWageArray[2] = new CompanyEmpWage("Relaince", 50, 20, 75);
        new EmpWageBuilder(companyEmpWageArray);

    }
}

