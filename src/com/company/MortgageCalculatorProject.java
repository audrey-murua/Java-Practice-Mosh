package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorProject {

    public static void main (String[] args) {

        //expanding the project

        Scanner scanner = new Scanner(System.in);

        //user has to input a value between $1k to $1M
        System.out.println("Principal ($1000 - $1000000): ");
        int userPrincipal = scanner.nextInt();

        //added while loop to prompt user to enter a valid value
        while(userPrincipal < 1000 || userPrincipal > 1000000) {
            System.out.println("Enter a value between $1000 - $ 1000000: ");
            userPrincipal = scanner.nextInt();
        }

        //user has to input a value between greater than 0 and less than or equal to 30
        System.out.println("Annual Interest Rate: ");
        double userInterestRatePercent = scanner.nextDouble();
        double userInterestRate = (userInterestRatePercent/100) / 12;

        //added while loop to prompt user to enter a valid value
        while(userInterestRatePercent <= 0 || userInterestRatePercent > 30) {
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            System.out.println("Annual Interest Rate: ");
            userInterestRatePercent = scanner.nextDouble();

        }

        //user has to input a value between 1 and 30
        System.out.println("Period (Years): ");
        int loanYears = scanner.nextInt();
        int loanYearsToMonths = loanYears * 12;

        //added while loop to prompt user to enter a valid value
        while(loanYears < 1 || loanYears > 30) {
            System.out.println("Enter a value between 1 and 30.");
            System.out.println("Period (Years): ");
            loanYears = scanner.nextInt();
        }

        double mortgagePayment = userPrincipal * ((userInterestRate * Math.pow((1 + userInterestRate),loanYearsToMonths)) / (Math.pow((1 + userInterestRate),loanYearsToMonths) - 1));
        System.out.printf("Mortgage: %s", mortgagePayment);

        //Mosh Solution

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        //initialized principal to 0 for use outside of while loop scopes
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;


        while (true) {
            //true while loop, must break to avoid infinite loop
            System.out.print("Principal: ");
            //sout asking user for input
            principal = scanner.nextInt();
            //this is the user input
            if (principal >= 1000 && principal <= 1_000_000)
                //if the user input is true, then it will break out of the loop
                break;
            System.out.println("Enter a value between 1000 and 1000000.");
            //if the user input is false according to the conditional, then it will continue looping, asking for valid input

        }

        while (true) {
            //true while loop, must break to avoid infinite loop
            System.out.print("Annual Interest Rate: ");
            //sout asking user for input
            float annualInterest = scanner.nextFloat();
            //this is the user input, does not need to be outside of the scope because it will be converted into monthly interest below. Monthly interest is needed outside of the scope, so it is initialized outside and reassigned in this while loop
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                //if the user input is true, it will calculate it into monthly interest, then it will break out of the loop
                break;
            }
            System.out.println("Enter a value between 1 and 30");
            //if the user input is false according to the conditional, then it will continue looping, asking for valid input
        }

        while (true) {
            //true while loop, must break to avoid infinite loop
            System.out.print("Period (Years): ");
            //sout asking user for input
            byte years = scanner.nextByte();
            //this is the user input, does not need to be outside of the scope because it will be converted into monthly payments below. Monthly payments (numberOfPayments) is needed outside of the scope, so it is initialized outside and reassigned in this while loop
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                //if the user input is true, it will calculate it into monthly payments, then it will break out of the loop
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
            //if the user input is false according to the conditional, then it will continue looping, asking for valid input
        }

            double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }

}
