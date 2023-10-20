package baekjoon;

import java.math.BigInteger;
import java.util.*;
import java.io.*;

/**
 * 백준
 * 다음 소수
 * https://www.acmicpc.net/problem/4134
 */

public class Solution4134 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());


		for(int i = 0; i < n; i++) {
			BigInteger num = new BigInteger(br.readLine());

			if(num.isProbablePrime(10)){
				System.out.println(num);
			} else {
				System.out.println(num.nextProbablePrime());
			}
		}

	}

}