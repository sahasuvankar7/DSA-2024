import java.util.*;

public class sumOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k;

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] res = new int[n > m ? n : m];

        int p = arr1.length - 1;
        int q = arr2.length - 1;
        int r = res.length - 1;
        int c = 0;

        while (r >= 0) {
            int d = c;
            if (p >= 0) {
                d += arr1[p];
            }
            if (q >= 0) {
                d += arr2[q];
            }

            c = d / 10;
            d = d % 10;

            res[r] = d;

            p--;
            q--;
            r--;

        }

        if (c != 0) {
            System.out.println(c);
        }
        for (int val : res) {
            System.out.print(val);
        }

    }
}
