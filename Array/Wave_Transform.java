import java.util.*;
public class Wave_Transform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        //declaring array 
        int [][] arr =new int[n][m];
        
        int top = 0;
        int bottom = arr.length;
        int left = 0;
        int right = arr[0].length;

        // taking input of array
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=left;i<right;i++) {
            if(i%2==0){
                for(int j=top;j<bottom;j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int j=bottom-1;j>=top;j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
        }


    }
    
}
