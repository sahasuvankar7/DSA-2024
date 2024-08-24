import java.util.Scanner;

public class Array_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int p = sc.nextInt();
        int q = sc.nextInt();

        int ans = 0;
        // declaration of array
        int[][] a1 = new int[m][n];
        int[][] a2 = new int[p][q];

        int[][] res = new int[m][q];

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[0].length; j++) {
                a1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[0].length; j++) {
                a2[i][j] = sc.nextInt();
            }
        }

        if (m != p) {
            System.out.println("invalid input");
            return;
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                for (int k = 0; k < n; k++) {
                    res[i][j] += (a1[i][k] * a2[k][j]);
                }
            }

        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
