package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 파도반 수열
 * https://www.acmicpc.net/problem/9461
 */

public class Solution9461 {
    static long[] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder st = new StringBuilder();
        dp = new long[101];

        // 1, 1, 1, 2, 2, 3, 4, 5, 7, 9
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            long result = p(N);
            st.append(result).append("\n");
        }
        System.out.println(st);

    }

    public static long p(int n){
        if(dp[n] != 0) {
            return dp[n];
        }

        return dp[n] = p(n-2) + p(n-3);
    }

}


