

import java.util.Stack;

public class insert_element_at_bottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(8);
        Stack<Integer> newSt = insertAtBottom(st,2);
        while(newSt.empty()){
             System.out.println(newSt.pop());
        }
    }
    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!st.empty()){
            int item = st.pop();
            temp.push(item);
        }
        st.push(x);
        while(!temp.empty()){
            int item = temp.pop();
            st.push(item);
        }
        return st;

    }
}
