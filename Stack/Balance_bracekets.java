import java.util.*;
//https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1

public class Balance_bracekets {
    public static void main(String[] args) {
        System.out.println(ispar("{{))"));
    }
    public static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty() &&(stack.peek()=='(' && ch==')')){
                    stack.pop();
                }else if(!stack.isEmpty() && (stack.peek()=='{' && ch=='}')){
                    stack.pop();
                }else if(!stack.isEmpty() && (stack.peek()=='[' && ch==']')){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
