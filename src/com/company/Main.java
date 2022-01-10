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


    }
}
