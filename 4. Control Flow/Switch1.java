public class Switch1 {
    
    public static void main(String[] args) {
        int value = 4;
        
        // if else statements
        if(value == 1){
            System.out.println("One");
        } else if(value == 2){
            System.out.println("Two");
        } else if(value == 3 || value == 4 || value == 5) {
            System.out.println("Three, Four, or Five");
        } else {
            System.out.println("Other");
        }


        // swich statements
        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two"); 
                break;
            case 3: case 4: case 5: // if we have to match multiple case values to single code block
                System.out.println("Three, Four, or Five");
                break;
            default:
                System.out.println("Other");
                break;
        }


        // NOTE: 
        // Once a switch case label matches the switch variable, no more cases are checked.
        // Any code after the case label where there was a match found, will be executed, until a break 
        // statement, or the end of the switch statement occurs.
        // Without a break statement, execution will continue to fall through any case labels declared below 
        // the matching one, and execute each case's code.

        value = 1;

        switch (value) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two"); 
            case 3: case 4: case 5: // if we have to match multiple case values to single code block
                System.out.println("Three, Four, or Five");
            default:
                System.out.println("Other");
        }

    }


}
