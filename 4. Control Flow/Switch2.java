public class Switch2 {


    public static int traditionalGetQuarter(String month){
        switch (month) {
            case "Jan", "Feb", "Mar":
                return 1;
            case "Apr", "May", "Jun":
                return 2;
            case "Jul", "Aug", "Sep":
                return 3;
            case "Oct", "Nov", "Dec":
                return 4;
            default:
                return -1; 
        }
    }

    public static int enchancedGetQuarter(String month){
        return switch(month){
            case "Jan", "Feb", "Mar" -> 1;
            case "Apr", "May", "Jun" -> 2;
            case "Jul", "Aug", "Sep" -> 3;
            case "Oct", "Nov", "Dec" -> 4;
            default ->  -1; 
        };
    }

    public static int enchancedGetQuarter2(String month){
        // if in switch we want to use code block and return at the end of the block we have to use `yield` keyword.
        
        // `yield` : The yield keyword is added to the Java language since Java 14, for implementing switch expression.
                    // It is used to return value from a case in a switch expression.

        return switch(month){
            case "Jan", "Feb", "Mar" -> 1;
            case "Apr", "May", "Jun" -> 2;
            case "Jul", "Aug", "Sep" -> 3;
            case "Oct", "Nov", "Dec" -> 4;
            default ->  { // adding code block
                System.out.println("Invalid Month");
                yield -1;
            }
        };
    }

    public static void main(String[] args) {
        int value = 3;

        // enchanced switch
        switch (value) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3, 4, 5 -> {
                System.out.println("Three, Four Or Five");
                System.out.println("Value was " + value);
            }
            default -> System.out.println("Other");
        }

        String month = "Apr";
        System.out.println(month + " Quarter is " + traditionalGetQuarter(month));
        System.out.println(month + " Quarter is " + enchancedGetQuarter(month));

        month = "X";
        System.out.println(month + " Quarter is " + enchancedGetQuarter2(month));

    }

}
