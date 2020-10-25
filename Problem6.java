package problem6;

public class Problem6 {

    private static void longestSubstring(String s) {
        int maxSoFar = 1;
        int maxEnd = 0;
        int endingPosition = 0, startingPosition = 0;
        
        //Calculating length and ending position of the substring
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) >= s.charAt(i)) {
                maxSoFar++;
            }
            else if(maxSoFar > maxEnd){
                maxEnd = maxSoFar;
                maxSoFar = 0;
                endingPosition = i;
            }
           
        }
        
        //Calculate starting position
        startingPosition = endingPosition - maxEnd + 1;
        String result = "";
        
        //String between starting and ending position will give the required sunstring 
        for(int i=startingPosition;i<=endingPosition;i++){
            result = result + s.charAt(i);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String s1 = "asdfaaaabbbbcttavvfffffdf";
        String s2 = "ertfvbhjlnortumkiuytrfdcv";
        String s3 = "aaaacdfthnmoiuytdsdfgh";
        longestSubstring(s1);
        longestSubstring(s2);
        longestSubstring(s3);
    }

}
