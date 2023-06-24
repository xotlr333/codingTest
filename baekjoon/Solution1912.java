package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 연속합
 * https://www.acmicpc.net/problem/1912
 */

public class Solution1912 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] dp = new long[n+1];
        int[] arr = new int[n+1];

        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 0;
        arr[0] = 0;

        long max = arr[1];

        for(int i = 1; i <= n; i++) {
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);

            max = Math.max(dp[i], max);
        }

        System.out.println(max);

    }

}


