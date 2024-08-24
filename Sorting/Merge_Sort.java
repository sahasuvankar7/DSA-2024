package Sorting;
import java.util.Arrays;


public class Merge_Sort{
     public static void main(String[] args) {
          int [] arr = { 5,7,6,5,9};
         arr =  mergeSort(arr);
          System.out.println(Arrays.toString(arr));
     }

     static int[] mergeSort(int [] arr){
          if(arr.length==1){
               return arr;
          }
          // find out the middle of array
          int mid = arr.length/2;

          // making two new array for storing newly created array's value
          int [] left= mergeSort(Arrays.copyOfRange(arr,0,mid)); // inbuilt method
          int [] right =mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

          return merge(left,right);
     }

     static int [] merge(int[] left,int [] right){
          int [] ans = new int[left.length+right.length];
          int i = 0;
          int j = 0;
          int k = 0;

          // traversing through array and compare there values

          while(i<left.length && j<right.length){
               if(left[i]>right[j]){
                    ans[k] = right[j];
                    j++;
               }else{
                    ans[k] = left[i];
                    i++;
               }
               k++;
          }
          while(i<left.length){
               ans[k] = left[i];
               i++;
               k++;
          }
          while(j<right.length){
               ans[k] = right[j];
               j++;
               k++;
          }
          return ans;
     }
}