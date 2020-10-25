
package problem1;

import java.util.Scanner;


public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int init = (3*n-3)/2;
        int count =1;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<init;j++){
                System.out.print("-");
            }
            for(int k=0;k<count;k++)
                System.out.print(".|.");
            count+=2;
            for(int j=0;j<init;j++){
                System.out.print("-");
            }
            init = init-3;
            System.out.println();
        }


        int welcome = 3*n -7;
        for(int i=0;i<welcome/2;i++)
            System.out.print("-");
        System.out.print("WELCOME");
        for(int i=0;i<welcome/2;i++)
            System.out.print("-");
        System.out.println();
        
        count-=2;
        int finalize = 3;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<finalize;j++){
                System.out.print("-");
            }
            for(int k=0;k<count;k++)
                System.out.print(".|.");
            count-=2;
            for(int j=0;j<finalize;j++){
                System.out.print("-");
            }
            finalize = finalize+3;
            System.out.println();
        }

        sc.close();
    }
    
}
