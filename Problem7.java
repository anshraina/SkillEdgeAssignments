package problem7;

public class Problem7 {

    //GCD is used to convert a fraction in its reduced form
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcd(a - b, b);
        }
        return gcd(a, b - a);
    }

    public static void mixedFraction(String s) {

        int flag = 0;
        String arr[] = s.split("/");
       
        int numerator = 0;
        int denominator = 0;
        int remainder = 0, quotient = 0;
        numerator = Integer.parseInt(arr[0]);
        
        //Flag is used to check if a number is negative or positive
        if (numerator < 0) {
            flag = 1; 
            numerator = Math.abs(numerator);
        }
        denominator = Integer.parseInt(arr[1]);
        
        //try-catch block is used to counter any divide by zero error
        
        try{
            remainder = numerator % denominator;
            quotient = (int) numerator / denominator;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
            
        if (remainder == 0) {
            System.out.println(quotient);
        } else {
           
            int gcdValue = gcd(remainder, denominator);
            
            remainder = (int) remainder / gcdValue;
            denominator = (int) denominator / gcdValue;
            
            //Final Answer
            //Flag = 0 for positive and 1 is for negative 
            if (flag == 0) {
                System.out.println(quotient + " " + remainder + "/" + denominator);
            } else {
                System.out.println("-" + quotient + " " + remainder + "/" + denominator);
            }
        }

    }

    public static void main(String[] args) {
        String s1 = "42/9";
        String s2 = "6/3";
        String s3 = "-10/7";
        String s4 = "-25/15";
        
        mixedFraction(s1);
        mixedFraction(s2);
        mixedFraction(s3);
        mixedFraction(s4);
        

    }

}
