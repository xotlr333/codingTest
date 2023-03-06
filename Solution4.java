
import java.util.*;
import java.io.*;

/**
 * 백준
 * 유기농 배추
 * https://www.acmicpc.net/problem/1012
 */

public class Solution4 {
    static int[][] map;
    static int cnt = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int[] inputArr = new int[3];
            for (int j = 0; j < 3; j++) {
                inputArr[j] = Integer.parseInt(sc.next());
            }
            map = new int[inputArr[0]][inputArr[1]];

            for (int j = 0; j < inputArr[2]; j++) {
                int tmp1 = Integer.parseInt(sc.next());
                int tmp2 = Integer.parseInt(sc.next());

                map[tmp1][tmp2] = 1;
            }

            for (int j = 0; j < map.length; j++) {
                for (int k = 0; k < map[j].length; k++) {
                    if (func_1(j, k)) cnt++;
                }
            }
            System.out.println(cnt);
            cnt = 0;

        }

    }

    static boolean func_1(int x, int y) {
        if (map[x][y] == 1) {
            map[x][y] = 0;
            if (x + 1 < map.length) func_1(x + 1, y);
            if (x - 1 >= 0) func_1(x - 1, y);
            if (y + 1 < map[x].length) func_1(x, y + 1);
            if (y - 1 >= 0) func_1(x, y - 1);
            return true;
        }
        return false;
    }

}
