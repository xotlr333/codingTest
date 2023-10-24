package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 베르트랑 공존
 * https://www.acmicpc.net/problem/4948
 */

public class Solution4948 {

	// 에라토스테네스의 체 알고리즘 이용
	static boolean[] prime;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true){

			int n = Integer.parseInt(br.readLine());

			if (n == 0) {
				break;
			}

			int m = 2 * n;
			int result  = 0;
			prime = new boolean[m+1];

			get_prime();

			for(int i = n + 1; i <= m; i++){
				if(!prime[i]) result++;
			}

			System.out.println(result);
		}


	}

	public static void get_prime() {
		prime[0] = prime[1] = true;

		// 2부터 루트m까지
		for(int i = 2; i < Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;

			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}