package PracticeSet;

public class DoublyLinkedList2 {

    // creating new class for node
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }


    public Node head = null;
    public Node tail = null;
    // adding node

    public void AddNode(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            head.prev = null;
            tail.next = null;
        }else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
            tail.next = null;
        }
    }
    public void display(){
        Node current = head;

        if(head == null){
            System.out.println("you don't have any Linkedlist");
            return;
        }
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        DoublyLinkedList2 dl = new DoublyLinkedList2();

        dl.AddNode(12);
        dl.AddNode(13);
        dl.AddNode(14);
        dl.AddNode(15);
        dl.AddNode(16);

        dl.display();


    }
}
