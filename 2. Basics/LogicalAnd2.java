public class LogicalAnd2 {

    public static void main(String[] args) {
        int topScore = 100;

        // equals
        if(topScore == 100){
            System.out.println("You Got the High Score");
        }

        // not equals
        if(topScore != 100){
            System.out.println("You Didn;t got the high score");
        }

        // greater
        if(topScore > 100){
            System.out.println("How is this possible");
        }

        // lesser
        if(topScore < 100){
            System.out.println("You need to improve");
        }

        topScore = 80;
        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100)
            System.out.println("This is the And Operator");


    }

}