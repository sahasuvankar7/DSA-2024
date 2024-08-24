//First Index of Occurrence in Array using Recursion
public class first_occurence_index {
    public static void main(String[] args) {
        int [] arr = {0,8,3,9,1};
        int t = 11;
        System.out.println(fio(arr,t,0));

    }
    static int fio(int [] arr, int t, int idx){
        if(idx>arr.length-1){
            return -1;
        }
        if(arr[idx]==t ){
            return idx+1;
        }
        return fio(arr,t,idx+1);
    }
}
