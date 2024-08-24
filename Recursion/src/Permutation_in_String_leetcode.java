import java.util.ArrayList;
import java.util.HashSet;

public class Permutation_in_String_leetcode {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(s2.contains(s1));
//        if(s2.contains(s1))
//        System.out.println( checkInclusion("eidbaooo","ab"));
    }
    public static boolean checkInclusion(String s1,String s2) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> l = new ArrayList<>();
        String p= "";
      ArrayList<String> list2 = (ArrayList<String>)helper2(p,s1,list);
      ArrayList<String> list3 = (ArrayList<String>)helper(p,s2,l);
        ArrayList<String> newList = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        for(String item:list2){
            if(!hs.contains(item)){
                hs.add(item);
            }
        }
        for(String item:hs){
            newList.add(item);
        }
       return inCommon(list3,newList);
//        System.out.println(newList);
//        System.out.println(l);
    }
    public static boolean inCommon(ArrayList<String> l1,ArrayList<String> l2){
        boolean bool = false;
        for (int i = 0; i <l2.size() ; i++) {
            for (int j = 0; j <l1.size() ; j++) {
                if(l2.get(i)==l2.get(j)){
                    bool = true;
                    break;
                }
            }
            break;
        }
        return bool;
    }
    public static ArrayList<String> helper(String p,String up,ArrayList<String> list){
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
        return list;
    }
    public static ArrayList<String> helper2(String p,String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        helper2(p+ch,up.substring(1),list);
        helper2(p,up.substring(1),list);
        return list;
    }
}
