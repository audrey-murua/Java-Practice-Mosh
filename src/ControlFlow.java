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











    }
}
