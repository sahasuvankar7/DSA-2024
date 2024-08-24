public class Remove_ch_from_string {
    public static void main(String[] args) {
        String s = "abccba";
        StringBuilder sb = new StringBuilder();
//        System.out.println(remove_string(s,sb,0));
        String str="";
//        System.out.println(remove_string2(s,str,0));
        System.out.println(s.substring(1));
    }


    public static StringBuilder remove_string(String s,StringBuilder sb,int index){

        if(index==s.length()){
            return sb;
        }
        if(s.charAt(index)!='b'){
            sb.append(s.charAt(index));
        }

       return remove_string(s,sb,index+1);
    }
    public static String remove_string2(String s, String str,int index){

        if(index==s.length()){
            return str;
        }
        if(s.charAt(index)!='b'){
            str+=String.valueOf(s.charAt(index));
        }

        return remove_string2(s,str,index+1);
    }

}
