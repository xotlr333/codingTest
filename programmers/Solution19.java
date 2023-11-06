package programmers;

import java.util.*;

/**
 * 프로그래머스
 * H-Index
 * https://school.programmers.co.kr/learn/courses/30/lessons/42747#fn1
 */

class Solution19 {
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);
		for(int i = 0 ; i < citations.length ; i++){
			int cnt = 0;
			for (int j = 0 ; j < citations.length ; j++){
				if( i+1 <= citations[j]){
					cnt++;
				}
			}

			if (i+1 >= answer && cnt >= i+1){
				answer = i+1;
			}
		}
		return answer;
	}
}
