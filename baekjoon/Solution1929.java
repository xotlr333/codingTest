package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 소수 구하기
 * https://www.acmicpc.net/problem/1929
 */

public class Solution1929 {

	// 에라토스테네스의 체 알고리즘 이용
	static boolean[] prime;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		prime = new boolean[m+1];

		get_prime();

		for(int i = n; i <= m; i++){
			if(!prime[i]) System.out.println(i);
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