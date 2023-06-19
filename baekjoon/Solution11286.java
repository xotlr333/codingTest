package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 절댓값 힙
 * https://www.acmicpc.net/problem/11286
 */

public class Solution11286 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Comparator comp = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (Math.abs((int)o1) == Math.abs((int)o2)) {
                    return (int)o1 - (int)o2;
                } else {
                    return Math.abs((int)o1) - Math.abs((int)o2);
                }
            }
        };

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(comp);

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                if(priorityQueue.size() == 0) {
                    st.append(0).append("\n");
                } else {
                    st.append(priorityQueue.poll()).append("\n");
                }
            } else {
                priorityQueue.offer(num);
            }
        }

        System.out.println(st);

    }

}


