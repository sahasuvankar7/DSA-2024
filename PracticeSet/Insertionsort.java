

public class Insertionsort {
    public static void main(String[] args) {

    }

    public int getMin(int [] arr , int index){

        int min = arr[index];
        int idx = 0;
        for (int i = index; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
                idx= i;
            }


        }
        return idx;

    }

    
    public void sort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];

            for (int j = i+1; j <n ; j++) {
               int min = arr[j];
               if()
            }
            
        }
    }
}
