package com.company;

import java.awt.*;

import java.util.Arrays;
import java.util.Date;
//util packages that have been imported

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

        //initializing reference type variable
        Date now = new Date();
       // date has util package so in order to use a class from a different package, we need to import it. It is imported at the very top
        // new operator is used to allocate memory for this variable
        // repeat the class of date
        // new Date(); is an instance of the date class and is a defined template/blueprint for creating new objects/new instances
        System.out.println(now);

        byte x = 1;
        byte y = x;
        // byte x has a value of 1.
        // byte y has the value of x which is 1

        x = 2;
        //reassigning the value of x to 2

        System.out.println(y);
        //just because the value of x was reassigned a value, y does not take on that change because x and y are independent of each other
        // result of y is still 1

        Point point1 = new Point(1,1);
        //point has util package that was imported to the top
        Point point2 = point1;
        //point1 and point2 are referencing the exact same point object in memory which means they are not independent of each other
        point1.x = 2;
        System.out.println(point2);
        //result is that if you change point1, point2 will be affected as well


        //Strings

        String message = "Hello World" + "!!!";
        //strings are reference types, but because it is often used, does not need the new operator and does not need to repeat the class
        //strings can be concatenated with a +
        //String is a class and can access the . operator for methods
        System.out.println(message);

        System.out.println(message.endsWith("!!"));
        //the endsWith method that was called returns a boolean of true because the string message does in fact end with !!
        //another useful method for strings is .startsWith   returns false because it does not begin with !!
        System.out.println(message.startsWith("!!"));

        System.out.println(message.length());
        //counts the number of characters in the string

        System.out.println(message.indexOf("W"));
        //finds the index of the character that was called if it exists, otherwise -1 will be displayed

        System.out.println(message.replace("!", "*"));
        //replaces a character with another, this case replaces the argument of ! with an argument of *
        //does not modify original message string, but returns a new string with the modifications because strings are immutable, cannot be changed
        //any methods that modify a string will return a new string object

        System.out.println(message.toLowerCase());
        //toLowerCase converts all characters to lowercase

        System.out.println(message.toUpperCase());
        //toUpperCase converts all characters to uppercase

        System.out.println(message.trim());
        //gets rid of extra white spaces that are at the beginning or the end of a string

        //ESCAPE SEQUENCES

        String doubleQuoteEscape = "This is how to use \"double quotes\" in a string.";
        System.out.println(doubleQuoteEscape);
        // backslashes before the quotes allows them to be visible within the string

        String backSlashEscape = "C:\\Windows\\...";
        System.out.println(backSlashEscape);
        // a backslash before a backslash escapes it so that it can be viewed when printed

        String backSlashN = "Another example\nusing a different escape sequence";
        System.out.println(backSlashN);
        // \n creates a new line where it is placed

        String backSlashT = "The\t tab escape sequence";
        System.out.println(backSlashT);
        // \t creates a tab where it is placed

        //ARRAYS

        //one way to declare and instantiate an array (older method)
        int[] numbers = new int [5];
        //type, [] refers to creating an array, = new because it's a reference type, type again, [5] is how many elements within the array
        numbers[0] = 1;
        //setting the first index of the array a value of 1

        System.out.println(Arrays.toString(numbers));
        //Arrays.toString(); is how to call the numbers array

        //another way to declare and instantiate an array
        int[] numbers2 = {1, 3, 2, 5, 4};

        System.out.println(Arrays.toString(numbers2));

        Arrays.sort(numbers2);
        //.sort() sorts the integers in the array from least to greatest
        System.out.println(Arrays.toString(numbers2));

        System.out.println(numbers2.length);
        //counts the amount of elements in the array

        //MULTIDIMENSIONAL ARRAYS

        //2D Array
        int [][] matrix = new int[2][3];
        //this will make a matrix with 2 rows and 3 columns

        matrix[0][0] = 1;
        //first index of the row, first index of the column = 1

        System.out.println(Arrays.deepToString(matrix));
        //to print out the 2D matrix, use deepToString

        //Another way to create a 2D array
        int [][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(matrix2));

        int [][][] matrix3D = new int[2][3][5];
        //can turn this into a multidimensional array by adding more brackets
        //or using the other method and using more curly braces

        //CONSTANTS

        final float PI = 3.14F;
        //final is the keyword to make the variable a constant. Similar to const in JS, you cannot change the value of the variable later on
        // use all capital letters when naming a constant variable, with underscores separating words

        //ARITHMETIC EXPRESSIONS

        int result = 10 + 3;
        System.out.println(result);

        int result2 = 10 - 3;
        System.out.println(result2);

        int result3 = 10 * 3;
        System.out.println(result3);

        int result4 = 10 / 3;
        System.out.println(result4);
        // division only prints whole numbers because of the int type

        double result5 = (double)10 / (double) 3;
        System.out.println(result5);
        //this will give a floating point number

        int i = 1;
        i++;
        System.out.println(i);
        //post increments

        int j = 1;
        int k = j++;
        System.out.println(j);
        System.out.println(k);
        //k will copy the value of j which is 1, and then it will increment 1 to 2 so the value of j will be 2










































    }
}
