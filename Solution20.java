import java.util.*;
import java.io.*;

/**
 * 백준
 * 0 만들기
 * https://www.acmicpc.net/problem/7490
 */

public class Solution20 {

    static StringBuffer str = new StringBuffer();

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int n = sc.nextInt();

            dfs(n, 1, new char[n]);
            str.append("\n");
        }
        System.out.println(str.toString());

    }

    public static void dfs(int n, int cnt, char[] arr) {

        if(cnt == n){
            if(result(n,arr)){
                for(int i = 1; i <= n; i++) {
                    if(i != n){
                        str.append(i).append(arr[i]);
                    } else {
                        str.append(i).append("\n");
                    }
                }
            }
            return;
        }

        arr[cnt] = ' ';
        dfs(n, cnt + 1, arr);
        arr[cnt] = '+';
        dfs(n, cnt + 1, arr);
        arr[cnt] = '-';
        dfs(n, cnt + 1, arr);

    }

    public static boolean result(int n, char[] arr ) {
        int sum = 0;

        for(int i = n; i > 1; i--){
            int now = i;
            if(arr[i-1] == '+'){
                sum += now;
            } else if (arr[i-1] == '-') {
                sum -= now;
            } else if (arr[i-1] == ' ') {
                int result = i;
                int cnt = 1;
                while(arr[i-1] == ' '){
                    i--;
                    result = i * (int) Math.pow(10,cnt++) + result;
                }
                if(i-1 >= 1 && arr[i-1] == '-') {
                    sum -= result;
                } else {
                    sum += result;
                }
            }
        }
        if(arr[1] != ' ') {
            sum += 1;
        }

        return sum == 0;


    }
}
