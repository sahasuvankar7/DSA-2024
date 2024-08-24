package PracticeSet;

public class Selection_sort {
    public static void main(String[] args) {
        Selection_sort ob = new Selection_sort();
        int arr[] = {11,12,13,15,4};
        ob.selectionsort(arr);
        System.out.println("Sorted array");
        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.println(arr[i]);
        }
    }

    void selectionsort(int [] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            int min_idx = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
