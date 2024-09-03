import java.util.ArrayList;


public class All_Indices_in_array {
    public static void main(String[] args) {
        int [] arr  ={3,5,9,4,3,3,3,3};
        ArrayList<Integer> al = new ArrayList<>();
//        System.out.println( aia(arr,0,3,al));
        int [] newarr =allIndices(arr,0,3,0);
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);
        }
    }
    /*
    static ArrayList<Integer> aia(int [] arr, int idx,int target,ArrayList<Integer> al){
        if(idx>arr.length-1){
            return al;
        }
        if(arr[idx]==target){
            al.add(idx);
        }
        return aia(arr,idx+1,target,al);
    }
     */

    static int [] allIndices(int [] arr ,int idx,int target,int fsf) {
        // found so far
        if(idx==arr.length){
            return  new int [fsf];
        }
        if(arr[idx]==target){
            int [] newarr=allIndices(arr,idx+1,target,fsf+1);
            newarr[fsf] = idx;
            return newarr;
        }
        else{
            int [] newarr = allIndices(arr,idx+1,target,fsf);
            return newarr;
        }


    }

}
