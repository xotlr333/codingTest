import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소프티어
 * 우물 안 개구리
 * https://softeer.ai/practice/info.do?idx=1&eid=394
 */

public class Solution45 {

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


