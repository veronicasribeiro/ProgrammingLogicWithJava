package com.example.conditional.structure;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ChallengeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.print("Annual income with salary: ");
        double annualSalary = scanner.nextDouble();
        System.out.print("Annual income from service provision: ");
        double annualServiceProvision = scanner.nextDouble();
        System.out.print("Annual income with capital gains: ");
        double annualCapitalGains = scanner.nextDouble();
        System.out.print("Medical expenses: ");
        double medicalExpenses = scanner.nextDouble();
        System.out.print("Educational expenses: ");
        double educationalExpenses = scanner.nextDouble();
        System.out.println();


        double monthlySalary = annualSalary / 12;
        double salaryTax;
        if ( monthlySalary < 3000) {
            salaryTax = 0;
        } else if ( monthlySalary >= 3000 &&  monthlySalary < 5000) {
            salaryTax = annualSalary * 0.1;
        } else {
            salaryTax = annualSalary * 0.2;
        }

        double serviceTax;
        if (annualServiceProvision > 0) {
            serviceTax = annualServiceProvision * 0.15;
        } else {
            serviceTax = 0;
        }

        double capitalGainsTax;
        if (annualCapitalGains > 0) {
            capitalGainsTax = annualCapitalGains * 0.2;
        } else {
            capitalGainsTax = 0;
        }

        double grossTax = salaryTax + serviceTax + capitalGainsTax;
        double maximumDeductible = grossTax * 0.3;
        double deductibleExpenses = medicalExpenses + educationalExpenses;
        double abatement;
        double taxDue;

        if (maximumDeductible > deductibleExpenses) {
            abatement = deductibleExpenses;
        } else {
            abatement =maximumDeductible;
        }
        taxDue = grossTax - abatement;

        String salaryTaxFormat = df.format(salaryTax);
        String serviceTaxFormat = df.format(serviceTax);
        String capitalGainsTaxFormat = df.format(capitalGainsTax);
        String grossTaxFormat = df.format(grossTax);
        String maximumDeductibleFormat = df.format(maximumDeductible);
        String deductibleExpensesFormat = df.format(deductibleExpenses);
        String abatementFormat = df.format(abatement);
        String taxDueFormat = df.format(taxDue);

        System.out.println("INCOME TAX REPORT\n");

        System.out.println("CONSOLIDATED INCOME:");
        System.out.println("Salary tax: " + salaryTaxFormat);
        System.out.println("Service tax: " + serviceTaxFormat);
        System.out.println("Capital gains tax: " + capitalGainsTaxFormat);

        System.out.println();
        System.out.println("DEDUCTIONS:");
        System.out.println("Maximum deductible: " + maximumDeductibleFormat);
        System.out.println("Deductible Expenses: " + deductibleExpensesFormat);

        System.out.println();
        System.out.println("SUMMARY");
        System.out.println("Total gross tax: " + grossTaxFormat);
        System.out.println("Abatement: " + abatementFormat);
        System.out.println("Tax due: " + taxDueFormat);

        scanner.close();
    }
}
