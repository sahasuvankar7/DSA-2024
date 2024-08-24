package BST;

class BST1 {
    public class Node {
      private int value;
      private Node left;
      private Node right;
      private int height;
  
      public Node(int value) {
        this.value = value;
      }
  
      public int getValue() {
        return value;
      }
    }
  
    public int height(Node node) {
      if (node == null) {
        return -1;
      }
      return node.height;
    }
  
    public Node root;
  
    public void populate(int[] nums) {
      for (int index = 0; index < nums.length; index++) {
        this.insert(nums[index]);
      }
    }
  
    public void populateSorted(int [] nums){
      populateSorted(nums,0,nums.length);
    }
    public void populateSorted(int [] nums , int start,int end){
       if(start>=end){
         return;
         
       }
      int mid = (start+end)/2;
      this.insert(nums[mid]);
      populateSorted(nums,start,mid);
      populateSorted(nums,mid+1,end);
      
    }
    public void insert(int value) {
      root = insert(value, root); // updating the root of it's recursive answers
    }
  
    private Node insert(int value, Node node) {
      if (node == null) {
        node = new Node(value);
        return node;
      }
      if (value < node.value) {
        node.left = insert(value, node.left);
      }
      if (value > node.value) {
        node.right = insert(value, node.right);
      }
      node.height = Math.max(height(node.left), height(node.right)) + 1;
      return node;
  
    }
  
    public boolean balanced() {
      return balanced(root);
    }
  
    public boolean balanced(Node node) {
      if (node == null)
        return true;
      return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
  
    }
  
    public void display() {
      display(this.root, "Root value: ");
    }
  
    public void display(Node node, String details) {
      if (node == null) {
        return;
      }
      System.out.println(details + node.value);
      display(node.left, "left node of " + node.value + " : ");
      display(node.right, "right node of " + node.value + " : ");
    }
  
  }
  