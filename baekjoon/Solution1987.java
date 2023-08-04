package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 알파벳
 * https://www.acmicpc.net/problem/1987
 */

public class Solution1987 {

    static int R;

    static int C;

    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 순으로
    static int[] dy = {0 ,0 , -1, 1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        String[][] map = new String[R][C];

        for(int i = 0; i < R; i++) {
            String temp = br.readLine();
            String[] tempArr = temp.split("");
            for(int j = 0; j < C; j++) {
                map[i][j] = tempArr[j];
            }
        }

        Set<String> visited = new HashSet<>();
        int result = dfs(map, visited,0,0 , 0, 0);

        System.out.println(result);

    }


    public static int dfs(String[][] map, Set<String> visited, int x, int y, int cnt, int maxCnt) {
        String s = map[x][y];

        if(visited.contains(s)){
            return cnt;
        }
        visited.add(s);
        cnt += 1;

        for(int i = 0; i < 4; i++){
            int num = 0;

            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < R && ny >= 0 && ny < C){
                num = dfs(map, visited, nx, ny, cnt, maxCnt);
            }

            if(maxCnt < num) {
                maxCnt = num;
            }
        }

        visited.remove(s);
        return maxCnt;

    }

}


