public class doubly_linked_list {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;

        }

    }

    public Node head = null;
    public Node tail = null;

    public void createNode(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
            tail.next = null;
        }
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("empty list");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void insertAtFirst(int data) {
        Node newnode = new Node(data);
        Node current = head;
        if (current == null) {
            head = newnode;

        } else {
            Node currentNext = head.next;
            current = newnode;
            newnode.next = head;
            currentNext.prev = newnode;
            head = newnode;
        }

    }
    public void insertAtPosition(int index,int data){
        Node newNode = new Node(data);
        Node current=head;
        newNode.next = null;
        newNode.prev = null;
        if(current==null){
            current = newNode;
            head = current;
        }
        else{
            for (int i = 0; i <index; i++) {
                if(current.next!=null) {
                    current = current.next;
                }

            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next = newNode;

//            head = current;
        }

    }

    public void delete(int data) {
        Node newnode = new Node(data);
        Node current = head;
        if (current == null) {
            System.out.println("empty list");
        } else {
            while (current != null) {
                if (current.data == data) {
                   current.next.prev = current.prev;
                   current.prev.next = current.next;
                }
                current = current.next;
            }
        }
    }
    public  void  deleteLast(){
        Node current;
        current = head;
       if(current==null) { // if the head is null then empty list can't perform any operation
           System.out.println("empty list");
           return;
       }else if(current.next==null){ // if next data is null then empty list
           System.out.println("empty list");
       }
       else{
           while(current.next!=null){ // only traverse through linkedList
               current = current.next;
            }
           current.prev.next = null; // delete only last node
       }
    }
    public void deleteFirst(){
        Node current = head;
        if(current==null){
            return;
        }
        else if(current.next==null){
            head.next = null;
            head.prev = null;
            return;

        }
        else{
            current = current.next;
            current.next.prev = null;
            head = current;
        }
    }

    public static void main(String[] args) {
        doubly_linked_list dl = new doubly_linked_list();
        dl.createNode(45);
        dl.createNode(66);
        dl.createNode(33);
        dl.createNode(90);
        dl.createNode(90);

        dl.display();
        // dl.insertAtFirst(32);
        // dl.display();
//        dl.deleteLast();
//        dl.deleteFirst();
        dl.insertAtPosition(3,100);
        dl.display();

    }

}
