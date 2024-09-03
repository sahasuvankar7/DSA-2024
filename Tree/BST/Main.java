

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;


public class Main {
  public static void main(String[] args){
      // BinaryTree tree = new BinaryTree();
      // Scanner sc = new Scanner(System.in);
      // tree.populate(sc);
      // tree.display();

      BST1 tree = new BST1();
      int [] nums = {14,12,9,10,33,18,5,3};
      tree.populate(nums);
      tree.display();
      tree.levelOrder();
      System.out.println(tree.balanced());
    
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}