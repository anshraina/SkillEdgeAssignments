
package problem8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Problem8 {

    private static void convertString(String s){
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        s = s.toLowerCase(); //Ignoring capitalization
        
        //HashMap is used to store character and its frequency count
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i)) + 1);
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }
        StringBuffer result = new StringBuffer();
        
        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i)) > 1){
                result.append(")");
            }
            else{
                result.append("(");
            }
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        String s1 = "din";
        String s2 = "(( @";
        String s3 = "Success";
        convertString(s1);
        convertString(s2);
        convertString(s3);
    }
    
}
