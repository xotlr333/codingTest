package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 단지번호붙이기
 * https://www.acmicpc.net/problem/2667
 */

public class Solution2667 {

    static int N;
    static int[][] map;
    static List<Integer> results = new ArrayList<>();

    static int cnt = 0;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for(int i = 0; i < N; i++) {
            String st = br.readLine();
            String[] arr = st.split("");
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                dfs(i,j);
                if(cnt > 0) {
                    results.add(cnt);
                    cnt = 0;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        Collections.sort(results);
        sb.append(results.size()).append("\n");
        results.forEach(result -> sb.append(result).append("\n"));

        System.out.println(sb);
    }


    public static void dfs(int x, int y) {
        if(map[x][y] == 0){
            return;
        }
        map[x][y] = 0; // 방문한 집은 0으로 변경
        cnt++;
        if(x-1 >= 0) dfs(x-1, y); // 상
        if(x+1 <= N-1) dfs(x+1, y); // 하
        if(y-1 >= 0) dfs(x, y-1); // 좌
        if(y+1 <= N-1) dfs(x, y+1); // 우

    }

}
