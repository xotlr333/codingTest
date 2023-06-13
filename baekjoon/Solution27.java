package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 트로피 진열
 * https://www.acmicpc.net/problem/1668
 */

public class Solution27 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int leftCnt = 1;
        int rightCnt = 1;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            if(num > max) {
                max = num;
                if(i != 0) leftCnt++;
            }
        }

        max = 0;
        for (int i = N - 1; i >= 0; i--) {
            int num = arr[i];
            if(num > max) {
                max = num;
                if(i != N - 1) rightCnt++;
            }
        }

        System.out.println(leftCnt);
        System.out.println(rightCnt);

    }

}

