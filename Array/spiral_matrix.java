import java.util.*;
public class spiral_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        //declaring array 
        int [][] arr =new int[n][m];
        
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int top = 0;
        int left = 0;
        int bottom = arr.length-1;
        int right = arr[0].length-1;
        int te = n * m;
        int count=0;

        while(true){
            for(int i=top,j=left;i<=bottom && count<te;i++){
                System.out.print(arr[i][j]);
                count++;
            } left++;

            for(int i=bottom,j=left;j<=right && count<te;j++){
                System.out.println(arr[i][j]);
                count++;
            } bottom--;

            for(int i=bottom,j=right;i>=top && count<te;i--){
                System.out.print(arr[i][j]);
                count++;
            }right--;
            for(int i=top ,j=right;j>=left && count<te;j--){
                System.out.println(arr[i][j]);
                count++;
            }
            top++;
        }
    }   
    
}
