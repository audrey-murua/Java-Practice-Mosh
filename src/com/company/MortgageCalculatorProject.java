package com.company;

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


    }

}
