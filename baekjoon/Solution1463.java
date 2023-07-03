package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 1로 만들기
 * https://www.acmicpc.net/problem/1463
 */

public class Solution1463 {

    static Integer[] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N+1];

        dp[0] = 0;
        dp[1] = 0;

        System.out.println(find(N));

    }

    public static int find(int n) {
        if(dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(Math.min(find(n/3), find(n/2)), find(n-1)) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(find(n/3), find(n-1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(find(n/2), find(n-1)) + 1;
            } else {
                dp[n] = find(n-1) + 1;
            }

        }

        return dp[n];
    }


}


