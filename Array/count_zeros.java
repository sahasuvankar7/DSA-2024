public class count_zeros {
    public static void main(String[] args) {

        System.out.println(zeros(10230,0));
    }
    public static int zeros(int n,int c){
        if(n==0) return c;
        int rem = n%10;
        n=n/10;

            if (rem == 0) {
                return zeros(n, c + 1);
            }
            return zeros(n,c);
    }
}
