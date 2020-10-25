
package problem2;
import java.util.*;

public class Problem2 {

    public static void convertString(String s){
        String result = "";
        int noOfSmallCases = 0;
        int noOfCapitalCases = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                noOfCapitalCases++;
            }
            else{
                noOfSmallCases++;
            }
        }
        if(noOfSmallCases < noOfCapitalCases){
            result = s.toUpperCase();
        }
        else if(noOfSmallCases > noOfCapitalCases){
            result = s.toLowerCase();
        }
        else if(noOfSmallCases == noOfCapitalCases){
            result = s.toLowerCase();
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String s1 = "coDe";
        String s2 = "CODe";
        String s3 = "coDE";
        convertString(s1);
        convertString(s2);
        convertString(s3);
        
    }
   
}
