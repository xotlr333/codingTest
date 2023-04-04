import java.util.*;
import java.io.*;

/**
 * 소프티어
 * 비밀메뉴
 * https://softeer.ai/practice/info.do?idx=1&eid=623
 */

public class Solution9
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        int K = input.nextInt();
        int[] SecretNum = new int[M];
        for(int i=0; i<M; i++){
            SecretNum[i] = input.nextInt();
        }
        int[] Num = new int[N];
        for(int i=0; i<N; i++){
            Num[i] = input.nextInt();
        }

        int index = 0;
        boolean flag = false;
        for(int i=0; i<N; i++){
            if(index == M){
                flag = true;
                break;
            }
            if(SecretNum[index] == Num[i]){
                index++;
            }else{
                index = 0;
            }
        }
        if(flag){
            System.out.println("secret");
        }else{
            System.out.println("normal");
        }


    }
}