import java.util.Scanner;

public class substractionOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a1 = new int[n];
        int[] a2 = new int[m];

        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            a2[j] = sc.nextInt();
        }
        int[] res = new int[m];

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = res.length - 1;

        int c = 0;
        while (k >= 0) {
            int d = 0;
            int a1val = (i >= 0) ? a1[i] : 0; // if value of a1 array gone to negative then consider it as a zero
            // otherwise the value a1[i]
            if (a2[j] + c >= a1val) { // if upper array + carry is greater than lower array then normal substraction
                d = a2[j] + c - a1val;
            } else {
                d = a2[j] + c + 10 - a1val; // if upper array + carry is lower than lower array then brrow 1 and add 10
                                            // to the upper array and add carry as -1 to previous element of array
                c = -1;
            }
            res[k] = d;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (idx < res.length) {
            if (res[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

        while (idx < res.length) {
            System.out.println(res[idx]);
            idx++;
        }
    }
}
