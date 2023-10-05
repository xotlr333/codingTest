package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 쉬운 계단 수
 * https://www.acmicpc.net/problem/10844
 */

public class Solution10844 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		long mod = 1000000000;
		long[][] dp = new long[N+1][10];

		for(int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}

		for(int i = 2; i <= N; i++) {
			for(int j = 0; j < 10; j++) {
				if (j == 9) {
					dp[i][j] = dp[i-1][8] % mod;
				} else if (j == 0) {
					dp[i][j] = dp[i-1][1] % mod;
				} else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;
				}
			}
		}

		long result = 0;
		for(int i = 0; i < 10; i++) {
			result += dp[N][i];
		}

		System.out.println(result % mod);

	}

}