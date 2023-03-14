import java.util.*;
import java.io.*;

/**
 * 백준
 * 수열의 합
 * https://www.acmicpc.net/problem/1024
 */

public class Solution5 {

    static int N;
    static int L;
    static int I;
    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        N = Integer.parseInt(sc.next());
        L = Integer.parseInt(sc.next());

        I = N / 2;
        int answer = 1000;
        ArrayList<Integer> answerArr = new ArrayList<>();
        while (I >= 0) {
            boolean flag = func_1(I, 0, 1);
            int size = arrayList.size();
            if (flag && size >= L && size <= 100 && size < answer) {
                answer = arrayList.size();
                answerArr.clear();
                answerArr = (ArrayList<Integer>) arrayList.clone();
            }
            I--;
            arrayList.clear();
        }

        Collections.sort(answerArr);

        if (answer != 1000) {
            Iterator<Integer> iterator = answerArr.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        } else {
            System.out.println("-1");
        }

    }

    public static boolean func_1(int i, int s, int l) {
        if (l > 100) return false;

        int sum = i + s;
        if (sum < N) {
            arrayList.add(i);
            return func_1(i - 1, sum, l + 1);
        } else if (sum == N) {
            arrayList.add(i);
            if (arrayList.size() < L && arrayList.contains(1)) {
                arrayList.add(0);
            }
            return true;
        } else {
            return false;
        }

    }


}
