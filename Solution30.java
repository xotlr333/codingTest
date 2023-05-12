import java.util.*;
import java.io.*;

/**
 * 백준
 * 중량제한
 * https://www.acmicpc.net/problem/1939
 */

public class Solution30 {

    static ArrayList<ArrayList<Node>> list = new ArrayList<>();
    static boolean[] visited;


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int hi = 0;
        int lo = 0;


        for (int i = 0; i <= N; i ++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int Island1 = Integer.parseInt(st.nextToken());
            int Island2 = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.get(Island1).add(new Node(Island2, weight));
            list.get(Island2).add(new Node(Island1, weight));

            if(i == 0) {
                hi = weight;
                lo = weight;
                continue;
            }

            if (hi < weight) {
                hi = weight;
            }

            if (lo > weight) {
                lo = weight;
            }
        }
        hi += 1;

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        while (lo < hi) {
            int mid = (hi + lo) / 2;
            visited = new boolean[N + 1];

            if(!bfs(start, end, mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        System.out.println(lo - 1);

    }

    public static boolean bfs(int start, int end, int mid) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            if(temp == end) return true;

            for(int i = 0; i < list.get(temp).size(); i++) {
                if(list.get(temp).get(i).weight >= mid && visited[list.get(temp).get(i).num] == false) {
                    visited[list.get(temp).get(i).num] = true;
                    queue.offer(list.get(temp).get(i).num);
                }
            }

        }

        return false;
    }

}

class Node {
    int num;
    int weight;

    public Node(int num, int weight) {
        this.num = num;
        this.weight = weight;
    }
}

