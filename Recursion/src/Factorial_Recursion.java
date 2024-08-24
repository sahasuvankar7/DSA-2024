public class Factorial_Recursion {
    public static void main(String[] args) {
        System.out.println(Factorial(6));
    }
    static int Factorial(int n){
        if(n==0){
            return 1;
        }
        return n * Factorial(n-1);
    }
}
