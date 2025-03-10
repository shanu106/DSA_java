import java.util.*;

public class HashMap<K,V>{

    private class Node{
        K key;
        V value;

        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
    private int n;
    private int N;
    private LinkedList<Node> buckets[];

    @SuppressWarnings("unchecked")
    public HashMap(){
        this.N = 4;
        this.buckets = new LinkedList[4];

        for(int i=0;i<4;i++){
            this.buckets[i] = new LinkedList<>();
        }
    }

    @SuppressWarnings("unchecked")
    public void reHash(){           // rehashing
        LinkedList<Node> oldBuckets[] = buckets;
        this.N = 2*this.N;
        this.buckets = new LinkedList[this.N];
        for(int i=0;i<buckets.length;i++){
            this.buckets[i] = new LinkedList<>();
        }
        for(int i=0;i<oldBuckets.length;i++){
            LinkedList<Node> ll = oldBuckets[i];
            for(int j=0;j<ll.size();j++){
                Node node = ll.get(j);
                put(node.key,node.value);
            }
        }
    }
    // 1 put function 

    // ___________________________________________
    
    private int hashFunction(K key){
        int hc = key.hashCode();
        return Math.abs(hc)%N;
    }
    private int findInBucket(int bi, K key){
        LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i =0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key.equals(key)){
                    return di;
                }
                di++;
            }
            return -1;
    }
    public void put(K key, V value){
        int bi = hashFunction(key);
        int di = findInBucket(bi,key);

        if(di != -1){                   // key is already exists 
                Node node = this.buckets[bi].get(di);
                    node.value = value;
        } else {                        // key is not exists add new node
            Node node =new Node(key,value);
            this.buckets[bi].add(node);
           n++;
        }
        double lambda = (double)n/N;
        if(lambda>2.0){
            reHash();
        }

    }
// ___________________________________________

// 2 contains key
// ___________________________________________

public boolean containsKey(K key){
    int bi = hashFunction(key);
    int di = findInBucket(bi,key);
    if(di!=-1){
        return true;
    } else {
        return false;
    }
}
// ___________________________________________

// 3 remove key
// ___________________________________________
public V remove(K Key){
    int bi = hashFunction(Key);
    int di = findInBucket(bi,Key);
    
    if(di!= -1){
        Node node = buckets[bi].remove(di);
        n--;
       return node.value;
    }  else
    return null;
}
// ___________________________________________

// 4 get value
// ___________________________________________
public V get(K key){
    int bi = hashFunction(key);
    int di = findInBucket(bi,key);

    if(di != -1){                   // key is already exists 
            Node node = this.buckets[bi].get(di);
               return node.value;
    } else {                        // key is not exists add new node
        return null;
    }
}
// ___________________________________________

// 5 key set
// ___________________________________________
public ArrayList<K> keySet(){
    ArrayList<K> keys = new ArrayList<>();

    for(int i=0;i<buckets.length;i++){
        LinkedList<Node> ll = buckets[i];
        for(int j = 0;j<ll.size();j++){
            Node node = ll.get(j);
            System.out.println("Key : "+node.key+" value : "+node.value);
            keys.add(node.key);
        }
    }
    return keys;
}
// ___________________________________________
public static void main(String [] args){
        HashMap<String, Integer> hp = new HashMap<>();

        hp.put("India",100);
        hp.put("USA",200);
        hp.put("UK",300);
        hp.put("China",400);
        hp.put("Nepal",500);
        hp.put("Bhutan",600);
       hp.keySet();
    }

}