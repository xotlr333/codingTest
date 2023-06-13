package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 공유기 설치
 * https://www.acmicpc.net/problem/2110
 */

public class Solution29 {

    static int[] houses;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        houses = new int[N];

        for (int i = 0; i < N; i++){
            houses[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(houses);

        int lo = 1;
        int hi = houses[N - 1] - houses[0] + 1;

        while (lo < hi) {
            int mid = (hi + lo) / 2;

            if(install(mid) < M) {
                hi = mid;
            } else {
                lo = mid + 1;
            }

        }

        System.out.println(lo - 1);

    }

    public static int install(int dis) {
        int cnt = 1;
        int last = houses[0];

        for(int i = 1; i < houses.length; i++) {
            int now = houses[i];

            if(now - last >= dis) {
                cnt++;
                last = now;
            }
        }
        return cnt;
    }

}
