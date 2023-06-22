package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 신나는 함수 실행
 * https://www.acmicpc.net/problem/9184
 */

public class Solution9184 {
    static int[][][] dp = new int[21][21][21];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == -1 && b == -1 && c == -1){
                break;
            }

            result.append("w("+ a + ", " + b + ", " + c + ") = " + w(a,b,c)).append("\n");
        }

        System.out.println(result);

    }

    public static int w(int a, int b, int c){

        if((a<=20 && a>0 && b<=20 && b>0 && c<=20 && c>0) && dp[a][b][c] != 0){
            return dp[a][b][c];
        }

        if(a <= 0 || b <= 0 || c <= 0){
            return 1;
        }

        if(a > 20 || b > 20 || c > 20 ){
            return dp[20][20][20] = w(20,20,20);
        }

        if(a < b && b < c){
            return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        }

        return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }



}


