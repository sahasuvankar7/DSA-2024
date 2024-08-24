import java.util.*;
public class Subset_Sums {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3));


     subsetSums(0,list,0);
    }



        static void subsetSums(int i,ArrayList<Integer> arr,int sum){
            // code here
           if(i==arr.size()){
               System.out.println(sum);
               return;
           }
           subsetSums(i+1,arr,sum+arr.get(i));
           subsetSums(i+1,arr,sum);

        }
        }


