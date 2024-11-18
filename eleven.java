import java.util.*;

public class eleven {

public static int maxSum(int arr[]){
    int maxSum = Integer.MIN_VALUE;
int sum = 0;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
             sum = 0;
            for(int k=i;k<j;k++){
                sum += arr[k];
            }
                 System.out.println(sum);
                 if (sum > maxSum) {
                     maxSum = sum;
                    }
                
            }
    }
    return maxSum;
}
    public static void sumSubArray (int n[]){
        int sum = 0 ;
        for(int i=0;i<n.length;i++){
            int start = i;
            for(int j= 0;j<n.length;j++){
                int end = j;
                for(int k=i;k<j;k++){
                    System.out.print(n[k]);
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

int [] arr = {2,4,6,8,10};

System.out.println("max is : " +maxSum(arr));

// for(int i=0;i<arr.length;i++){
//     for(int j=i+1;j<=arr.length;j++){
//         System.out.print(j);
//     }
//     System.out.println(

//     );
// }


    }
}
