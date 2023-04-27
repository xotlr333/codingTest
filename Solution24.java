import java.util.*;
import java.io.*;

/**
 * 백준
 * 문서 검색
 * https://www.acmicpc.net/problem/1543
 */

public class Solution24 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String word = br.readLine();
        int cnt = 0;

        while(true) {
            int index = str.indexOf(word);
            if(index > -1) {
                str = str.substring(index + word.length(), str.length());
                cnt++;
            } else {
                break;
            }
        }

        System.out.println(cnt);

    }
}
