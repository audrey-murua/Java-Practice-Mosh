import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {

        //COMPARISON OPERATORS

        int x = 1;
        int y = 1;
        System.out.println(x == y);
        // = is an assignment operator, assigns a value to a variable
        // == is an equality operator, it compares two values
        // x == y is a boolean expression, is the value of x equal to the value of y, true or false

        int e = 1;
        int h = 1;
        System.out.println(e != h);
        //!= is the inequality operator (means not equal to)

        int o = 1;
        int u = 2;
        System.out.println(o <= u);
        //<= less than or equal to operator

        int v = 1;
        int w = 2;
        System.out.println(v >= w);
        //>= greater than or equal to operator

        //LOGICAL OPERATORS

        //&& and operator, both expressions have to be true, to evaluate to true
        int temperature = 25;
        boolean isWarm = temperature  > 20 && temperature < 30;
        System.out.println(isWarm);

        // \\ or operator both expressions have to be false to evaluate to false, ! not operator reverses the boolean value of variable
        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);

        //IF STATEMENTS

        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("It's a beautiful day");
        } else {
            System.out.println("It's a cold day");
        }


        //curly braces are only required if there is multiple statements, controversial subject
        int temp2 = 32;
        if (temp2 > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp2 > 20)
            System.out.println("It's a beautiful day");
        else
            System.out.println("It's a cold day");


        //Simplifying If Statements

        int income = 120_000;
        boolean hasHighIncome2 = (income > 100_000);
        //declare and initialize variable with a boolean expression instead of doing an if statement, if possible


        //Example of unnecessary if statement
        if (income > 100_000)
        hasHighIncome2 = true;

        System.out.println(hasHighIncome2);


        //TERNARY OPERATOR

        int incomeExample = 120_000;
        String className;

        if (incomeExample > 100_000) {
            className = "First";
        } else {
            className = "Economy";
        }

        //ternary option vs above if statement

        int incomeExample2 = 120_000;
        String className2 = income > 100_000 ? "First" : "Economy";
        //income > 100_000 is the condition,
        // if the condition is true ( ? - beginning of if statement returns true) it will print "First"
        // : - else it will print "Economy"


        //SWITCH STATEMENTS
        //execute different code depending on the value of an expression

        String role = "admin";

        if (role == "admin")
            System.out.println("You are an admin");
        else if (role == "moderator")
            System.out.println("You are a moderator");
        else
            System.out.println("You are a guest");

        //switch statement example

        switch (role) {
            //inside the parenthesis is the variable, role
            // inside the code block (the curly braces), add one or more case clauses
            case "admin" :
                System.out.println("You are an admin");
                //if the boolean value is true when admin is read, "You are an admin will print"
                break;
                //break statement to jump out of this particular switch block / case clause
            case "moderator" :
                System.out.println("You are a moderator");
                break;
            default :
                //default section will execute if the above cases were not printed
                System.out.println("You are a guest");
                //do not need a break statement because it's the end of the switch block, and it will automatially jump out of this block
        }

        // EXERCISE FIZZ/BUZZ

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();


        if((userInput % 3 == 0) && (userInput % 5 == 0)) {
            System.out.println("FizzBuzz");
        } else if ( userInput % 3 == 0) {
            System.out.println("Buzz");
        } else if ( userInput % 5 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(userInput);
        }

        //most specific conditions should be on top and the most generic on the bottom
        //the code reads from top to bottom, meaning that if the first condition is true, it will execute that and ignore the other conditions

        //FOR LOOPS

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World" + i);
        }

        //the for loop will initialize the variable i, then evaluate if i < 5, if so it will increment and print the code block until it doesn't meet the condition anymore. will print 0 - 4

        for (int j = 1; j <= 5; j++) {
            System.out.println("Hello World" + j);
        }

        //same as above except it will begin at 1, not 0. It will print 1 -5

        for (int k = 5; k > 0; k--) {
            System.out.println("Hello World" + k);
        }

        //this will begin at 5 and decrement its way down. Will print 5 - 1

        //WHILE LOOPS













































    }
}
