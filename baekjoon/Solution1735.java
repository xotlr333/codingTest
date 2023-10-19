package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 분수 합
 * https://www.acmicpc.net/problem/1735
 */

public class Solution1735 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());

		int gcd = gcd(b1, b2);

		int b3 = b1*b2/gcd;
		int a3 = (a1*(b3/b1)) + (a2*(b3/b2));

		while(true) {
			gcd = gcd(a3, b3);

			if(gcd == 1) break;

			a3 = a3/gcd;
			b3 = b3/gcd;
		}

		System.out.println(a3 + " " + b3);


	}

	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}


}