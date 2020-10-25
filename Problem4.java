
package problem4;
import java.util.*;

public class Problem4 {

    public static void camelCase(StringBuffer s){
        StringBuffer res = new StringBuffer();
        for(int i=0;i<s.length();i++){
           if(i == 0){
               res.append(Character.toUpperCase(s.charAt(i)));
           }
           else if(String.valueOf(s.charAt(i)).equals(" ")){
               
               res.append(Character.toUpperCase(s.charAt(i+1)));
               i++;
           }
           else{
               res.append(s.charAt(i));
           }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        String s1 = "hello case";
        String s2 = "camel case world";
        String s3 = "hello World";
        String s4 = "hello c";
        camelCase(new StringBuffer(s1));
        camelCase(new StringBuffer(s2));
        camelCase(new StringBuffer(s3));
        
        
    }
    
}
