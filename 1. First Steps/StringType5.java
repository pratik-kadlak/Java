public class StringType5 {
    
    public static void main(String[] args) {
        // String is a class that contains a sequence of characters.

        String myString = "This is a String";
        System.out.println(myString);

        // to print the values which are not in the keyboar we can use unicode values 
        System.out.println("\u0939 in Hindi");

        String num1 = "250.55";
        String num2 = "49.55";

        System.out.println(num1 + num2); // we get concatenated string

        String laString = "10";
        int laNum = 24;

        System.out.println(laString + laNum);

        // Strings Are Immutable
        // Immutable means that you can't change a String after it's created.


    }

}
