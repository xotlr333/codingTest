package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 최대 힙
 * https://www.acmicpc.net/problem/11279
 */

public class Solution11279 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                if(priorityQueue.size() == 0) {
                    st.append(0).append("\n");
                } else {
                    st.append(priorityQueue.poll()).append("\n");
                }
            }
            priorityQueue.offer(num);
        }

        System.out.println(st);

    }

}


