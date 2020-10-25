
package problem5;

public class Problem5 {

    public static void calculateSum(int a[]){
        int res[] = new int[a.length + 1];
        int totalSum = 0;
        int netSum = 0;
        for(int i=0;i<a.length;i++){
            totalSum+= a[i];
        }
        res[0] = totalSum;
        netSum = totalSum;
        for(int i=0;i<a.length;i++){
            netSum -= a[i];
            res[i+1] = netSum;
        }
        for(int i:res){
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        int a1[] = new int[]{0, 1, 3, 6, 10};
        int a2[] = new int[]{1, 2, 3, 4, 5, 6};
        calculateSum(a1);
        System.out.println();
        calculateSum(a2);
        
        
    }
    
}
