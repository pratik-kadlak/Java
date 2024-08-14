public class OpPrecedence5 {
    
    public static void main(String[] args) {
        double var1 = 20.00d;
        double var2 = 80.00d;

        double res = (var1 + var2) * 100;

        double rem = res % 40.00;

        boolean isZero = rem == 0.00 ? true : false;
        System.out.println(isZero);

        if(!isZero)
            System.out.println("Got some remainder");
    }

}   
