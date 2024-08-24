import java.util.*;
public class String_subsequence {
    public static void main(String[] args) {
       int c =  newArr("","sdjflksfjdsjf","ff");
        System.out.println(c);
    }

    public static int newArr(String p, String up,String s2){
        ArrayList<String> al = new ArrayList<>();
        helper(p,up,al);
        int cnt = 0;
        for(int i=0;i<al.size();i++){
            if(al.get(i).equals(s2)){
                cnt++;
            }

        }
        return cnt;
    }
    public static void helper(String p,String up,ArrayList<String>al){
        if(up.isEmpty()){
            al.add(p);
            return;
        }
        char c = up.charAt(0);
        helper(p+c,up.substring(1),al);
        helper(p,up.substring(1),al);


    }
}
