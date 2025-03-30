//Here are some functions for the different types of tree traversals

/*Assume this class is used:
public class Node {
    int data;
    Node left, right;
    
    Node(int value){
        data= value;
        left = null;
        right = null;
    }
}
*/
public class treefunctions {

    public static void main(String[] args) {
                                               
        Node root = new Node(11);                
        root.left = new Node(2);                   
        root.right = new Node(29);                   
        root.left.left= new Node (1);           
        root.left.right = new Node (7);           
        root.right.left = new Node (15);      
        root.right.right = new Node(40);        
        root.right.right.left = new Node(35);                       
                                                
        System.out.print("PreOrder:  ");
        PreOrder(root);                
        System.out.println(" ");
        
        System.out.print("InOrder:   ");
        InOrder(root);
        System.out.println(" ");
        
        System.out.print("PostOrder: ");
        PostOrder(root);
        System.out.println(" ");
    }
    
    public static void PreOrder(Node root){
        //Root, Left, Right
        
        if(root==null){
            return;
        }
        System.out.print(root.data + ", ");
        PreOrder(root.left);
        PreOrder(root.right);
        
    }
    
    public static void InOrder(Node root){
        //Left, Root, Right
        
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + ", ");
        InOrder(root.right);
        
    }
    
    public static void PostOrder(Node root){
        //Left, Right, Root
        
        if(root==null){
            return;
        }
        
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + ", ");
    }
}
