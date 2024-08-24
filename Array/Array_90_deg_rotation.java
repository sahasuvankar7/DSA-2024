import java.util.Scanner;

public class Array_90_deg_rotation {
    public static void display(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int [][] arr = new int[n][n];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // do transpose of the original matrix
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i] = temp;
            }
        }
//        display(arr);
        // now reverse the row first->last last->first
        for(int i=0;i<arr.length;i++){
            int li = 0;
            int ri = arr[i].length-1;

            while(li<ri){
                int temp = arr[i][li];
                arr[i][li]= arr[i][ri]; // row does not change only column change
                arr[i][ri]=temp;
                ri--;
                li++;

            }
            //after exiting from that loop only row will be incremented
        }
        display(arr);
    }
}
