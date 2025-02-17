package src;

import java.util.Scanner;

public class Keyboard6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] limits = new int[n];
        for (int i = 0; i < n; i++) {
            limits[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int[] counts = new int[n];
        for (int i = 0; i < k; i++) {
            int key = scanner.nextInt() - 1;
            if (key >= 0 && key < n) {
                counts[key]++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (counts[i] <= limits[i]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

