package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpBuilderMultiple {
    public static void main(String[] args) {

        EmpWageBuilder empBuilder= null;

        ArrayList<CompanyEmpWage> companyEmpWageArrayList = new ArrayList<>();
        companyEmpWageArrayList.add(new CompanyEmpWage("Tata", 30, 30, 100));
        companyEmpWageArrayList.add(new CompanyEmpWage("Birla", 40, 40, 80));
        companyEmpWageArrayList.add(new CompanyEmpWage("Relaince", 50, 50, 75));
        empBuilder = new EmpWageBuilder(companyEmpWageArrayList);

        System.out.println("Enter the name of company of which total wage to be displayed");
        Scanner sc=new Scanner(System.in);
        String companyName=sc.nextLine();
        System.out.println("Total Wage for"+" "+companyName+" is:"+empBuilder.getTotalWageByCompany(companyName));

    }
}

