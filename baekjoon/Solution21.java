package baekjoon;

import java.util.*;
import java.io.*;

/**
 * 백준
 * 수 정렬하기 2 (첫번째 방안)
 * https://www.acmicpc.net/problem/2751
 */

public class Solution21 {

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            arrayList.add(sc.nextInt());
        }

        Collections.sort(arrayList); // TimSort 알고리즘을 사용하기 때문에 시간복잡도 O(n) ~ O(nlogn) 를 보장한다.

        for (int a : arrayList){
            sb.append(a).append("\n");
        }

        System.out.println(sb);

    }

}


