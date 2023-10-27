package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 같은 숫자는 싫어
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */

public class Solution8 {
	public int[] solution(int []arr) {

		Stack<Integer> stack = new Stack<>();

		for(int num : arr){
			if(stack.empty()){
				stack.push(num);
				continue;
			}

			if(stack.peek() == num){
				continue;
			}

			stack.push(num);
		}


		int[] answer = new int[stack.size()];
		for(int i = stack.size() - 1; i >= 0; i--) {
			answer[i] = stack.pop();
		}

		return answer;
	}
}
