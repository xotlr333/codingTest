package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 주식가격
 * https://school.programmers.co.kr/learn/courses/30/lessons/42584
 */

class Solution13 {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		int index = 0;
		for(int price : prices) {
			int time = 0;

			for(int i = index + 1; i < prices.length; i++) {
				int nextPrice = prices[i];

				time++;

				if(nextPrice < price){
					break;
				}

			}

			answer[index++] = time;

		}

		return answer;
	}
}
