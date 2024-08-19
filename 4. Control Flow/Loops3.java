public class Loops3 {
    
    public static void main(String[] args) {
        
        // for loop
        for(int i = 0; i < 5; i++){
            System.out.println("For Loop Prints " + (i+1));
        }

        // while loop
        // continue executing code block until the loop expression becomes false.
        int cnt = 5;
        while (cnt > 0) {
            System.out.println("While Loops Prints " + cnt);
            cnt--;
        }

        // do while
        // execute the code block once, then continue executing until the loop condition becomes false
        do{
            System.out.println("Do While Loop Prints " + (cnt+1));
            cnt++;
        } while(cnt < 5);

        cnt = 0;
        boolean isReady = false;

        do{
            System.out.println("Do While Prints " + cnt);
            isReady = (cnt < 5);
            cnt++;
        } while (isReady);


        // `continue` -> leaves the execution after it for the current execution.
        int num = 0;
        while (num <= 50) {
            num += 5;
            if(num % 25 == 0){ // doesn't print 25 and 50 
                continue;
            }
            System.out.print(num + "_");
        }

    }

}
