//Node <E> is declared as an inner class within BinaryTree<E>
//Node <E> is declared protected. This way we can use it as a superclass.

protected static class Node<E> implements Serializable{
  
  protected E data;
  protected Node<E> left;
  protected Node<E> right;
  
  public Node(E data){
    this.data = data;
    left = null;
    right = null;
  }
  public String toString(){
    return data.toString();
  }
}
