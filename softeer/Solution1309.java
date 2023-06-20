package softeer;

import java.util.*;
import java.io.*;
/**
 * 소프티어
 * 성적 평가
 * https://softeer.ai/practice/info.do?idx=1&eid=1309
 */

public class Solution1309
{
    static int N;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        N= sc.nextInt();
        People[] contest1 = new People[N];
        People[] contest2 = new People[N];
        People[] contest3 = new People[N];
        People[] total = new People[N];


        for(int i = 0; i <N; i++){
            int s = Integer.parseInt(sc.next());
            contest1[i] = new People(i, s);
        }
        for(int i = 0; i <N; i++){
            int s = Integer.parseInt(sc.next());
            contest2[i] = new People(i, s);
        }
        for(int i = 0; i <N; i++){
            int s = Integer.parseInt(sc.next());
            contest3[i] = new People(i, s);
        }
        for(int i = 0; i <N; i++){
            int s = 0;
            s += contest1[i].getScore();
            s += contest2[i].getScore();
            s += contest3[i].getScore();

            total[i] = new People(i, s);

        }

        Arrays.sort(contest1);
        Arrays.sort(contest2);
        Arrays.sort(contest3);
        Arrays.sort(total);

        for(int i = 0; i <N; i++){
            if((i-1) >= 0 && contest1[i].getScore() == contest1[i - 1].getScore()){
                contest1[i].setRank(contest1[i - 1].getRank());
            } else {
                contest1[i].setRank(i + 1);
            }
            if((i-1) >= 0 && contest2[i].getScore() == contest2[i - 1].getScore()){
                contest2[i].setRank(contest2[i - 1].getRank());
            } else {
                contest2[i].setRank(i + 1);
            }
            if((i-1) >= 0 && contest3[i].getScore() == contest3[i - 1].getScore()){
                contest3[i].setRank(contest3[i - 1].getRank());
            } else {
                contest3[i].setRank(i + 1);
            }
            if((i-1) >= 0 && total[i].getScore() == total[i - 1].getScore()){
                total[i].setRank(total[i - 1].getRank());
            } else {
                total[i].setRank(i + 1);
            }

        }

        Comparator<People> comp = new Comparator<People>() {
            @Override
            public int compare(People o1, People o2){
                return o1.getNo() - o2.getNo();
            }
        };

        Arrays.sort(contest1, comp);
        Arrays.sort(contest2, comp);
        Arrays.sort(contest3, comp);
        Arrays.sort(total, comp);

        print(contest1);
        print(contest2);
        print(contest3);
        print(total);

    }

    static public void print(People[] p){
        for(int i = 0; i <N; i++){
            if(i ==N-1){
                System.out.println(p[i].getRank());
            } else {
                System.out.print(p[i].getRank() + " ");
            }
        }
    }
}

class People implements Comparable<People>{
    int no;
    int score;
    int rank;

    People(int n, int s){
        this.no = n;
        this.score = s;
    }

    public void setRank(int r){
        this.rank = r;
    }

    public int getNo() {
        return this.no;
    }
    public int getScore() {
        return this.score;
    }
    public int getRank() {
        return this.rank;
    }

    @Override
    public int compareTo(People o){
        return o.getScore() - this.score;
    }

}
