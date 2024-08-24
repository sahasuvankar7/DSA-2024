import java.util.*;

public class Remove_duplicates {
       static String removeDups(String S) {
            // code here\


            LinkedHashSet<Character> hs = new LinkedHashSet<>();
            StringBuilder sb = new StringBuilder();
            hs.add(S.charAt(0));
            for(int i=1;i<S.length();i++){
                char curr = S.charAt(i);
                if(!hs.contains(curr)){
                    hs.add(curr);
                }
            }
            Iterator<Character> it = hs.iterator();
            while(it.hasNext()){
                sb.append(it.next());
            }
            return sb.toString();


        }

    public static void main(String[] args) {
        System.out.println(removeDups("veeenngeenccee"));
    }
}
