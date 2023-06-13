package baekjoon;

import java.io.*;
import java.util.*;

/**
 * 백준
 * 회의실 배정
 * https://www.acmicpc.net/problem/1931
 */

public class Solution39 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Meeting[] meetings = new Meeting[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meetings[i] = new Meeting(start, end);
        }

        Arrays.sort(meetings);

        int end = meetings[0].getEnd();
        int cnt = 1;
        for (int i = 1; i < N; i++) {
            if(end <= meetings[i].getStart()) {
                end = meetings[i].getEnd();
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}

class Meeting implements Comparable<Meeting> {
    private int start;
    private int end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.end;
    }

    @Override
    public int compareTo(Meeting m) {
        int temp = this.end - m.getEnd();
        if(temp == 0) {
            return this.start - m.getStart();
        } else {
            return temp;
        }
    }
}