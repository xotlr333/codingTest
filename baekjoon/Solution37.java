package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 카드 정렬하기
 * https://www.acmicpc.net/problem/1715
 */

public class Solution37 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        StringBuilder str = new StringBuilder();
        int total = 0;

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            queue.offer(num);
        }

        while (queue.size() > 1) {
            int num1 = queue.poll();
            int num2 = queue.poll();
            int sum = num1 + num2;
            queue.offer(sum);
            total += sum;
        }

        System.out.println(total);
    }
}