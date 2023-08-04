package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 안전 영역
 * https://www.acmicpc.net/problem/2468
 */

public class Solution2468 {

    static int N;
    static int[][] map;
    static List<Integer> results = new ArrayList<>();

    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 순으로
    static int[] dy = {0 ,0 , -1, 1};

    static int cnt = 0;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        StringTokenizer st;
        int max = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                if(max < num) {
                    max = num;
                }
            }
        }

        int maxResult = 0;
        int result = 0;
        for(int k = 1; k <= max; k++) {
            boolean[][] visited = new boolean[N][N];
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    dfs(visited, i, j, k);
                    if(cnt > 0) {
                        result++;
                        cnt = 0;
                    }
                }
            }
            if(maxResult < result) {
                maxResult = result;
            }
            result = 0;
        }

        System.out.println(maxResult);
    }


    public static void dfs(boolean[][] visited, int x, int y, int height) {
        if(map[x][y] < height || visited[x][y]){
            return;
        }
        visited[x][y] = true; // 방문한 영역은 N보다 작은 높이로 설정
        cnt++;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < N && ny >= 0 && ny < N){
                dfs(visited, nx, ny, height);
            }
        }

    }

}


