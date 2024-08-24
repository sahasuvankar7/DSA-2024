package Sorting;



public class Insertion_Sort {
    public static void main(String[] args) {
        int [] arr = {3,3,2,1,4};
        selection(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void selection(int [] arr){
        // find the max element and put it in the correct place by swapping them
        for (int i = 0; i < arr.length; i++) {
            //every last element get decreased
            int last = arr.length-i-1;
            // find max
            int max = getMaximum(arr,0,last);
            // comparison
            swap(arr,max,last);
        }
    }

    private static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    private static int getMaximum(int[] arr, int start, int end) {
        int max = start;
        for (int j = start; j <=end ; j++) {
            if(arr[max]<arr[j])
                max = j;
        }
        return max;
    }
}
