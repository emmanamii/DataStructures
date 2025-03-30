//Node <E> is declared as an inner class within BinaryTree<E>
//Node <E> is declared protected. This way we can use it as a superclass.

public class Node {
    int data;
    Node left, right;
    
    Node(int value){
        data= value;
        left = null;
        right = null;
    }
}
