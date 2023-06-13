package softeer;

import java.util.*;
import java.io.*;

/**
 * 소프티어
 * 장애물 인식 프로그램
 * https://softeer.ai/practice/info.do?idx=1&eid=409
 */



public class Solution32
{
    static int N;
    static int[][] arr;
    // static int cnt = 0;
    static ArrayList<Integer> cntList = new ArrayList<>();

    public static int dfs(int x, int y){

        //범위 안에 있는지 확인
        if(!(x < 0 || y < 0 || x >= N || y >= N)){

            //장애물인지 확인
            if(arr[x][y] == 1) {

                //장애물을 0으로 변경하여 확인된것으로 변경
                arr[x][y] = 0;
                int cnt = 1;

                cnt += dfs(x+1,y);
                cnt += dfs(x-1,y);
                cnt += dfs(x,y+1);
                cnt += dfs(x,y-1);

                return cnt;
            }
        }
        return 0;

    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        N = Integer.parseInt(sc.nextLine());

        arr = new int[N][N];
        for(int i = 0; i < N; i++){
            String temp = sc.nextLine();
            for(int j = 0; j < N; j++){
                arr[i][j] = Character.getNumericValue(temp.charAt(j));
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                int result = dfs(i,j);
                if(result > 0){
                    cntList.add(result);
                    // System.out.println(result);
                }
            }
        }

        Collections.sort(cntList);
        System.out.println(cntList.size());
        Iterator iter = cntList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }


}