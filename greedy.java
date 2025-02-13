import java.util.*;
public class greedy{

    public static int getMax(int weight[], int value[], int capacity){
        int ratio[] = new int[weight.length];

        for(int i=0;i<weight.length;i++){
            ratio[i]= value[i]/weight[i];
        }
        int maxValue = 0;
        int j =0;
        for(int i=0;i<ratio.length;i++){
            System.out.println(ratio[i]);
        }
        while (capacity!=0) {
            if(capacity>=weight[j]){
                maxValue+=value[j];
                capacity-=weight[j];
            } else {
                int rest = ratio[j]*capacity;
                maxValue+=rest;
                capacity = 0;
            }
           j++;
        }
        
        return maxValue;
    }

    public static void main(String[] args) {

        int value[]={60,100,120};
        int weight[] = {10,20,30};
        int capacity = 50;

        int x =getMax(weight,value, capacity);
        System.out.println(x);

        // int start[] = {1,3,0,5,8,5};
//         int start[] = {0,5,5,8,3,1};
//         // int end[] =   {2,4,6,7,9,9};
//         int end [] = {6,9,7,9,4,2};
//         int count = 1;
//         int s = end[0];

//         int activity[][] = new int[start.length][3];

//         for(int i=0;i<start.length;i++){
//             activity[i][0] = i;
//             activity[i][1] = start[i];
//             activity[i][2]=end[i];
//         }
// Arrays.sort(activity,Comparator.comparingDouble(o -> o[2]));
//         for(int i=0;i<activity.length;i++){
//             for(int j=0;j<3;j++){

//                 System.out.print(activity[i][j]+" ");
//             }
//         }
    
        // for(int i=1;i<end.length-1;i++){
        //     if(start[i]>=s){
        //         count++;
        //         s = end[i];
        //         System.err.println("activity :"+i);
        //     }
        // }
        // System.out.println(count);
    }
}