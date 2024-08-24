

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
            public class rotate_linkedList {
                public static void main(String[] args) {

                }
                public ListNode rotateRight(ListNode head, int k) {
                    while(k>0){
                        ListNode temp  = head;
                        ListNode curr = head;
                        ListNode prev = null;
                        while(curr.next!=null){
                            ListNode nextNode = curr.next;
                            if(curr.next.next==null){
                                curr.next = null;
                            }
                            nextNode.next = temp;
                            curr = curr.next;
                        }
                        k--;
                    }
                    return head;
                }
   }
