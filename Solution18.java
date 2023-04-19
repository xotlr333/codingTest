import java.util.*;
import java.io.*;

/**
 * 백준
 * 피보나치 수열
 * https://www.acmicpc.net/problem/2747
 */

public class Solution18 {

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for(int i = 2; i < n; i++) {
            int x = b;
            int y = a + b;

            a = x;
            b = y;
        }

        System.out.println(a + b);

    }

}
