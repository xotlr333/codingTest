package softeer;

import java.util.*;
import java.io.*;

/**
 * 소프티어
 * 성적 평균
 * https://softeer.ai/practice/info.do?idx=1&eid=389
 */


public class Solution12 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] scoreArr = new int[N];
        for(int i = 0; i < N; i++){
            scoreArr[i] = sc.nextInt();
        }

        for(int i = 0; i < K; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();

            double result = 0;
            for(int j = s - 1; j < e; j++){
                result += scoreArr[j];
            }
            result = Math.round((result / (e - s + 1))*100) / 100.00;
            System.out.println(String.format("%.2f", result));
        }


    }
}