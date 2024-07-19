public class Operators6 {

    public static void main(String[] args) {
        // Operators:
        // Operators in Java are special symbols that perform specific operations on one, or more and then returns a result

        // Operand:
        // Operand is a term used to describe any object that is manipulated by an operator.

        System.out.println(3+2); // addition
        System.out.println(3-2); // subtraction
        System.out.println(3*2); // multiplication
        System.out.println(3/2); // division
        System.out.println(3%2); // modulo

        char firstChar = 'A', secondChar = 'B';
        System.out.println(firstChar + secondChar); // adds ASCII values 

        // if we want 'AB' then we have to concat to String
        System.out.println("" + firstChar + secondChar);

        // Abbrevating Operators 
        System.out.println("Abbrevating Operatos OR Short Hand Operators");


        int result = 1;

        result = result + 1; // value to 2;
        result += 1; // value to 3
        result++; // increments by 1 so result ia 4
        System.out.println(result);

        result = result - 1;
        result -= 1;
        result--;
        System.out.println(result);

        result += 5.5;
        // result = result + 5.5; this give error as it's lossy conversion
        System.out.println(result);

        result *= result; // squaring
        System.out.println(result);

        result /= result;
        System.out.println(result); // dividing by itself
    }

}
