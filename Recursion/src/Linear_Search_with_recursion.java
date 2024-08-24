import java.util.ArrayList;

public class Linear_Search_with_recursion {
    public static int ls(int [] arr,int t,int i){
        if(i==arr.length)
            return -1;
        return (arr[i]==t)?i:ls(arr,t,i+1);
    }
    public static void main(String[] args) {
        int [] arr= {1,5,6,79,23,12};
        int t = 23;
//        System.out.println( ls(arr,t,0));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int [] arr1 = {1,2,3,4,4,5,6};
        System.out.println(LS(arr1,list,4,0));
    }
    public static ArrayList<Integer> LS(int [] arr,ArrayList<Integer> list, int target,int i){
        if(i==arr.length-1){
            return list;
        }
        if(arr[i]==target)
            list.add(i);
        return LS(arr,list,target,i+1);
    }
}
