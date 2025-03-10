import java.util.*;
public class greedy{

    // min absolute diffrence pair 
    public static int minDiff(int a[], int [] b){
      Arrays.sort(a);
      Arrays.sort(b);
        int ans =0;
        for(int i=0;i<a.length;i++){
            if(a[i]>b[i]){
                ans += a[i]-b[i];
            } else {
                ans += b[i]-a[i];
            }
        }
        return ans;
    } 

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

        // MAXIUM LENGTH CHAIN PAIRS
    public static int maxChainLength(int arr[][]){
        
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));
        int len =1;
        int end = arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>end){
                len++;
                end = arr[i][1];
            }
        }
        return len;
    }

    // coin change problem

    public static int coinChange(int amount){
   
        Integer coins [] = {1,2,5,10,20,50,100,500,2000};
      
    //    for(int i=0;i<coins.length/2;i++){
    //         int temp = coins[i];
    //         coins[i] = coins[coins.length-i-1];
    //         coins[coins.length-i-1] = temp;
    //    }
       Arrays.sort(coins,Comparator.reverseOrder());
      int change = 0;
      int j=0;
      while (amount>0) {
        if(coins[j]<=amount){
            amount-=coins[j];
            change++;
            System.out.println("money given "+coins[j]);
        } else{

            j++;
        }
      }
      return change;
    }
    // job sequencing problem 

    public static int jobSequencing(int jobs[][]){
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(jobs,Comparator.comparingDouble(o -> o[1]));
        int maxJobs =0;
        int maxProfit = 0;
        int time = 0;
        int n = jobs.length;
        for(int i=n-1;i>=0;i--){
        
            if(jobs[i][0]>time){
                ans.add(jobs[i][1]);
                time = jobs[i][0];
                maxJobs++;
            }
        }
        System.out.println(ans);
        return maxJobs;
    }

    static class job{
        int id;
        int deadline;
        int profit;

        public job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static int jobSeq(int jobInfo[][]){

        ArrayList<job> jobs = new ArrayList<>();
        int maxJobs = 0;

        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new job(i,jobInfo[i][0],jobInfo[i][1]));
        }
        Collections.sort(jobs, (a,b)->b.profit-a.profit);
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0;i<jobs.size();i++){
            job curr = jobs.get(i);
            if(curr.deadline>time){
                System.out.println(curr.id);
                seq.add(curr.profit);
                maxJobs++;
                time++;
            }
        }
            int maxSum = 0;

            for (int p : seq){
                maxSum+=p;
            }
            System.out.println("max profit :"+maxSum);
            System.out.println(seq);
        return maxJobs; 
    }

    // chocola problem 

    public static int choclate(Integer hor[],Integer ver[]){
        Arrays.sort(hor, Collections.reverseOrder());
        Arrays.sort(ver, Collections.reverseOrder());

        int h = 0;
        int v = 0;
        int hp = 1;
        int vp =1;
        int cost =0;
        while(h<hor.length && v<ver.length){
            if(hor[h]>=ver[v]){
                cost += hor[h]*vp;
                hp++;
                h++;
            } else {
                cost += ver[v]*hp;
                vp++;
                v++;
            }
        }
        while (h<hor.length){
            cost += hor[h]*vp;
            h++;
            hp++;
        } 
        while(v<ver.length){
            cost += ver[v]*hp;
            v++;
            vp++;
        }
        return cost;
    }



    public static void main(String[] args) {
        
        int jobs[][] = {{4,20},{2,30},{1,40},{1,10}}; 
        
        // choclate problem 

        Integer hor [] = {4,1,2};
        Integer ver [] = {2,1,3,1,4};

        System.out.println(choclate(hor,ver));
 

        // System.out.println(jobSeq(jobs));






        int value[]={60,100,120};
        int weight[] = {10,20,30};
        int capacity = 50;
       
        // int x =getMax(weight,value, capacity);
        int a[] = {4,1,8,7};
        int b[] = {2,3,6,5};
        // int ans = minDiff(a,b);

        // int nums[][] = new int[5][2];

    int nums[][] = {{5,24},{39,60}, {5,28},{27,40},{50,90}};
    // System.out.println(jobSequencing(jobs));
        
    // System.out.println(maxChainLength(nums));
        
    // for(int i=0;i<nums.length;i++){
    //     for(int j=0;j<2;j++){
    //         System.out.print(nums[i][j]+" ");
    //     }
    //     System.out.println();
    // }
      
        // System.out.println(ans);

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