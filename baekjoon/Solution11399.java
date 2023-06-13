package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * ATM
 * https://www.acmicpc.net/problem/11399
 */

public class Solution11399 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int preSum = 0;
        int total = 0;
        for(int i = 0; i < N; i++) {
            int sum = preSum + arr[i];
            preSum = sum;
            total += preSum;
        }

        System.out.println(total);

    }

}
