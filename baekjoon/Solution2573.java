package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 빙산
 * https://www.acmicpc.net/problem/2573
 * 메모리 초과
 */

public class Solution2573 {

    static int N;

    static int M;

    static int dfsCnt;

    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 순으로
    static int[] dy = {0 ,0 , -1, 1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        int result = 0;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
            }
        }

        int cnt = 0;
        boolean[][] visited;
        while (true){
            int[][] newMap = bfs(map);
            result++;
            cnt = 0;
            visited = new boolean[N][M];
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    dfs(newMap, visited, i, j);
                    if(dfsCnt > 0){
                        cnt++;
                        dfsCnt = 0;
                    }
                }
            }

            if(cnt >= 2 || cnt == 0){
                break;
            }

            map = newMap.clone();
        }

        System.out.println(cnt == 0? 0 : result);

    }

    public static int[][] bfs(int[][] map){
        Queue<int[]> queue = new LinkedList<>();
        int[][] newMap = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        queue.offer(new int[]{0,0});
        int cnt = 0;

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int x = node[0];
            int y = node[1];
            visited[x][y] = true;

            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < N && ny >= 0 && ny < M){
                    if(!visited[nx][ny]){
                        queue.offer(new int[]{nx, ny});
                    }

                    if(map[nx][ny] == 0){
                        cnt++;
                    }
                }
            }

            if(map[x][y] != 0){
                int num = Math.max(map[x][y] - cnt, 0);
                newMap[x][y] = num;
            }
            cnt = 0;

        }

        return newMap;

    }

    public static void dfs(int[][] map, boolean[][] visited, int x, int y) {
        if(map[x][y] == 0 || visited[x][y]){
            return;
        }

        visited[x][y] = true;
        dfsCnt++;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < N && ny >= 0&& ny < M){
                dfs(map, visited, nx, ny);
            }
        }

    }

}
