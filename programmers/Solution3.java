package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 폰켓몬
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */

class Solution3 {
	public int solution(int[] nums) {
		int answer = 0;
		int numsLength = nums.length;
		HashSet<Integer> set = new HashSet<>();

		for(int i = 0; i < numsLength; i++) {
			int num = nums[i];
			if(!set.contains(num)) {
				set.add(num);
			}
		}

		if(set.size() > numsLength/2){
			answer = numsLength/2;
		} else {
			answer = set.size();
		}

		return answer;
	}
}
