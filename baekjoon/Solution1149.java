package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * RGB거리
 * https://www.acmicpc.net/problem/1149
 */

public class Solution1149 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] cost = new int[N][3];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < N; i++) {
            cost[i][0] += Math.min(cost[i-1][1], cost[i-1][2]);
            cost[i][1] += Math.min(cost[i-1][0], cost[i-1][2]);
            cost[i][2] += Math.min(cost[i-1][0], cost[i-1][1]);
        }

        System.out.println(Math.min(cost[N-1][0], Math.min(cost[N-1][1], cost[N-1][2])));


    }

}


