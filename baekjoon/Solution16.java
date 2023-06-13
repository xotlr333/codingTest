package baekjoon;

import java.util.*;

/**
 * 백준
 * 좌표 정렬하기
 * https://www.acmicpc.net/problem/11650
 */

public class Solution16 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        Coordinate[] arr = new Coordinate[N];

        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());

            arr[i] = new Coordinate(x, y);
        }

        Arrays.sort(arr);

        for(Coordinate coordinate : arr){
            System.out.println(coordinate.getX() + " " + coordinate.getY());
        }

    }

}

class Coordinate implements Comparable<Coordinate> {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public int compareTo(Coordinate o) {
        if(o.getX() == this.x){
            return this.y - o.getY();
        } else {
            return this.x - o.getX();
        }
    }
}

