import java.util.Scanner;
import java.util.Stack;

public class Duplicate_brackets {

        public static void main(String[] args) throws Exception {
            Stack<Character> stack = new Stack<Character>();
            String str = "(a + b) + ((c + d))";
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch==')'){
                    if(stack.peek() =='('){
                        System.out.println(true);
                        return;
                    }else{
                        while(stack.peek()!='('){

                            stack.pop();
                        }
                        stack.pop();
                    }
                }else{
                    stack.push(ch);
                }
            }
            System.out.println(false);

        }
    }

