package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 이중우선순위큐
 * https://school.programmers.co.kr/learn/courses/30/lessons/42628
 */

class Solution16 {
	public int[] solution(String[] operations) {
		int[] answer = new int[2];
		PriorityQueue<Integer> minQ = new PriorityQueue<>();
		PriorityQueue<Integer> maxQ = new PriorityQueue<>((o1, o2) -> o2 - o1);

		for(String oper : operations) {
			if(oper.startsWith("I")){
				int num = Integer.parseInt(oper.substring(2, oper.length()));
				minQ.add(num);
				maxQ.add(num);
			} else {
				if(oper.endsWith("-1")){
					if(!minQ.isEmpty()){
						int del = minQ.poll();
						maxQ.remove(del);
					}
				} else {
					if(!maxQ.isEmpty()){
						int del = maxQ.poll();
						minQ.remove(del);
					}
				}
			}
		}

		if(minQ.isEmpty()){
			answer[0] = 0;
			answer[1] = 0;
		} else {
			answer[0] = maxQ.poll();
			answer[1] = minQ.poll();
		}



		return answer;
	}
}
