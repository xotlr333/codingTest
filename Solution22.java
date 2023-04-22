import java.util.*;
import java.io.*;

/**
 * 백준
 * 수 정렬하기 2 (두번째 방안)
 * https://www.acmicpc.net/problem/2751
 */

public class Solution22 {

    // Counting Sort
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[2000001];

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]) {
                sb.append((i - 1000000)).append('\n');
            }
        }
        System.out.print(sb);

    }

}


