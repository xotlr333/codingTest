import java.util.*;
import java.io.*;

/**
 * 우물 안에 개구리
 * https://www.notion.so/3-092e3c5102df4bf9a51f2ded1bd7cff7?pvs=4#c0676ff90c1d410fbea8d1188ee73c82
 */

public class Solution3
{
    public void solution3()
    {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        Data[] D = new Data[N];
        for(int i =0; i < N; i++){
            int w = Integer.parseInt(sc.next());
            D[i] = new Data(i, w);
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

class Data {
    boolean best = true;
    int no;
    int weight;

    Data(int n, int w){
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