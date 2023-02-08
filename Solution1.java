import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 무인도 여행
 * https://school.programmers.co.kr/learn/courses/30/lessons/154540
 */

class Solution1 {
    ArrayList<Integer> answerArr = new ArrayList<Integer>();
    int cnt = 0;
    String[][] mapArr;

    public int[] solution1(String[] maps) {
        mapArr = new String[maps.length][maps[0].length()];

        for(int i = 0; i < maps.length; i++ ){
            // System.out.println(maps[i]);
            String tmp = maps[i];
            for(int j = 0; j < tmp.length(); j++){
                mapArr[i][j] = tmp.substring(j, j+1);
            }
        }

        for(int i = 0; i < mapArr.length; i++ ){
            for(int j = 0; j < mapArr[i].length; j++){
                int tmp = check(i,j);
                if(tmp > 0) answerArr.add(tmp);
            }
        }
        if(answerArr.size() > 0){
            int[] answer = new int[answerArr.size()];
            int i = 0;
            Iterator<Integer> iterator = answerArr.iterator();
            while(iterator.hasNext()){
                answer[i] = iterator.next();
                i++;
            }
            Arrays.sort(answer);

            return answer;
        } else {

            return new int[]{-1};
        }

    }

    public int check(int x, int y) {
        if(x < 0 || y < 0 || x > mapArr.length - 1 || y > mapArr[0].length - 1 || "X".equals(mapArr[x][y])) {
            return 0;
        }
        // System.out.println(mapArr[x][y]);
        int n = Integer.parseInt(mapArr[x][y]);
        mapArr[x][y] = "X";
        int sum = n;
        sum += check(x+1, y);
        sum += check(x-1, y);
        sum += check(x, y+1);
        sum += check(x, y-1);

        return sum;

    }
}

