package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 최소공배수
 * https://www.acmicpc.net/problem/1934
 */

public class Solution1934 {

	// gcd 활용
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int gcd = gcd(a, b);

			System.out.println(a*b/gcd);
		}

	}

	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}



}