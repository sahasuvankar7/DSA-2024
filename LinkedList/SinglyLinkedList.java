public class SinglyLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display(){
        Node current = head;
        if(current ==null){
            System.out.println("empty linked list");
            return ;
        }
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();

    }
    public void deleteFirstIndex(){
        Node current = head;
        if(head==null){
            System.out.println("list empty can't delete");
            return ;
        }
        else{
            current = current.next;
            head = current;
        }
    }
    public void deleteLastIndex(){
        Node current = head;
        if(head==null){
            System.out.println("empty list");
            return ;
        }
       while(current!=null){
           if(current.next.next==null){
               current.next= null;
               return;
            }
            else{
            current = current.next;
            }
       }
    }
    public void deleteMentionIndex(int x){
        Node current = head;
        if(head==null){
            System.out.println("empty list");
            return;
        }
        
        else{
            while(current.next!=null){
                if(current.next.data==x){
                    current.next = current.next.next;
                    return;

                }
                else if(current.data==x){
                    current = current.next;
                    head = current;
        
                }
                current = current.next;
            }

        }
    }
    public static void main(String[] args) {
        SinglyLinkedList list =new SinglyLinkedList();
        list.addNode(14);
        list.addNode(33);
        list.addNode(44);
        list.addNode(55);
        list.addNode(66);
        list.display();
        // list.deleteFirstIndex();
        // list.display();
        // list.deleteLastIndex();
        // list.display();
        list.deleteMentionIndex(66);
        list.display();

    }
}
