import java.util.*;

public class app {
    public static void leftB(int arr[]) {
        int n = arr.length;
        int boundriesL[] = new int[n];
        int boundriesR[] = new int[n];

        boundriesL[0] = arr[0];

        // left max height
        for (int i = 1; i < n; i++) {
            boundriesL[i] = Math.max(arr[i], boundriesL[i - 1]);

        }
        // right max height
int volume = 0;
        boundriesR[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            boundriesR[i] = Math.max(arr[i], boundriesR[i + 1]);

        }
    int min;
    for(int i=0;i<n;i++){
        min = Math.min(boundriesL[i],boundriesR[i]);
        volume += (min-arr[i]);
        System.out.println("index of "+ i + "'s sum is " + volume);
    }
    System.out.println("full volume is : "+ volume);
    
    }

    public static int kAlgoSum(int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            sum = sum < 0 ? 0 : sum;
            maxSum = sum > maxSum ? sum : maxSum;
        }
        if (maxSum == 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                maxSum = arr[i] > arr[i + 1] ? arr[i] : arr[i + 1];
            }
        }
        return maxSum;
    }

    public static int prefix(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        // prefix array
        for (int

        i = 1; i < arr.length; i++) {

            prefix[i] = arr[i] + prefix[i - 1];
        }

        // for(int i=0;i<arr.length;i++){
        //
        // System.out.println(prefix[i]);
        // }
        // System.out.println("okk");
        // for(int i=0;i<arr.length;i++){
        // System.out.println(prefix[i]);
        // }
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            }
            System.out.println(sum);
            if (sum > maxSum)
                maxSum = sum;

        }
        return maxSum;

    }



    public static int buyAndSellStock(int price[]){
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<price.length;i++){
            if(buyingPrice < price[i]){
                int profit = price[i]-buyingPrice;
                maxProfit = Math.max(profit,maxProfit);
                // buyingPrice = price[i];
            } else {
                buyingPrice = price[i];
            }
         
        }
        return maxProfit;
    }
    // Assignment Question 1
    public static boolean distinct(int arr[]){
        int n = arr.length;
      boolean ans = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            // ans = arr[i]==arr[j]? true: false;
                if(arr[i]==arr[j]){
                    ans = true;
                    break;
                }
               
            }
        }
        return ans;
    }

// Assignment Question 5
public static void triplet(int arr[]){

    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){

            for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==0 &&  arr[i]!=arr[j]&& arr[i]!=arr[k]){

                    System.out.println(arr[i] + " " + arr[j]+ " " +arr[k]);
                }
            }
        
        }
   
    }
   
}
    public static void main(String[] args) {
        // int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        // System.out.println("sum is : " + kAlgoSum(arr));
    //    int price[] = {7,1,5,3,6,4};
    //   System4,6,9,0,5,3intln(buyAndSellStock(price));
    // int arr[]={4,6,9,0,5,3,9};
    // System.out.println(distinct(arr));
    int arr[] = {-1,0,1,2,-1,-4};
    triplet(arr);
    }

}