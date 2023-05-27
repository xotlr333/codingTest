import java.util.*;
import java.io.*;

/**
 * 백준
 * 우물 안 개구리
 * https://softeer.ai/practice/info.do?idx=1&eid=394
 */


public class Solution36 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        Data2[] D = new Data2[N];
        for(int i =0; i < N; i++){
            int w = Integer.parseInt(sc.next());
            D[i] = new Data2(i, w);
        }

        for(int i = 0; i < M; i++){
            int temp1 = Integer.parseInt(sc.next()) - 1;
            int temp2 = Integer.parseInt(sc.next()) - 1;

            if(D[temp1].getWeight() > D[temp2].getWeight()){
                D[temp2].setBest();
            } else if(D[temp1].getWeight() < D[temp2].getWeight()){
                D[temp1].setBest();
            } else if(D[temp1].getWeight() == D[temp2].getWeight()){
                D[temp1].setBest();
                D[temp2].setBest();
            }
        }

        int answer = 0;
        for(int i = 0; i < N; i++){
            if(D[i].getBest()) answer++;
        }

        System.out.println(answer);


    }


}

class Data2 {
    boolean best = true;
    int no;
    int weight;

    Data2(int n, int w){
        this.no = n;
        this.weight = w;
    }

    public void setBest(){
        this.best = false;
    }

    public int getNo() {
        return this.no;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean getBest() {
        return this.best;
    }

}