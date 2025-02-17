package src;

import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] n = s.nextLine().split(" ");
        int[] a = new int[n.length];
        for (int i = 0; i < n.length; i++) a[i] = Integer.parseInt(n[i]);
        Arrays.sort(a);
        int p1 = a[a.length - 1] * a[a.length - 2] * a[a.length - 3];
        int p2 = a[0] * a[1] * a[a.length - 1];
        System.out.println(p1 > p2 ? a[a.length - 1] + " " + a[a.length - 2] + " " + a[a.length - 3] : a[0] + " " + a[1] + " " + a[a.length - 1]);
    }
}



