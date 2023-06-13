package softeer;

import java.util.*;
import java.io.*;

/**
 * 소프티어
 * 전광판
 * https://softeer.ai/practice/info.do?idx=1&eid=624
 */

public class Solution33
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String No = input.nextLine();
        // int[] answer = new int[N];
        String[] inputArr = new String[N];
        for(int i = 0; i < N; i++){
            inputArr[i] = input.nextLine();
        }

        HashMap<Integer,int[]> hashMap = new HashMap<Integer,int[]>();
        hashMap.put(0, new int[]{1, 1, 1, 0, 1, 1, 1});
        hashMap.put(1, new int[]{0, 0, 1, 0, 0, 1, 0});
        hashMap.put(2, new int[]{1, 0, 1, 1, 1, 0, 1});
        hashMap.put(3, new int[]{1, 0, 1, 1, 0, 1, 1});
        hashMap.put(4, new int[]{0, 1, 1, 1, 0, 1, 0});
        hashMap.put(5, new int[]{1, 1, 0, 1, 0, 1, 1});
        hashMap.put(6, new int[]{1, 1, 0, 1, 1, 1, 1});
        hashMap.put(7, new int[]{1, 1, 1, 0, 0, 1, 0});
        hashMap.put(8, new int[]{1, 1, 1, 1, 1, 1, 1});
        hashMap.put(9, new int[]{1, 1, 1, 1, 0, 1, 1});
        hashMap.put(-1, new int[]{0, 0, 0, 0, 0, 0, 0});


        for(int i = 0; i < N; i++){
            int count = 0;
            String[] Arr = inputArr[i].split(" ");
            int A = Integer.parseInt(Arr[0]);
            int B = Integer.parseInt(Arr[1]);

            int[] As = new int[5];
            int[] Bs = new int[5];


            for(int j = 0; j < 5; j++){
                if(A == 0){ As[j] = -1; }
                else { As[j] = A%10; }
                A = A/10;
                if(B == 0) { Bs[j] = -1; }
                else { Bs[j] = B%10; }
                B = B/10;
            }

            for(int j = 0; j < 5; j++){
                int[] aArr = hashMap.get(As[j]);
                int[] bArr = hashMap.get(Bs[j]);

                for(int k = 0; k < 7; k++){
                    if(aArr[k] != bArr[k]){
                        count++;
                    }
                }

            }

            System.out.println(count);

        }




    }
}