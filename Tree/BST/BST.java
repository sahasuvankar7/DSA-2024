

class BST {
    public class Node {
      private int value;
      private Node left;
      private Node right;
      private int height;
  
      public Node(int value) {
        this.value = value;
      }
  
      // get value
      public int getValue() {
        return this.value;
      }
  
      // getting height
      public int height(Node node) {
        if (node == null)
          return -1;
        return node.height;
      }
  
    }
  
    public Node root;
  
    public boolean isEmpty() {
      return root == null;
    }
    public void display(){
      display(root,"Root Value: ");
    }
    public void display(Node node , String details){
      if(node == null){
        return;
      }
      System.out.println(details + node.getValue());
  
      display(node.left,"left child of "+ node.getValue() + " : " );
      display(node.right,"right child of "+ node.getValue() + " : " );
    }
    
  
  }
