import java.util.*;
import java.io.*;

/**
 * 백준
 * N과 M (3)
 * https://www.acmicpc.net/problem/15651
 */

public class Solution43 {

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
        dfs(0);

        System.out.println(str);
    }

    public static void dfs(int death) {
        if(death == M){
            for(int a : arr) {
                str.append(a).append(" ");
            }
            str.append("\n");
            return;
        }

        for(int i = 0; i < N; i++) {
            arr[death] = i + 1;
            dfs(death + 1);
        }
    }
}


