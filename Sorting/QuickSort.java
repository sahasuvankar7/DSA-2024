package Sorting;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {7,3,2,4,5,1,6};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr , int low , int high){
        if(low>=high)
            return;

        int s = low;
        int e = high;
        // find out the middle element
        int mid = s + ( e-s)/2;
        // assuming middle element as a pivot element
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                // after sorting we have to incr. low and dec. high
                s++;
                e--;
            }
        }

        // Now the pivot is at correct position then we have to sort two halves


        // sometimes it might occur that LHS as well as RHS  is not properly sorted then we have to sort
        // them accordingly
        sort(arr,low,e);
        sort(arr,s,high);
    }
}
