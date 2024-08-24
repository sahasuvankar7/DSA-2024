import java.util.*;
public class Permutation_of_strings {
    public static void main(String[] args) {
        ArrayList<String> list = (ArrayList<String>) find_permutation("abb");
        ArrayList<String> newList = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        for(String item:list){
            if(!hs.contains(item)){
                hs.add(item);
            }
        }
        for(String item:hs){
            newList.add(item);
        }
        System.out.println(newList);
    }

    public static List<String> find_permutation(String S) {
        // Code here
        List<String> list = new ArrayList<String>();
        return helper("",S,list);
    }
    static List<String> helper(String p, String up,List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            helper(f+ch+s,up.substring(1),list);

        }
        Collections.sort(list);

        return list;
    }
}
