import java.util.Arrays;

public class missing_number_in_array {
    public static void main(String[] args) {
        int [] arr = {1};
        //1 2 3 4 6 7
        System.out.println(missingNumber(arr));
    }
   static int missingNumber(int arr[]) {
        Arrays.sort(arr);
        if(arr[0]!=1) return 1;
       for (int i = 0; i <arr.length-1 ; i++) {
           if(arr[i+1]-arr[i]>1){
               return arr[i]+1;
           }
       }
       return  arr[arr.length-1]+1;
    }


}
