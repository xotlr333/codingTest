import java.io.*;
import java.util.*;

/**
 * 백준
 * 동전 0
 * https://www.acmicpc.net/problem/11047
 */

public class Solution38 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coins = new int[N];
        int result = 0;

        for(int i = 0; i < N; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }

        for(int i = N-1; i >= 0; i--) {
            int money = coins[i];
            int temp = K/money;

            if(temp > 0) {
                result += temp;
                K = K%money;
            }
        }
        System.out.println(result);

    }
}