import java.util.*;


public class BinaryTrees {


    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            } 
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
            
            return newNode;
        }

    public static void preOrder(Node root){
        if(root == null){
    
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root == null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root == null){
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else{
                System.out.print(curr.data +" ");

                if(curr.left != null){
                    q.add(curr.left);
                } 
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        

    }
    public static int treeHeight(Node root){
        if(root == null){
            return 0;
        }
        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);
        int height = Math.max(lh,rh)+1;
        return height;
    }
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int lc = countNode(root.left);
        int rc = countNode(root.right);
        int count = lc+rc+1;

        return count;
    }
    public static int sumNode(Node root){
        if(root == null){
            return 0;
        }
        int ls = sumNode(root.left);
        int rs =  sumNode(root.right);
        int sum = ls + rs + root.data;
        return sum;
    }
    public static int diaMeter(Node root){
        if(root == null){
            return 0;
        }

        int ld = diaMeter(root.left);
        int rd = diaMeter(root.right);
        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);
        int selfD = lh+rh+1;
        
        return Math.max(selfD, Math.max(ld, rd));
    }

    // diameter approch 2
    static class info{
        int dia;
        int height;

        info(int dia, int height){
            this.dia = dia;
            this.height = height;
        }
    }
    public static info diaM(Node root){
        if(root == null){
            return new info(0,0);
        }

        info ld = diaM(root.left);
        info rd = diaM(root.right);
        int finalD = Math.max(ld.height+rd.height+1, Math.max(ld.dia,rd.dia));
        int finalH = Math.max(ld.height,rd.height)+1;

        return new info(finalD,finalH);
    }

    // check sub tree or not 
    public static boolean isIdentical(Node node, Node sub){
        if(node == null && sub == null){
            return true;
        } else if(node==null || sub == null|| node.data != sub.data){
            return false;
        }
        
       if(!isIdentical(node.left, sub.left)){
        return false;
       }

       if(!isIdentical(node.right, sub.right)){
        return false;
       }
     return true;   
    }
    public static boolean isSubTree(Node root, Node sub){

        if(root == null ){
            return false;
        }

        if(root.data==sub.data){
            if(isIdentical(root, sub)){
                return true;
            }
        }

        return isSubTree(root.left, sub) || isSubTree(root.right, sub);

    }


    // TOP VIEW OF A TREE 

    static class Infos{
        int hd;
        Node node;

        Infos(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }

    public static void topView(Node root){
        HashMap<Integer, Node> map = new HashMap<>();

        Queue<Infos> q = new LinkedList<>();

        int min=0, max =0;
        q.add(new Infos(0,root));
        q.add(null);


        while(!q.isEmpty()){
            Infos curr = q.remove();
          if(curr==null){
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
          } else {
              

              if(!map.containsKey(curr.hd)){
                  map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Infos(curr.hd-1, curr.node.left));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Infos(curr.hd+1, curr.node.right));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
       
        // System.out.println("hd is "+map.get(0).data);
        for(int i=min; i<=max; i++){
            System.out.println(map.get(i).data);
        }
        
    }

    // print k th level elements in a tree
    static int level =0;
    public static void kTh(Node root, int k){
        if(root == null){
            return ;
        }
        if(level == k){
            System.out.println(root.data);
        }
        level++;
        kTh(root.left, k);
        kTh(root.right, k);
        level--;
    }

    
    // lowest common ancestor 
    public static boolean getPath(Node root, int n, ArrayList<Node> path ){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n ){
            return true;
        }
        boolean left = getPath(root.left, n, path);
        boolean right = getPath(root.right, n , path);
        if(left || right){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public static Node lca(Node root, int n1, int n2){
          ArrayList<Node> path1 = new ArrayList<>();
          ArrayList<Node> path2 = new ArrayList<>();

          getPath(root, n1, path1);
          getPath(root, n2, path2);

          int i =0;
          for(;i<path1.size()&& i<path2.size();i++){
            if(path1.get(i) != path2.get(i))
                break;
          }
           return path1.get(i-1);
    }
    public static Node lca2(Node root , int n1, int n2){
        if(root==null || root.data == n1 || root.data == n2){
            return root;
        }
        Node left = lca2(root.left, n1, n2);
        Node right = lca2(root.right, n1, n2);

        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        return root;
    }
    // MINIMUM DISTANCE BETWEEN TWO NODES
    public static int lcaDist(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){

            return -1;
           } else if(leftDist==-1){
            return rightDist+1;
           } else {
            return  leftDist+1;
           }
    }
    public static int minDist(Node root, int n1, int n2){

        if(root.data == n1 || root.data == n2){
            return 0;
        }
        Node lca = lca2(root, n1, n2);
       

       int dist1 = lcaDist(lca, n1);
       int dist2 = lcaDist(lca, n2);
       

     

       return dist1+dist2;



    }
    // K TH ANCESTOR
    public static int kAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int left = kAncestor(root.left, n, k);
        int right = kAncestor(root.right, n,k);

        if(left ==-1 && right==-1){
            return -1;
        }
        int max = Math.max(left,right);
        if(max+1 == k ){
            System.out.println("kth ancestor is : "+root.data);
        }
        return max+1;
    }

    // TRANSFORM TO SUM TREE

    //     1                    27
    //    /  \                 /  \
    //   2    3                9   13 
    // / \  /  \              / \  / \
    // 4  5 6   7             0  0 0  0
public static int sumTree(Node root){
    if(root == null){
        return 0;
    }
    int leftSum = sumTree(root.left);
    int rightSum = sumTree(root.right);
    int temp = root.data;
    int left = root.left == null ? 0 : root.left.data;
    int right = root.right == null ? 0 : root.right.data;
    root.data = left+right+leftSum+rightSum;
    return  temp;
}

}
    public static void main(String[] args){
        // int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        // tree.preOrder(root);
        // System.out.println();
        // tree.inOrder(root);
        // System.out.println();
        // tree.postOrder(root);
        // System.out.println();
        // tree.levelOrder(root);
        // System.out.println();
        // System.out.println("height of tree is : "+tree.treeHeight(root));
        // System.out.println("Number of nodes in tree is : "+tree.countNode(root));
        // System.out.println("Sum of nodes in tree is : "+tree.sumNode(root));
        // System.out.println("Diameter of tree is : "+tree.diaM(root).dia);
        // System.out.println("Height of tree is : "+tree.diaM(root).height);
        // Node s = tree.get(root.left,root);
        // System.out.println(s.data);

        Node roots = new Node(1);
        roots.left = new Node(2);
        roots.right = new Node(3);
        roots.left.left = new Node(4);
        roots.left.right = new Node(5);
        roots.right.left = new Node(6);
        roots.right.right = new Node(7);


    tree.sumTree(roots);
    tree.preOrder(roots);

        int n1 = 4, n2 =5;
       System.out.println(": "+tree.kAncestor(roots, 4,1));

        System.out.println("distance is : "+tree.minDist(roots, n1, n2));

        // System.out.println("Lca is  : "+ tree.lca2(roots, 4,5).data);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // // subRoot.left.right = new Node(4);
        // // subRoot.left.left = new Node(4);
        
        // subRoot.right = new Node(5);
        // subRoot.right.left = new Node(5);
        // System.out.println("yes it is " +tree.isSubTree(roots,subRoot)+" that it is a subtree");
        // tree.topView(roots);
        // tree.kTh(roots, 2);
        // tree.preOrder(roots);

    }
}