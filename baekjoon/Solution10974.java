package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 모든 순열
 * https://www.acmicpc.net/problem/10974
 */

public class Solution10974 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		boolean[] visited = new boolean[n+1];

		backtracking(n, arr, visited, 0);

	}

	public static void backtracking(int n, int[] arr, boolean[] visited, int index){

		if(index == n) {
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}


		for(int i = 0; i < n; i++) {
			if(!visited[i]){
				arr[index] = i + 1;
				visited[i] = true;
				backtracking(n, arr, visited, index + 1);
				visited[i] = false;
			}

		}
	}

}