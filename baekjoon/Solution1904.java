package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 01타일
 * https://www.acmicpc.net/problem/1904
 */

public class Solution1904 {
    static int[] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N+1];

        dp[0] = 0;
        dp[1] = 1;
        if(N > 1){
            dp[2] = 2;
        }

        for(int i = 3; i < dp.length; i++){
            dp[i] = -1;
        }

        System.out.println(tile(N));

    }

    public static int tile(int n){

        if(dp[n] == -1){
            dp[n] = (tile(n - 1) + tile(n - 2)) % 15746;
        }
        return dp[n];
    }

}


