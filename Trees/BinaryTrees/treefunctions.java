//Here are some functions for the different types of tree traversals

public class treefunctions {

    public static void main(String[] args) {
                                                /*--------------------------*/
        Node root = new Node(11);               //  Tree:                   //   
        root.left = new Node(2);                //               11         //            
        root.right = new Node(29);              //            /    \        //         
        root.left.left= new Node (1);           //           2      29      //        
        root.left.right = new Node (7);         //         / \     /  \     //      
        root.right.left = new Node (15);        //        1  7    15   40   //     
        root.right.right = new Node(40);        //                    /     // 
        root.right.right.left = new Node(35);   //                   35     //                          
                                                /*--------------------------*/
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
