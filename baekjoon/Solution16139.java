package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 인간-컴퓨터 상호작용
 * https://www.acmicpc.net/problem/16139
 */

public class Solution16139 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String word = br.readLine();
        int length = word.length();
        int[][] arr = new int[length+1][26];
        char[] wordToChar = word.toCharArray();
        arr[1][word.charAt(0)-'a']++;

        for(int i = 2; i <= length; i++){
            int idx = wordToChar[i-1] - 'a';
            for(int j = 0; j < 26; j++){
                if(idx == j){
                    arr[i][j] = arr[i-1][j] + 1;
                } else {
                    arr[i][j] = arr[i-1][j];
                }
            }
        }

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int q = st.nextToken().charAt(0) - 'a';

            int l = Integer.parseInt(st.nextToken()) + 1;
            int r = Integer.parseInt(st.nextToken()) + 1;

            result.append(arr[r][q] - arr[l-1][q]).append("\n");
        }

        System.out.println(result);

    }

}

