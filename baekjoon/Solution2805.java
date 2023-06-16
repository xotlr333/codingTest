package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 나무 자르기
 * https://www.acmicpc.net/problem/2805
 */

public class Solution2805 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int max = 0;
        int min = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            if(max < num) {
                max = num;
            }
        }

        while (max > min) {
            long sum = 0;

            int mid = (max + min) / 2;

            for(int i = 0; i < N; i++) {
                if(arr[i] > mid) {
                    sum += arr[i] - mid;
                }
            }

            if(sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }

        System.out.println(min - 1);

    }

}


