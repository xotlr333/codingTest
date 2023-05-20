import java.util.*;
import java.io.*;

/**
 * 백준
 * 최소 힙
 * https://www.acmicpc.net/problem/1927
 */

public class Solution35 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                if(queue.isEmpty()) {
                    str.append("0\n");
                } else {
                    str.append(queue.poll()).append("\n");
                }
            } else {
                queue.offer(num);
            }
        }

        System.out.println(str);
    }
}


