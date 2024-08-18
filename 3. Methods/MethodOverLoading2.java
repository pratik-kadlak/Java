public class MethodOverLoading2 {

    // Method OverLoading occurs when a class has multiple methods, with the same name, but the methods are 
    // declared with different parameters.

    // So you can execute a method with one name, but call it with different arguments.

    // Java can resolve which method it needs to execute, based on the arguments being passed, 
    // when the method is invoked.


    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        // System.out.println("Player Unnamed" + " scored " + score + " points");
        // return score * 1000;

        // we can also call the other overloaded method from this func
        return calculateScore("Anonymous", 500);
    }

    public static int calculateScore(){
        System.out.println("No player name and no player score.");
        return 0;
    }

    // Even if we have different return types but it still gives error
    // public static void calculateScore(){
    //     System.out.println("No player name and no player score.");
    // }
    
    public static void main(String[] args) {
        calculateScore("Pratik", 500);
        calculateScore(500);
        calculateScore();
    }

}
