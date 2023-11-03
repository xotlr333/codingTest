package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 가장 큰 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42746
 */

class Solution18 {
	public String solution(int[] numbers) {
		String answer = "";
		String[] nums = new String[numbers.length];

		for(int i = 0;i < numbers.length; i++) {
			nums[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(nums, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

		for(String num : nums){
			answer += num;
		}

		if (answer.charAt(0) == '0') return "0";
		return answer;
	}
}
