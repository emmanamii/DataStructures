
package com.mycompany.exam2practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Exam2practice {

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(3);
        root.right = new Node (7);
        root.left.left = new Node (1);
        root.right.left= new Node(3);
        root.right.right = new Node(4);
        
        isSumTree(root);
    }
    
    public static boolean isSumTree(Node root){
        //Check if the tree is a sum tree
        if(root ==null || root.left ==null && root.right == null){
            return true;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        
        return(root.data == left + right) && isSumTree(root.left) && isSumTree(root.right);
    }
    static int sum(Node root){
        if(root==null){
            return 0;
        }
        return sum(root.left) + root.data + sum(root.right);
    }
    
    public static boolean sibilings(Node root, Node a, Node b){
        //Check if a and b are sibilings
        if(root==null){
            return false;
        }
        return(root.left ==a && root.right ==b) ||
                (root.left ==b && root.right ==a) ||
                sibilings(root.left, a, b) ||
                sibilings(root.right, a, b);
    }
    
    public static int level(Node root, Node n, int level){
        //Return the node's level in the tree
        if(root==null){
            return 0;
        }
        if(root==null){ //base case
            return level;
        }
        
        int L = level(root.left, n,level+1);
        if(level != 0){
            return 1;
        }else{
            level(root.right,n,level+1);
        }
        return 0;
    }
    
    public static boolean cousins(Node root, Node a, Node b){
        //Check if a and b are cousins
        return((level(root,a,b))==level(root(b,a)) && sibilings(root,a,b) != sibilings(root,a,b));
    }
    
    public static Map<Integer, Integer> numCount(List<Integer> words){
        //Will return the occurences of the numbers in the list
        
        Map<Integer, Integer> result = new HashMap<>();
        for(Integer num: words){
            result.put(num,result.getOrDefault());
        }
    }
    
}
