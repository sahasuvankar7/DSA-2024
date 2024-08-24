public class array_is_sorted_or_not {
    public static boolean sort(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && sort(arr, i + 1);

    }
    public static void main(String[] args) {
        int [] arr= {1,3,2,4,5,6};
        System.out.println(sort(arr,0));
    }
}
