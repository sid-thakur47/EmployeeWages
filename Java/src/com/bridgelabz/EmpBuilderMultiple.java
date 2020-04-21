package com.bridgelabz;

import java.util.ArrayList;

public class EmpBuilderMultiple {
    public static void main(String[] args) {
        ArrayList<CompanyEmpWage> companyEmpWageArrayList = new ArrayList<>();
        companyEmpWageArrayList.add( new CompanyEmpWage( "Tata", 30, 30, 100 ) );
        companyEmpWageArrayList.add( new CompanyEmpWage( "Birla", 40, 40, 80 ) );
        companyEmpWageArrayList.add( new CompanyEmpWage( "Relaince", 50, 50, 75 ) );
        new EmpWageBuilder( companyEmpWageArrayList );
    }
}

