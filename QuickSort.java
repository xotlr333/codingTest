import java.util.*;
import java.io.*;

public class QuickSort {
    static int[] arr;

    // 퀵정렬
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        partitioning(0, N - 1);

        for (int a : arr){
            System.out.println(a);
        }

    }

    public static void partitioning(int left, int right) {

        int pl = left;
        int pr = right;
        int pivot = arr[(pl + pr) / 2]; // 피벗은 각 끝의 커서의 중간 값으로 선택

        do {
            while (arr[pl] < pivot) { // arr[pl] 값이 pivot보다 큰 수 탐색
                pl++;
            }
            while (arr[pr] > pivot) { // arr[pr] 값이 pivot보다 작은 수 탐색
                pr--;
            }
            if (pl <= pr) { // pl보다 pr이 크면 교환(오름차순)
                swap(pl++, pr--);
            }
        } while (pl <= pr);

        // 정렬 끝난 후 나누어진 두개의 그룹에 데이터 수를 체크
        if (left < pr)
            partitioning(left, pr); // left가 pr보다 작으면 그룹의 수가 1개 이상이기 때문에 다시 정렬
        if (pl < right)
            partitioning(pl, right); // pl이 right보다 작으면 그룹의 수가 1개 이상이기 때문에 다시 정렬



    }

    static void swap(int pl, int pr) {
        int temp = arr[pl];
        arr[pl] = arr[pr];
        arr[pr] = temp;
    }
}


