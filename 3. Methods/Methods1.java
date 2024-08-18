public class Methods1 {

    public static void displayHighScorePosition(String name, int pos){
        System.out.println(name + " managed to get into position " + pos + " on the high score list");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000) return 1;
        if(score >= 500) return 2;
        if(score >= 100) return 3;
        return 4;
    }

    public static void main(String[] args) {
        // a method declares executable code that can be invoked, passing a fixed number of values as arguments.

        displayHighScorePosition("Pratik", calculateHighScorePosition(1500));
        displayHighScorePosition("Pratik", calculateHighScorePosition(1000));
        displayHighScorePosition("Pratik", calculateHighScorePosition(500));
        displayHighScorePosition("Pratik", calculateHighScorePosition(100));
        displayHighScorePosition("Pratik", calculateHighScorePosition(25));

    }

}