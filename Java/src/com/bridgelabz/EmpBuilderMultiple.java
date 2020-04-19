package com.bridgelabz;

import java.util.ArrayList;

public class EmpBuilderMultiple {
    public static void main(String[] args) {

        //  CompanyEmpWage [] companyEmpWageArray = new CompanyEmpWage[3];
        //companyEmpWageArray[0] = new CompanyEmpWage("Birla", 40, 30, 100);
        //companyEmpWageArray[1] = new CompanyEmpWage("Tata", 50, 40, 80);
        //companyEmpWageArray[2] = new CompanyEmpWage("Relaince", 60, 50, 75);
        //new EmpWageBuilder(companyEmpWageArray);

        ArrayList<CompanyEmpWage> companyEmpWageArrayList = new ArrayList<>();
        companyEmpWageArrayList.add(new CompanyEmpWage("Tata", 30, 30, 100));
        companyEmpWageArrayList.add(new CompanyEmpWage("Birla", 40, 40, 80));
        companyEmpWageArrayList.add(new CompanyEmpWage("Relaince", 50, 50, 75));
        new EmpWageBuilder(companyEmpWageArrayList);


    }
}

