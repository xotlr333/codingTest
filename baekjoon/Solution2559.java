package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 수열
 * https://www.acmicpc.net/problem/2559
 */

public class Solution2559 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] sum = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(i > 0){
                sum[i] = sum[i - 1] + arr[i];
            } else {
                sum[i] = arr[i];
            }
        }

        int max = sum[K-1];

        for(int i = K; i < N; i++){
            max = Math.max(max, sum[i] - sum[i - K]);
        }

        System.out.println(max);

    }

}


