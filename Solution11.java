import java.util.*;
import java.io.*;

/**
 * 소프티어
 * 8단 변속기
 * https://softeer.ai/practice/info.do?idx=1&eid=408
 */


public class Solution11 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int cnt = 1;
        String answer = "";

        for(int i = 0; i < 8; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 7; i++){
            if(arr[i] + 1 == arr[i+1]){
                cnt++;
            }
        }


        if(cnt != 8){
            for (int i = 0; i < 7; i++){
                if(arr[i] - 1 == arr[i+1]){
                    cnt++;
                }
            }

            if(cnt != 8){
                answer = "mixed";
            } else {
                answer = "descending";
            }
        } else {
            answer = "ascending";
        }

        System.out.println(answer);

    }


}