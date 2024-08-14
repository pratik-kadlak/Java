public class IfThen1 {

    public static void main(String[] args) {
        boolean isAlien = false;

        // if wrote without "{}" then only 1 line is in the if block
        if(isAlien == false)
            System.out.println("Not An Alien..!");

        if(isAlien == false) {
            System.out.println("Not An Alien");
            System.out.println("It's a Human");
        }

    }

}
