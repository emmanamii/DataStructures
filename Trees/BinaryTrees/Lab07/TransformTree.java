
import java.util.HashMap;

/**
4. Write a method which, given the root of a tree or subtree, 
* computes and returns the number of nodes in that tree or subtree.
* You may not use the size() method; forget that it even existed to begin with. 
* public static <E> int sizeTree(Node<E> root){

You can use this node structure: 
public class TreeNode {
    public TreeNode right;
    public TreeNode left;
    public String data;
}
 */
public class TransformTree {

    public static void main(String[] args) {
                                                /*----------------------------------------------------------*/
        Node root = new Node(11);               //  Start:                  //   End:                       //
        root.left = new Node(2);                //               11         //               119            //
        root.right = new Node(29);              //            /    \        //            /      \          //
                                                //           2      29      //          137       75        //
                                                //         / \     /  \     //        /   \     /    \      //
                                                //        1  7    15   40   //      139   130  104    0     //
        root.left.left= new Node (1);           //                    /     //                       /      //
        root.left.right = new Node (7);         //                   35     //                      40      //
                                                //                          //                              //
        root.right.left = new Node (15);        //                          //                              //
        root.right.right = new Node(40);        /*----------------------------------------------------------*/
        
        root.right.right.left = new Node(35);
        
        start(root);
        System.out.print("Tree in order: ");
        printTree(root);
        
    }
    
    public static void start(Node root){
        HashMap <Node, Integer> map = new HashMap<>();
        iterateForCompare(root, root, map);
        replaceTree(root, map);
    }
    
    public static void iterateForCompare(Node root, Node current, HashMap<Node, Integer> map){
        //Before finding higher nodes, must iterate through each value to put into function compare()
        if (current==null){
            return;
        }
        compare(root, current, map);
        iterateForCompare(root, current.left, map);
        iterateForCompare(root, current.right, map);
    }
    
    public static void compare(Node root, Node current /*current value we are comparing*/, HashMap<Node, Integer> map){
        //Finding higher nodes.
        //If found, add to the hashmap.
                                
        if( root == null){
            return;
        }
        if(current.data < root.data){
            map.put(current, map.getOrDefault(current,0) + root.data); 
                            //map.get(current) -> if current DNE then map.get(0);
        }
        
        compare(root.left, current, map);
        compare(root.right, current, map);
    }
    
    public static void replaceTree(Node root,HashMap<Node, Integer> map ){
        
        if(root == null){
            return;
        }
        
        root.data = map.getOrDefault(root, 0);
        
        replaceTree(root.left, map);
        replaceTree(root.right, map);
    }
    
    public static void printTree(Node root){
        //in order->    Left Root Right
        if(root == null){
            return;
        }
        
        printTree(root.left);
        System.out.print(root.data + ", ");
        printTree(root.right);
    }
    
}
