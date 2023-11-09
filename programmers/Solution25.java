package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 모의고사
 * https://school.programmers.co.kr/learn/courses/30/lessons/42840
 */

class Solution25 {
	public int[] solution(int[] answers) {
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int max = 0;
		int[] user1Answer = {1,2,3,4,5};
		int[] user2Answer = {2,1,2,3,2,4,2,5};
		int[] user3Answer = {3,3,1,1,2,2,4,4,5,5};
		Queue<Integer> queue1 = new LinkedList<>();
		Queue<Integer> queue2 = new LinkedList<>();
		Queue<Integer> queue3 = new LinkedList<>();

		for(int answer : user1Answer) {
			queue1.add(answer);
		}
		for(int answer : user2Answer) {
			queue2.add(answer);
		}
		for(int answer : user3Answer) {
			queue3.add(answer);
		}

		for(int i = 0; i < answers.length; i++) {
			int answer = answers[i];

			int user1 = queue1.poll();
			int user2 = queue2.poll();
			int user3 = queue3.poll();

			if(user1 == answer) {
				cnt1++;
				if(max < cnt1){
					max = cnt1;
				}
			}
			if(user2 == answer) {
				cnt2++;
				if(max < cnt2){
					max = cnt2;
				}
			}
			if(user3 == answer) {
				cnt3++;
				if(max < cnt3){
					max = cnt3;
				}
			}

			queue1.add(user1);
			queue2.add(user2);
			queue3.add(user3);

		}

		ArrayList<Integer> list = new ArrayList<>();
		if(max == cnt1){
			list.add(1);
		}
		if(max == cnt2){
			list.add(2);
		}
		if(max == cnt3){
			list.add(3);
		}

		int[] result = list.stream().mapToInt(Integer::intValue).toArray();

		return result;
	}
}
