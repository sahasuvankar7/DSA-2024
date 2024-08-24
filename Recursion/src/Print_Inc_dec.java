//Print Decreasing Increasing Numbers using Recursion
//https://youtu.be/V-WSKmGTWxk

public class Print_Inc_dec {
    public static void main(String[] args) {
        int n = 5;
        int temp = n;
        pdi(n);
    }
    public static void pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
    public static void pi(int n,int temp){
        if(n==1){
            System.out.println(n);
           pd(n,temp);
           return;
        }
        System.out.println(n);
        pi(n-1,temp);
    }
    public static void pd(int n,int temp){
        if(n>temp){
            return;
        }

        System.out.println(n);
        pd(n+1,temp);


    }
}

//    public static void main(String[] args) {
//        pid(5);
//    }
//static void pid(int num){
//    // code here
//}