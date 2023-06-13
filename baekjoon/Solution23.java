package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * K번째 수
 * https://www.acmicpc.net/problem/11004
 */

public class Solution23 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strs = str.split(" ");
        int K = Integer.parseInt(strs[1]);
        ArrayList<Integer> arrayList = new ArrayList<>();

        str = br.readLine();
        strs = str.split(" ");
        for(int i = 0; i < strs.length; i++) {
            arrayList.add(Integer.parseInt(strs[i]));
        }

        Collections.sort(arrayList);

        System.out.println(arrayList.get(K-1));

    }

}
