package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 수 정렬하기 3
 * https://www.acmicpc.net/problem/10989
 */

public class Solution17 {

    // 계수 정렬(Counting Sort) 알고리즘
    public static void main(String args[]) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        int[] arr = new int[10000];

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(input.readLine());
            arr[num] += 1;
        }

        for(int i = 0; i < 10000; i++) {
            if(arr[i] > 0) {
                for(int j = 0; j < arr[i]; j++ ){
                    System.out.println(i);
                }
            }
        }

    }

}


