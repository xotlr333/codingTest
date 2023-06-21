package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 알고리즘 수업 - 피보나치 수 1
 * https://www.acmicpc.net/problem/24416
 */

public class Solution24416 {
    static int[] dp;
    static int cnt1;
    static int cnt2;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];

        fib(n);
        fibonacci(n);

        System.out.println(cnt1 + " " + cnt2);

    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        } else {
            return (fib(n-1) + fib(n-2));
        }
    }

    public static int fibonacci(int n) {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n; i++) {
            cnt2++;
            dp[i] = dp[i -2] + dp[i - 1];
        }
        return dp[n-1];
    }
}
