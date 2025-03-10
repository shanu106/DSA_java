import java.util.*;
public class bst {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data=d;
            left = null;
            right = null;
        }
    }
       
    static class Info{
        boolean isBST;
        int min;
        int max;
        int size;
        int sum;
        public Info(boolean isBST, int min, int max, int size,int sum){
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.size = size;
            this.sum = sum;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        public static void inOrder(Node root){
            if(root == null) return;

            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
        static int i=0;
        public static boolean search(Node root, int n){
            if(root == null) return false;
            i++;
            if(n<root.data){
               return search(root.left,n);
            }else if(root.data==n){
               
                return true;
               
            } else{
              
             return search(root.right,n);
                
            }
        
        } 
        public static Node bst(Node root, int val){
            if(root == null) {
                return new Node(val);
            }
            if(root.data>val){
                root.left = bst(root.left, val);
            } else {
                root.right = bst(root.right, val);
            }
            return root;
        }
        public static Node deletes(Node root, int val){
           
           if(root.data>val){
            root.left = deletes(root.left,val);
           } else if(root.data<val){
            root.right = deletes(root.right,val);
            } else {
                if(root.left == null && root.right ==null){
                return null;
            } else if(root.left == null ){
                return root.right;
            } else if(root.right == null){
                return root.left;
            } else {
                Node is = findInOrderSuccessor(root.right);

                root.data = is.data;
               root.right= deletes(root.right,root.right.data);
            }
           }
           return root;
            }
        public static Node findInOrderSuccessor(Node root){
                while(root.left != null){
                    root = root.left;
                }
                return root;
            }
        public static void printInRange(Node root, int k1, int k2){
            if(root==null) return;

            if(root.data >=k1 && root.data<=k2){
                printInRange(root.left,k1,k2);
                System.out.println(root.data);
                printInRange(root.right,k1,k2);
            } else if(root.data < k2){
               
                printInRange(root.left,k1,k2);
            } else if (root.data > k1) {
               
                printInRange(root.right,k1,k2);
            }
        }
        public static void preOrder(Node root){
            if(root == null) return;

            System.out.print(root.data+"-->");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void rootToLeaf(Node root, ArrayList<Integer> path){
            if(root == null) return;
            path.add(root.data);
            if(root.left==null && root.right == null){
                System.out.print(path);
               
            }
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
            path.remove(path.size()-1);
            

        }
     
        public static int maxSize= 0;
        public static int maxSum = 0;
        public static Info maxBSTSize(Node root){
            if(root == null){
                return new Info(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0,maxSum);
            }
            Info leftMax = maxBSTSize(root.left);
            Info rightMax = maxBSTSize(root.right);
             int size = leftMax.size+rightMax.size+1;
            int min = Math.min(root.data,Math.min(leftMax.min,rightMax.min));
            int max = Math.max(root.data,Math.max(leftMax.max,rightMax.max));
            int sum = leftMax.sum+rightMax.sum+root.data;
            if(leftMax.max >=root.data || rightMax.min <= root.data){
                return new Info(false,min,max,size,0);
            }
            if(leftMax.isBST && rightMax.isBST){
                maxSize = Math.max(maxSize,size);
             return new Info(true,min,max, size,root.data);
            }
            return new Info(false,min,max, size,root.data);

        }
        public static void getInOrder(Node root, ArrayList<Integer> arr){
            if(root == null) return;

            getInOrder(root.left,arr);
            arr.add(root.data);
            getInOrder(root.right,arr);
        }
        public static Node mergeBst(Node root1, Node root2){

            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();
            
            getInOrder(root1,arr1);
            getInOrder(root2,arr2);
            int i =0, j =0;
            
            ArrayList<Integer> finalArr = new ArrayList<>();
            while (i<arr1.size()&&j<arr2.size()) {
                if(arr1.get(i)<arr2.get(j)){
                    finalArr.add(arr1.get(i));
                    i++;
                } else {
                    finalArr.add(arr2.get(j));
                    j++;

                }

            }
            while (i<arr1.size()) {
                finalArr.add(arr1.get(i++));
            }
            while(j<arr2.size()){
                finalArr.add(arr2.get(j++));
            }
            
            return add(finalArr,0,finalArr.size()-1);
            

           }
           public static Node add(ArrayList<Integer> arr,int si, int ei){

            if(si>ei)return null;

            int mid = si+(ei-si)/2;

            Node root = new Node(arr.get(mid));
            root.left = add(arr,si,mid-1);
            root.right = add(arr,mid+1,ei);
        
            return root;
        }
        }
    

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();


            Node root1 = new Node(2);
                root1.left = new Node(1);
                root1.right = new Node(4);
            Node root2 = new Node(9);
                root2.left = new Node(3);
                root2.right = new Node(12);

            Node root = tree.mergeBst(root1,root2);

            ArrayList<Integer> arr = new ArrayList<>();

            tree.rootToLeaf(root,arr);


            //           50
            //          /  \
            //       30       60  
            //      /  \     /   \
            //      5   20  45     70   
            //                    /   \
            //                   65     80
            
        //     Node root = new Node(50);
        //     root.left = new Node(30);
        //     root.right = new Node(60);
        //     root.left.left = new Node(5);
        //     root.left.right = new Node(20);
        //     root.right.left = new Node(45);
        //     root.right.right = new Node(70);
        //     root.right.right.left = new Node(65);
        //     root.right.right.right = new Node(80);
        //   Info info=  tree.maxBSTSize(root);
        //     System.out.println(tree.maxSize);
        //     System.out.println(tree.maxSum);

        // Node root = new Node(4);
        // root.left= new Node(2);
        // root.right = new Node(5);
        // root.left.left= new Node(1);
        // root.left.right= new Node(3);
        // root.right.right = new Node(6);
        
        // System.out.println("i = "+tree.search(root,8));
        // tree.inOrder(root);
        // int val [] = { 8,5,3,6,10,11,14};
        // Node root = null;
        // for(int i=0;i<val.length;i++){

        //    root= tree.bst(root,val[i]);
        // }
        // tree.inOrder(root);
        // tree.deletes(root,4);
        // tree.inOrder(root);
        // ArrayList<Integer> al = new ArrayList<>();
    //    tree.rootToLeaf(root, al );
        
    }
}