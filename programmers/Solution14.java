package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 더 맵게
 * https://school.programmers.co.kr/learn/courses/30/lessons/42626
 */

class Solution14 {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for(int s : scoville){
			queue.add(s);
		}

		while(true) {

			if(queue.peek() >= K){
				break;
			}

			if(queue.size() < 2){
				answer = -1;
				break;
			}

			int num1 = queue.poll();
			int num2 = queue.poll();
			int result = num1 + (num2 * 2);

			queue.add(result);

			answer++;

		}

		return answer;
	}
}
