package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 계단 오르기
 * https://www.acmicpc.net/problem/2579
 */

public class Solution2579 {

    static int N;
    static int[] arr;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        dp = new Integer[N+1];

        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];
        dp[1] = arr[1];
        if(N >= 2){
            dp[2] = arr[1] + arr[2];
        }


        System.out.println(find(N));
    }

    public static int find(int n){

        if(dp[n] == null) {
            dp[n] = Math.max(find(n - 2), find(n - 3) + arr[n - 1]) + arr[n];
        }

        return dp[n];

    }

}


