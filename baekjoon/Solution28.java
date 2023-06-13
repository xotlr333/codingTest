package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 숫자 카드 2
 * https://www.acmicpc.net/problem/10816
 */

public class Solution28 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] str1 = br.readLine().split(" ");
        int[] cards = new int[N];
        for(int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(str1[i]);
        }

        int M = Integer.parseInt(br.readLine());
        String[] str2 = br.readLine().split(" ");
        int[] numbers = new int[M];
        for(int i = 0; i < M; i++) {
            numbers[i] = Integer.parseInt(str2[i]);
        }

        Arrays.sort(cards);

        for(int i = 0; i < M; i++) {
            int key = numbers[i];
            sb.append(up(cards, key) - low(cards, key)).append(" ");
        }
        System.out.println(sb);
    }

    public static int low(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if ( key <= arr[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;

    }


    public static int up(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if ( key < arr[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;

    }
}

