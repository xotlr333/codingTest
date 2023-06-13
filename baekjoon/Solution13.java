package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 수 정렬하기
 * https://www.acmicpc.net/problem/2750
 */

public class Solution13 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(sc.next());
        }

        //선택정렬
        for(int i = 0; i < N; i++){
            int minIndex = i;
            for(int j = i+1; j < N; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        for(int i = 0; i < N; i++){
            System.out.println(arr[i]);
        }

    }

}
