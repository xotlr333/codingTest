package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 최소공배수와 최대공약수
 * https://www.acmicpc.net/problem/2609
 */

public class Solution2609 {

	// gcd 활용
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int gcd = gcd(a, b);

		System.out.println(gcd);
		System.out.println(a*b/gcd);

	}

	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}



}