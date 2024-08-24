import java.util.ArrayList;

public class Subset_of_strings {
    public static void main(String[] args) {
        String p ="";

//        ArrayList<String> subsets = helper1("abcd");
//        for(String s:subsets){
//            System.out.println(s);
//        }
//        while(true){
//            System.out.println("yess");
//        }
    }
  /*
    public static void SubSequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        SubSequence(p+ch,up.substring(1));
        SubSequence(p,up.substring(1));
    }
    */
    public static ArrayList<String>  helper1(String up){
        ArrayList<String> subset = new ArrayList<>();
        String p ="";
        helper2(up,p,subset);
        return subset;
    }
  public static void helper2(String up, String p, ArrayList<String> al){
      if(up.isEmpty()){
          al.add(p);
          return ;
      }
      char c = up.charAt(0);
      helper2(up.substring(1),p+c,al);

      helper2(up.substring(1),p,al);
  }
}
