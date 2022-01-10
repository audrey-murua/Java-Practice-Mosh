package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");
        //System is a class
        //out is a field
        //println is a method
        //the parenthesis is where you can enter value, in this case a string of "Hello World"

        int age = 35;
        //initializing variable and then running it
//        int age = 35, temperature = 20;
        // declaring multiple variables on a single line, not recommended, makes code difficult to read.
        age = 39;
        //reassigning the variable to a different value
        int temperature = 49;
        //better to declare one variable on each line
        System.out.println(age);

        int myAge = 35;
        int otherAge = myAge;
        //copying value of variable to another variable

        System.out.println(otherAge);

        byte anotherAge = 34;
        //uses less memory than int

        int viewCount = 123_456_789;
        //the underscores serve as commas to make the number more readable (ex: 123,456,789)

        long viewCount2 = 3_123_456_789L;
        // Java as a default sees numbers as integers so if the number is too large for the type, the type needs to be changed and a suffix needs to be added (lowercase or uppercase work)

        float price = 10.99F;
        // Java as a default sees decimals as a double type, so again the suffix needs to be added for float type

        char letter = 'A';
        //single characters use single quotation marks

        boolean isEligible = true;
        // orange words are reserved keywords, cannot be used as identifiers/names of variables, classes or methods




    }
}
