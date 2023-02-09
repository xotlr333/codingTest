import java.util.*;

/**
 * 마법의 엘리베이터
 * https://school.programmers.co.kr/learn/courses/30/lessons/148653#
 */

class Solution2 {
    public int solution2(int storey) {
        int answer = 0;
        String in = Integer.toString(storey);
        int length = in.length();
        // int x = (int)Math.pow(10,n-1);
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = Integer.parseInt(in.substring(i,i+1));
            // System.out.println(arr[i]);
        }

        for(int i = 0; i < arr.length; i++){

            if(i+1 >= arr.length){
                if(arr[i] > 5){
                    answer += 10 - arr[i] + 1;
                }else{
                    answer += arr[i];
                }

                break;
            }

            if(arr[i+1] > 5){
                if(i == 0 && arr[i] > 5){
                    answer += 10 - arr[i] + 2;
                } else{
                    answer += arr[i] + 1;
                }
                answer += 10 - arr[i+1];
                arr[i+1] = 0;
            } else {
                if(i == 0 && arr[i] > 5){
                    answer += 10 - arr[i] + 1;
                } else{
                    answer += arr[i];
                }
            }
        }

        return answer;
    }


}