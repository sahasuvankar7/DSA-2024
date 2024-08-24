import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int floor = max; floor >= 1; floor--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= floor) {
                    System.out.print("*\n");
                } else {
                    System.out.print("\n");
                }
            }
            System.out.println();
        }
    }

}
