package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * K번째 수
 * https://www.acmicpc.net/problem/1300
 */

public class Solution1300 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        long max = K;
        long min = 1;

        while (max > min) {
            long cnt = 0;

            long mid = (max + min) / 2;

            for(int i = 1; i <= N; i++) {
                cnt += Math.min(mid / i, N);
                if(cnt > K){
                    break;
                }
            }

            if(cnt >= K) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }

        System.out.println(min);

    }

}


