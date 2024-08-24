public class Recursive_sequence {
    public static void main(String[] args) {
        System.out.println(sequence(5));
    }
    static long sequence(int N){
        // code here
        if(N==1){
            return 1;
        }
        else{
            long term = CalculateF(N);
            return sequence(N-1)+term;
        }
    }
    static long CalculateF(int n){
        long mul = 1;

        for(int i=(n*(n+1))/2;i>(n*(n-1))/2;i--){
            mul*=i;


        }
        return mul;
    }
}
