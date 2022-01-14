package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorProject {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int userPrincipal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        double userInterestRatePercent = scanner.nextDouble();
        double userInterestRate = (userInterestRatePercent/100) / 12;

        System.out.println("Period (Years): ");
        int loanYears = scanner.nextInt();
        int loanYearsToMonths = loanYears * 12;

        double mortgagePayment = userPrincipal * ((userInterestRate * Math.pow((1 + userInterestRate),loanYearsToMonths)) / (Math.pow((1 + userInterestRate),loanYearsToMonths) - 1));
        System.out.printf("Mortgage: %s", mortgagePayment);

        //Mosh Solution

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }

}
