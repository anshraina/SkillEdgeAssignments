
package problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

    private static void calculateFactors(int n){
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i=2;i<n;i++){
            int remainder = (int) n%i;
            if(remainder == 0){
               array.add(i);
            }
        }
        if(array.isEmpty()){
            System.out.println(n + " is a prime");
        }
        else{
            for(int i:array){
                System.out.print(i + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactors(n);
        
    }
}
