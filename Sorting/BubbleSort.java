package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {12,3,45,1,0,8};
        bubble(arr);
        for (int i = 0; i <=arr.length-1 ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void bubble(int [] arr){
        for (int i = 0; i <arr.length ; i++) { // i as counter
            for (int j = 1; j <arr.length-i ; j++) { // j is inner loop and j will be start from one step ahead of i
                // if prev element of array is greater than current element then swap
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
