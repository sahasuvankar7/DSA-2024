public class Digit_concept_recursion {
    public static void main(String[] args) {
//    digit(5);
//        System.out.println(1/10);

        reverseNumber(1234);
        System.out.println(sum);
    }
    static void digit(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        digit(n--);// it will give an error because it first pass the value to the func then
        // decrement it. so , if closely see this problem it never gets decremented
        digit(--n); // but here it first decrement it then pass the decremented value to func
    }
static int sum = 0;
    static void reverseNumber(int n){
        if(n==0)
            return;
        int rem = n%10;
        sum = sum * 10 + rem;
         reverseNumber(n/10);
    }
}
