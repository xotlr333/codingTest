package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * Z
 * https://www.acmicpc.net/problem/1074
 */

public class Solution19 {

    static int cnt = 0;

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int size = (int) Math.pow(2, n);

        findCnt(size, r, c);

        System.out.println(cnt);

    }

    public static void findCnt(int size, int r, int c) {
        if(size == 1) {
            return;
        }

        if(r < size/2 && c < size/2) {
            findCnt(size/2, r, c);
        } else if(r < size/2 && c >= size/2) {
            cnt += (size * size) / 4;
            findCnt(size/2, r, c - (size/2));
        } else if(r >= size/2 && c < size/2) {
            cnt += ((size * size) / 4) * 2;
            findCnt(size/2, r - (size/2), c);
        } else if(r >= size/2 && c >= size/2) {
            cnt += ((size * size) / 4) * 3;
            findCnt(size/2, r - (size/2), c - (size/2));
        }

    }
}


