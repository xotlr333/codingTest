package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 정수 삼각형
 * https://www.acmicpc.net/problem/1932
 */

public class Solution1932 {

    static int N;
    static int[][] arr;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new int[N+1][N+1];
        dp = new Integer[N+1][N+1];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int j = 0;
            while (st.hasMoreTokens()){
                arr[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }

        for (int i = 0; i < N; i++) {
            dp[N-1][i] = arr[N-1][i];
        }

        System.out.println(findMax(0,0));
    }

    public static int findMax(int level, int n){

        if(level == N - 1) {
            return dp[level][n];
        }

        if(dp[level][n] == null) {
            dp[level][n] = Math.max(findMax(level + 1, n), findMax(level + 1, n + 1)) + arr[level][n];
        }

        return dp[level][n];

    }

}


