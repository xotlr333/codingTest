package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 쿼드트리
 * https://www.acmicpc.net/problem/1992
 */

public class Solution1992 {

    public static StringBuilder result = new StringBuilder();
    public static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];

        for(int i = 0; i < N; i++) {
            String[] st = br.readLine().split("");

            for(int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st[j]);
            }
        }

        partition(0, 0, N);
        System.out.println(result);

    }

    public static void partition(int row, int col, int size) {

        if(numberCheck(row, col, size)) {

            if(arr[row][col] == 0) {
                result.append("0");
            }
            else {
                result.append("1");
            }
            return;
        }

        int newSize = size / 2;

        result.append("(");
        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        result.append(")");
    }


    public static boolean numberCheck(int row, int col, int size) {

        int num = arr[row][col];

        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {

                if(arr[i][j] != num) {
                    return false;
                }
            }
        }

        return true;
    }
}


