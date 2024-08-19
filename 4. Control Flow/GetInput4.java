import java.util.Scanner;

public class GetInput4 {

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thaks for taking the course.!");

        // if we don't give any birth year then this gives error
        // String birthYear = System.console().readLine("What year you were born in? "); 
        // int age = currentYear - Integer.parseInt(birthYear);
        // return "So you are " + age + " years old.";

        // using exception handling

        String birthYear = System.console().readLine("What year you were born in? ");
        int age;

        try{
            age = currentYear - Integer.parseInt(birthYear);
        } catch(NumberFormatException e){
            int bYear = getInputFromScanner(currentYear);
            age = currentYear - bYear;

        }
        
        return "So you are " + age + " years old.";
    }


    public static int getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thaks for taking the course.!");

        int age = 0;
        boolean validDOB = false;

        do{
            System.out.println("Enter a year of birth >= " + (currentYear-125) + " and <= " + currentYear);
            age = checkData(currentYear, scanner.nextLine());
            validDOB = age < 0 ? false : true;
        } while(!validDOB);

        scanner.close();
        return age;
    }

    public static int checkData(int currentYear, String dob){
        int bd = Integer.parseInt(dob);
        int minYear = currentYear-125;

        if((bd < minYear) || (bd > currentYear))
            return -1;

        return (currentYear-bd);
    }

    
    public static void main(String[] args) {
        String currentYear = "2024";
        String birthYear = "2001";

        int cYear = Integer.parseInt(currentYear);
        int bYear = Integer.parseInt(birthYear);

        System.out.println("Age: " + (cYear-bYear));


        // get input from console
        System.out.println(getInputFromConsole(cYear));
        System.out.println(getInputFromScanner(cYear));

    }

}
