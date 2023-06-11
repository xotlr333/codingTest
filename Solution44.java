import java.util.*;
import java.io.*;

/**
 * 백준
 * N과 M (4)
 * https://www.acmicpc.net/problem/15652
 */

public class Solution44 {

    static int N;
    static int M;
    static int[] arr;
    static StringBuilder str = new StringBuilder();

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(1, 0);

        System.out.println(str);
    }

    public static void dfs(int at, int death) {
        if(death == M){
            for(int a : arr) {
                str.append(a).append(" ");
            }
            str.append("\n");
            return;
        }

        for(int i = at; i <= N; i++) {
            arr[death] = i;
            dfs(i,death + 1);
        }
    }
}


