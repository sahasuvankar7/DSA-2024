package Sorting;

// cyclic sort only applicable for the range of 1 to N
public class CyclicSort {
    public static void main(String[] args) {
        int [] nums = {5,4,2,1,3};
        selection(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void selection(int [] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
