import java.util.*;
public class Binary{

static class Node {
int data;
Node left;
Node right;

Node(int d){
    data = d;
    left = null;
    right = null;
}
    
}
static class BinaryTree{
   static int idx = -1;
    public static Node buildTree(int nodes[]){
        if(nodes[idx]==-1){
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
    // Question  No 1 
    public static boolean univalued(Node root){
      
       if(root == null){
        return true;
       }
        if(root.left!= null && root.left.data != root.data){
            return false;
        }
        if(root.right != null && root.right.data != root.data){
            return false;
        }
       return univalued(root.left) &&univalued(root.right);

        

    }

    // Question No 2
    public static boolean isMirror(Node tree, Node mirror){
        if(tree == null && mirror == null){
            return true;
        }
        if(tree == null || mirror == null){
            return false;
        }
        return (tree.data == mirror.data) && isMirror(tree.left, mirror.right) && isMirror(tree.right, mirror.left);
    }
    // Question No 3
    public static Node deleteNode(Node root, int x){
        if(root == null){
            return null ;
        }

       root.left = deleteNode(root.left, x);
      root.right =  deleteNode(root.right, x);
        if(root.data == x && root.left == null && root.right == null){
            
            return null;
        }
        return root;
    }
}





    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();

        // Qustion 1 Nodes

        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(2);

    //    System.out.println(tree.univalued(root));
        
       // Question 2 Nodes

    //          1
    //         / \
    //        2   3
    //       / \ / \
    //      4  5 6  7


       Node root1 = new Node(1);
       root1.left = new Node(2);
       root1.right = new Node(3);
       root1.left.left = new Node(4);
       root1.left.right = new Node(5);
       root1.right.left = new Node(6);
         root1.right.right = new Node(7);
    //          1
    //         / \
    //        3   2
    //       / \ / \
    //      7  6 5  4

         Node root2 = new Node(1);
         root2.left = new Node(3);
         root2.right = new Node(2);
         root2.left.left = new Node(7);
         root2.left.right = new Node(6);
         root2.right.left = new Node(5);
         root2.right.right = new Node(4);
    
    //  System.out.println(tree.isMirror(root1, root2));

    // Question 3 output
    tree.preOrder(root);
    System.out.println();
    tree.deleteNode(root,2);    // after this function 2 got deleted
    tree.preOrder(root);

    }

}