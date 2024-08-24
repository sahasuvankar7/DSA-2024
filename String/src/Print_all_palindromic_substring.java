public class Print_all_palindromic_substring {
    public static void main(String[] args) {
        // print all palindromic substring from a given string
        String s = "abbaccdcc";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                String s1 = s.substring(i,j);
                if(isPalindrome(s1)==true){
                    System.out.println(s1);
                }
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j = s.length()-1;
        while(i<=j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1!=ch2) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}

/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
//public class Main
//{
//    public static void main(String[] args) {
//        String str = "aaabbcdddeee";
//        StringBuilder sb = new StringBuilder();
//        for (int i=0,j=1;j<str.length();j++ ){
//            if(str.charAt(i)==str.charAt(j)){
//                if(j == str.length()-1){
//                    sb.append(str.charAt(i));
//                }
//                else{
//
//                    continue;
//                }
//            }
//            else if(str.charAt(i)!=str.charAt(j)){
//                if(j==str.length()-1){
//                    sb.append(str.charAt(j));
//                }
//                else{
//                    sb.append(str.charAt(i));
//                    i=j;
//                }
//
//            }
//
//        }
//        System.out.println(sb);
//    }
//}

