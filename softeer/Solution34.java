package softeer;

import java.util.*;
import java.io.*;

/**
 * 소프티어
 * 스마트 물류
 * https://softeer.ai/practice/info.do?idx=1&eid=414
 */

public class Solution34
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        String str = sc.next();

        String[] arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = str.substring(i,i+1);
        }

        int result = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            boolean flag = false;
            if("P".equals(arr[i])){
                for(int j = K; j > 0; j--){
                    if((i-j) >= 0 && "H".equals(arr[i-j]) && !set.contains(i-j)){
                        set.add(i-j);
                        result++;
                        flag = true;
                        break;
                    }
                }

                if(!flag){
                    for(int j = 1; j < K + 1; j++){
                        if((i+j) < N && "H".equals(arr[i+j]) && !set.contains(i+j)){
                            set.add(i+j);
                            result++;
                            break;
                        }
                    }
                }

            }
        }

        System.out.println(result);

    }
}