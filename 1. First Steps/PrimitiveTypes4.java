public class PrimitiveTypes4 {
    
    public static void main(String[] args) {
        // ############################################################################################################ //

        // stores whole number
        // byte, short, int, long

        // byte -> 1 byte -> 8 bits
        // short -> 2 byte -> 16 bits
        // int -> 4 byte -> 32 bits
        // long -> 8 byte -> 64 bits 

        // to get the size of the datatypes we can use Wrapper class
        System.out.println("Byte Size: " + Byte.SIZE);
        System.out.println("Short Size: " + Short.SIZE);
        System.out.println("Integer Size: " + Integer.SIZE);
        System.out.println("Long Size: " + Long.SIZE);

        System.out.println("Byte Value Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short Value Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Integer Value Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long Value Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        
        // overflow and underflow
        System.out.println("OVERFLOW: " + (Integer.MAX_VALUE+1));
        System.out.println("UNDERFLOW: " + (Integer.MIN_VALUE-1));

        // if we try to assign an datatype value more that its range it throws an error
        // int test = 2147483648;

        // NOTE: an integer wraparound event, either an overflow or underflow, can occur in Java
        // when you are using expressions that are not a simple literal value.
        // The Java compiler doesn't attempt to evaluate the expression to determine its value, so it 
        // DOES NOT give you an error.

        // for eg: the below 2 lines will compile and result in overflow
        // int willThisCompile = (Integer.MAX_VALUE + 1); // YES
        // int willThisCompile = (2147483647 + 1); // YES

        // but if we assign the value directly 
        // int willThisCompile = 2147483648; // NO

        // we can't use commas in number but for incresed readbility we can use '_'
        // int willThisWork = 2,147,483,647; // NO
        // int willThisWork = 2_147_483_647; // YES

        // to declare long values we put 'l' or 'L' after the number 
        // long myLongValue = 100L;

        // becuase if we didn't use L then by default Java treats it as int
        // long myLongVar = 2_147_483_647_321; // even though the variable is long it still considers as int and throws error
        // long myLongVar = 2_147_483_647_321L; // this works

        // Casting -> means to treat or convert a number, from one type to another
        // byte myByteValue = Byte.MIN_VALUE;
        // byte newByteValue = (myByteValue / 2); // right side is int by default so can't assign to byte
        // byte newByteValue = (-128/2); // this works becuase java knows that it can fit it into byte
        
        // byte newByteValue = (byte) (myByteValue/2); // this works

        // challenge
        byte byteVariable = -7;
        short shortVariable = 84;
        int intVariable = 482;
        long longVariable = 50000L + 10L * (byteVariable + shortVariable + intVariable);
        System.out.println(longVariable);

        // ############################################################################################################ //

        // stores decimal number
        // float, double

        // float -> 4 byte -> 32 bits
        // double -> 8 byte -> 64 bits 

        System.out.println("Float Value Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double Value Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        int myIntValue = 5; float myFloatValue = 5; double myDoubleValue = 5;
        
        // NOTE: THE DOUBLE DATATYPE IS JAVA'S DEFAULT DATATYPE FOR REAL NUMBERS.
        // The double datatype can be specified as a numeric literal with a suffix of either 'd' or 'D'
        // but because doubles are default in Java, the suffix is optional to use.
        
        // The float datatype can be specified as a numeric literal with a suffix of lowercase 'f', or 'F'.
        // This suffix is required if you are assigning a real number to a variable that was declared float.

        myFloatValue = 5f;
        myDoubleValue = 5d;

        // we get a error if we try to put real number in float var without 'f'
        // myFloatValue = 3.14; // -> error
        // myFloatValue = (float) 3.14;
        // myFloatValue = 3.14f;

        System.out.println(myIntValue / 2); // o/p is 2 because 
        System.out.println(myFloatValue / 2);
        System.out.println(myDoubleValue / 2);

        System.out.println("For Viewing The precision");
        System.out.println(myIntValue / 3);
        System.out.println(myFloatValue / 3); // till 7 decimal places
        System.out.println(myDoubleValue / 3); // till 16 decimal places

        // Challenge to convert given number of pounds to kilograms (1pound = 0.45359237kilograms)
        int numPounds = 7;
        double numInKilograms = numPounds * 0.45359237;
        System.out.println("Pound: " + numPounds + " converted to Kg: " + numInKilograms);


        // ############################################################################################################ //
        
        // stores character
        // char

        // char -> 2 byte -> 16 bits

        char myChar = 'D';
        // myChar = 'DC'; // Error
        char myUnicode = '\u0044';
        char myASCIIValue = 68;

        System.out.println("myChar: " + myChar);
        System.out.println("myUnicode: " + myUnicode);
        System.out.println("myASCIIValue: " + myASCIIValue);
        
        // ############################################################################################################ //
        
        // stores boolean 
        // boolean

        // boolean -> 1 byte -> 8 bits
        
        boolean myTrueValue = true;
        boolean myFalseValue = false;

        System.out.println(myTrueValue);
        System.out.println(myFalseValue);
    }

}
