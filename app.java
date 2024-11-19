import java.util.*;

public class app{
public static int kAlgoSum(int arr[]){
    int sum = 0;
    int maxSum = Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
sum = sum+arr[i];
sum = sum < 0 ? 0 : sum;
maxSum = sum > maxSum ? sum : maxSum ;
    }
    if(maxSum==0){
        for(int i=0;i<arr.length-1;i++){
            maxSum = arr[i] > arr[i+1] ? arr[i]: arr[i+1];
        }
    }
    return maxSum;
}
    public static int prefix(int arr[]){
        int prefix[] = new int[arr.length];
prefix[0] = arr[0];
int sum = 0;
int maxSum = Integer.MIN_VALUE;

            // prefix array
        for(int
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        i=1;i<arr.length;i++){
        
            prefix[i] = arr[i]+prefix[i-1];
        }
        
        // for(int i=0;i<arr.length;i++){
        // 
            // System.out.println(prefix[i]);
        // }
        // System.out.println("okk");
        // for(int i=0;i<arr.length;i++){
            // System.out.println(prefix[i]);
        // }
        for(int i=0;i<arr.length;i++){
            sum = 0;
            for(int j=i;j<arr.length;j++){
                sum = i==0 ? prefix[j] : prefix[j]- prefix[i-1]; 
            }
            System.out.println(sum);
           if(sum>maxSum)
           maxSum = sum;
           
        }
        return maxSum;
        
    }
    public static void main(String[] args){
        int arr[] = {1,-2,6,-1,3};
        System.out.println("sum is : " + kAlgoSum(arr));
    }
    
}