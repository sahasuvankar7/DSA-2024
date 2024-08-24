public class Binary_search_using_Recursion {
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,23,67,77};
        int target = 77;
        System.out.println(BS(arr,target,0,arr.length-1));
    }
    static int BS(int [] arr,int target,int s,int e){
        // if target element is not found
        if(s>e)
            return -1;
        int mid = s+(e-s)/2;
        // if mid ele is found
        if(arr[mid]==target){
            return mid;
        }
        // if middle element is on the right side after dividing the array
        else if(arr[mid]<target){
            return BS(arr,target,mid+1,e);
        }
        // if middle ele is on the left side
        return BS(arr,target,s,mid-1);

    }
}
