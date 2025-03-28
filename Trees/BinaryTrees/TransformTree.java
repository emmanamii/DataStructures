
import java.util.HashMap;

//Given a binary search tree, change output 
public class TransformTree {
    public static void main(String[] args) {
        Node root = new Node(11);
        
        //Root children
        root.left = new Node(2);
        root.right = new Node(29);
        
        //Node 2 children
        root.left.left = new Node(1);
        root.left.right = new Node(7);
        
        //Node 29 Children
        root.right.left= new Node(15);
        root.right.right = new Node(40);
        
        //Node 40 Children
        root.right.right.left = new Node (35);
        
        changeNodesToSum(root);
        inOrder(root);
    }
    
    public static void changeNodesToSum(Node root){
        HashMap<Node, Integer> map = new HashMap<>();
        changeTreeToGreaterSumTree(root, root, map);
        preOrderTrav(root, map);
    }
    
    public static void preOrderTrav(Node root, HashMap<Node, Integer> map){
        if(root==null){
            return;
        }
        root.data = map.getOrDefault(root,0);
        preOrderTrav(root.left, map);
        preOrderTrav(root.right, map);
    }
    
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "," );
        inOrder(root.right);
    }
    
    public static void findHigherNodes(Node root, Node current, HashMap<Node, Integer> map){
        
        /*
        current Node    |       |
        ----------------------
        2               |   11  | <= 11+ 29 once 29 reached
        
        */
        
        
        if(root ==null){
            return;
        }
        if(root.data > current.data){
            map.put(current, map.getOrDefault(current,0) + root.data); { //check if already in the map
            }
        }
        findHigherNodes(root.left, current, map);
        findHigherNodes(root.right, current, map);
        
    }
    
    public static void changeTreeToGreaterSumTree(Node root, Node current, HashMap<Node, Integer> map){
        if(current==null){
            return;
        }
        findHigherNodes(root, current, map);
        changeTreeToGreaterSumTree(root, current.left, map);
        changeTreeToGreaterSumTree(root, current.right, map);
    }
    
    
}
