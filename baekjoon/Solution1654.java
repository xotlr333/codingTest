package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 랜선 자르기
 * https://www.acmicpc.net/problem/1654
 */

public class Solution1654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        long max = 0;
        long min = 0;

        for(int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            if(max < num) {
                max = num;
            }
        }

        max++;
        while (max > min) {
            long count = 0;

            long mid = (max + min) / 2;

            for(int i = 0; i < K; i++) {
                long mok = arr[i] / mid;
                count += mok;
            }

            if(count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }

        System.out.println(min - 1);

    }

}


