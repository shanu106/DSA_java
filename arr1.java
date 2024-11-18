import java.util.*;

public class arr1{
    public static int [] sort(int[] arr) {
        int newar[] = new int[arr.length];
        int large = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                newar[i]=large;
            }
        }
        return newar;
    }
    public static int findLinArr(int n[]){
        int large = Integer.MIN_VALUE;
    for(int i=0;i<n.length;i++){
        if(n[i] > large){
            large = n[i];
        }
    }    
    return large;
    }
    public static int findInt(int n[] , int key){
for(int i=0;i<n.length;i++){
    if(n[i]== key){
       return i;
    } 
}
return -1;
}
public static String findString(String n[] , String key){
    for(int i=0;i<n.length;i++){
        if(n[i]==key){
            return n[i];
        }
    }
        return "not found";
}

public static int findIndex(int n[] , int key){
int start = 0;
int end = n.length-1;

while (start <= end) {
       int mid = (start+end)/2;
       if(n[mid]==key) {
           return mid;
    }
  if (n[mid]>key){
   end = mid-1;
  } 
else{
   start = mid+1;
}


}
return -1;
}
public static int[] swap(int n[]){
    int f = 0; int l = n.length-1;
    while(f<l){
        int temp = n[f];
        n[f]= n[l];
        n[l] = temp;
        f++;
        l--;
    }
    return n;
}
public static void pair(int n[]){
    for(int i=0;i<n.length-1;i++){
        for(int j=i+1;j<n.length;j++){
            System.out.print("(" + n[i] + "," + n[j] + ")");
        }
        System.out.println();
    }
}
public static void sub(int n[]){
    for(int i=0;i<n.length;i++){
        for(int j=i;j<n.length;j++){
        int sum =0 ;
            for(int k=i;k<=j;k++){
                System.out.print(n[k] + " ");
             sum+=n[k];   
            }
            System.out.print("sum of subarray is " + sum);
            System.out.println();
        }
        System.out.println();
    }
}
public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // String fruits[] = {"apple", "banana","kela"};
        // int n[] = {1,2,3,9,53 , 52};
        // String key = "orangee";
// System.out.println(find(n, 9)); 
// int num[]={3, 5, 12, 23, 34, 45, 56, 67, 78, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
// int num[] = {2,4,6,8,10};
// // bianart search
// sub(num);
// for(int i=0;i<num.length;i++){

   
//     System.out.println(num[i]);
// }
// System.out.println("het");
// int new1[] = swap(num);
// for(int i=0;i<num.length;i++){

// }








// int nums[] = {3,2,3,2,3,2}, l = 2;
// int first = 0; 
// int m = l-1;
// for(int i=0;i<nums.length-m;i++){
//     for(int j=i;j<i+l;j++){
        

//         System.out.print(nums[j]);

//     }
//     int check = l-1;
//     int s = l-i-1;
//     while(check>0){
    //         if(nums[1] > nums[2])
    //         System.out.print("done");
    //         else {
        //             System.out.print("not");
        //         }
        //         m--;
        //     check--;
        //     } 
        
        
        
        //    int n = l;
        
        //     while (i+n-2>=0) {
     
        //         if(nums[i+m-1]>nums[i+m-2]  ){
            
        //             System.out.print(" " + nums[i+l-1]);
//         } else {
    //         System.out.print(" " +"-1");
//     }
//     n--;
// //     } 
//     System.out.println();
//     }
    


        // if(j==2){
            //     System.out.println(nums[j]);
            // }
       

            // if(j==2){
                
            //     if(nums[j]>nums[j-1]){
                //         System.out.print(">" + nums[j]);
        //     } else {
            
        //         System.out.print("<" + "no");
        //     }
        // }
        // int nums[] = {1,2,3,4,3,2,5}, l = 3;
        
        // System.out.print(" " + nums[l-i-]);
        //    if(nums[l-1] > nums[l-2]){

//    } else {
    
//    }



// Output: [-1,3,-1,3,-1]

// int nums[] = {1,2,3,4,3,2,5}, l = 3;

int nums[] = {2,2,2,2,2}, l = 4;
boolean s = true;

for(int i=0;i<nums.length;i++){
int temp = Integer.MIN_VALUE;
   for(int j=i;j<i+l;j++){
    //    System.out.print(nums[j]);
    if(nums[j]==nums[j+1]) break;
   else if(nums[j]>temp) temp = nums[j];
    else break;
}

if(temp==nums[i+l-1])
System.out.print(temp);
else 
System.out.print("-1");
if(i==l+1) break;
System.out.println();
}


}
}
//    System.out.print((nums.length*(nums.length-1))/6);
//    if(i==(){
//     break;
//    }