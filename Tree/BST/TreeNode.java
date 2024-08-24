package BST;

import java.util.*;

class BinaryTree{

    public class Node{
        public int value;
        public Node left;
        public Node right;

        // constructor
        public Node(int value){
            this.value = value;
        }
    }

    private Node root;


    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);

    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of : " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of " +  node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left); // recursive call for more iteration
        }
        System.out.println("Do you want to enter right of : " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of " +  node.value);
            int value = scanner.nextInt();
            node.right  = new Node(value);
            populate(scanner,node.right); // recursive call for more iteration
        }
    }
    public void display(){
        display(root,0);
    }
    public void display ( Node root , int level){
        if(root == null) return;

        display(root.right,level+1);

        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t"); 
            }
            System.out.println("|------->"+root.value);
        }else{
            System.out.println(root.value);
        }
        display(root.left,level+1);

    }
    
}
