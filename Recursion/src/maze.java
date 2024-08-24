public class maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }
    static int count(int r,int c){
       if(r==1 || c==1){ // if the col or row is at last then returned 1 .no need to move forward
           return 1;
       }
       int left =count(r-1,c); // in left recursion the row is decreasing
       int right = count(r,c-1); // in right recursion the col is decreasing

       return left + right; // here we add left recursion tree + right recursion tree
    }
}
