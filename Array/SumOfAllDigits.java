public class SumOfAllDigits {
    public static void main(String[] args) {
        int num = 1234;
   
        System.out.println(findDigit(num));
    }
    static int findDigit(int num) {
        int sum = 0;
         int x = 0 ;
        while(num>0){
            x = num%10;//4
            sum+=x;
            num=num/10;
           
        }
        return sum;
    }
    
}
