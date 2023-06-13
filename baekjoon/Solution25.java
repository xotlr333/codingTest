package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 새
 * https://www.acmicpc.net/problem/1568
 */

public class Solution25 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int time = 0;
        int cnt = 1;
        while(num > 0) {
            if (num >= cnt) {
                num -= cnt;
                time++;
                cnt++;
            } else {
                cnt = 1;
                num -= cnt;
                time++;
                cnt++;
            }
        }

        System.out.println(time);

    }

}
