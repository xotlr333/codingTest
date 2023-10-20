package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 가로수
 * https://www.acmicpc.net/problem/2485
 */

public class Solution2485 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int gcd = 0;
		int result = 0;

		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			if(i > 0){
				int temp = arr[i] - arr[i-1];
				gcd = gcd(temp, gcd);
			}
		}

		int size = arr.length;
		result = ((arr[size - 1] - arr[0]) / gcd) - size + 1;


		System.out.println(result);

	}

	public static int gcd(int a, int b){
		if(b == 0) return a;
		return gcd(b, a%b);
	}

}