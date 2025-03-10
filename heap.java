import java.util.*;
public class heap{

static class Student implements Comparable<Student>{
    String name;
    int rank;

    public Student(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(Student s2){
        return this.rank-s2.rank;
    }
}
static class Heap{
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data){
        arr.add(data);

        int x = arr.size()-1;
        int par = (x-1)/2;
        while (arr.get(par)>arr.get(x)) {
            int temp = arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);
            x = par;
            par = (x-1)/2;
        }
    }
    public int peek(){
        return arr.get(0);
    }

    private void heapify(int i ){
        int left = 2*i+1;
        int right = 2*i+2;
        int min = i;

        if(left<arr.size() && arr.get(min)>arr.get(left)){
            min = left;
        }
        if(right<arr.size()&&arr.get(min)>arr.get(right)){
            min = right;
        }
        if(min!=i){
            int temp = arr.get(i);
            arr.set(i,arr.get(min));
            arr.set(min,temp);

            heapify(min);
        }
    }
    
    public int remove(){
        int data = arr.get(0);

        // 1. swap first and last
        int temp = arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1,temp);

        // 2. remove last element
        arr.remove(arr.size()-1);
        heapify(0) ;
        return data;
    }
    public boolean isEmpty(){
        return arr.size()==0;
    }
    public void heapifyMax(int arr[],int i, int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;

        if(left<n && arr[max]<arr[left]){
            max = left;
        }
        if(right<n && arr[max]<arr[right]){
            max = right;
        }
        if(max != i){
            int temp = arr[i];
            arr[i]=arr[max];
            arr[max] = temp;

            heapifyMax(arr,max,n);
        }
    }
    public void heapSort(int arr[]){
        int n = arr.length;
        // 1. make maxheap
        for(int i=n/2;i>=0;i--){
            heapifyMax(arr,i,n);
        }

        // 2. push elemnt at the last

        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapifyMax(arr,0,i);
        }

    }
}


public static void main(String[] args){

int arr[] = {2,3,3,4,6};   
PriorityQueue<Integer> pq = new PriorityQueue<>();
for(int i =0;i<arr.length;i++){
    pq.add(arr[i]);
}
int cost =0;
while(pq.size()>1){
    int min = pq.remove();
    int min2 = pq.remove();
    cost += min+min2;
    pq.add(min+min2);
}
System.out.println(cost);


    // Heap hp = new Heap();
    // int arr[] = {4,5,3,6,2,8,1};

    // hp.heapSort(arr);
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    // }

    // hp.add(3);
    // hp.add(4);
    // hp.add(2);
    // hp.add(1);
    // hp.add(5);
    // hp.add(6);

    // while(!hp.isEmpty()){
    //     System.out.println(hp.peek());
    //     hp.remove();
    // }
//     PriorityQueue<Student> pq = new PriorityQueue<>();

//     pq.add(new Student("shahnawaj",110));
//     pq.add(new Student("shadab",11));
//     pq.add(new Student("amish",9));
//     pq.add(new Student("soyaf",344));
//     pq.add(new Student("rishabh",9));
//     pq.add(new Student("hanif",9));
// PriorityQueue<String> pq1 = new PriorityQueue<>();
// pq1.add("shahnawaj");
// pq1.add("shadab");
// pq1.add("amish");
// pq1.add("soyaf");
// pq1.add("rishabh");
// pq1.add("hanif");
//     while(!pq1.isEmpty()){
//         String s = pq1.remove();
//         System.out.println(s);
//     }
}

}