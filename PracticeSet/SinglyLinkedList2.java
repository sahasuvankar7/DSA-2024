
package PracticeSet;

public class SinglyLinkedList2 {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    // display method
    public void displayNode (){
        Node current = head;
        
        if(current == null){
          System.out.println("");
          return;
        }
        while(current!=null){
          System.out.print(current.data +"->");
          current = current.next;
        }
        System.out.println();
        
      }


      public void deleteFirstNode (){
        Node current = head;
        if(current == null){
            System.out.println("create a new linkedlist");
            return ;
        }
        current = current.next;
        head = current;
      }

      public void deleteLastNode(){
        Node current = head;
        if(current ==  null){
            System.out.println("you have no linkedlist ");
            return ;
        }
        while(current.next.next != null){
            current = current.next;
        }
        tail = current;
        current.next = null;
        tail.next = null;
      }
      
      public void deleteAtIndex(int idx){
        Node current = head;
        if(current == null){
          System.out.println("you don't have any linkedlist");
          return;
        }
        
        int i=1;
        if(current!=null &&  current.next!=null){
        while(i<idx-1 ){
          current = current.next;
          i++;
        }
        current.next = current.next.next;
          
        }else{
          System.out.println("node does not exist at this index no");
        }
        
        
      }
      
      public void addNodeAtIndex(int index,int data){
        Node current = head;
        if(current == null){
          System.out.println("you don't have any linkedlist");
          return;
        }
        int i = 1;
        if(current!=null &&  current.next!=null){
        while(i<index-1){
          current = current.next;
          i++;
        }
        Node newNode =new Node(data);
        newNode.next = current.next;
        current.next = newNode;
          
        }else{
          System.out.println("you don't have any linkedlist");
        }
      }

    public static void main(String[] args) {
       SinglyLinkedList2 newLinkedList = new SinglyLinkedList2();
      newLinkedList.addNode(5);
      newLinkedList.addNode(6);
      newLinkedList.addNode(7);
      newLinkedList.addNode(8);
      newLinkedList.addNode(9);
      newLinkedList.addNode(10);

      // newLinkedList.displayNode();
       
      // newLinkedList.deleteFirstNode();
       
        // newLinkedList.displayNode();
        
        // newLinkedList.deleteLastNode();
        // newLinkedList.displayNode();
        
        newLinkedList.addNode(12);
        newLinkedList.displayNode();
        newLinkedList.deleteAtIndex(3);
        newLinkedList.displayNode();
        newLinkedList.addNodeAtIndex(4,20);
        newLinkedList.displayNode();

    }
}