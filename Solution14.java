import java.util.*;
import java.io.*;

/**
 * 백준
 * 소트인사이드
 * https://www.acmicpc.net/problem/1427
 */

public class Solution14 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for(int i = 9; i >= 0; i--){
            int cnt = 0;
            if(str.contains(Integer.toString(i))) {
                for(int j = 0; j < str.length(); j++){
                    if(arr[j] == i + '0'){
                        cnt++;
                    }
                }
            }

            for(int j = 0; j < cnt; j++){
                result.append(Integer.toString(i));
            }
        }
        System.out.println(result.toString());

    }

}
