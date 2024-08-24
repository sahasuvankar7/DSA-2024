import java.util.*;

public class spanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = span(arr, n);
        System.out.println(res);
    }

    public static int span(int[] arr,int n) {
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
        }
    }
        for(int j = 0; j < arr.length;j++){
            if(arr[j]<min){
                min = arr[j];
            }
        }
        int diff = (max - min);
        return diff;
    }
}
