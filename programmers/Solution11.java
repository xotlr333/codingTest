package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 프로세스
 * https://school.programmers.co.kr/learn/courses/30/lessons/42587
 */

class Solution11 {
	public int solution(int[] priorities, int location) {
		int answer = 0;
		Integer[] ranks = new Integer[priorities.length];
		Queue<Process> queue = new LinkedList<>();

		for(int i = 0; i < priorities.length; i++) {
			queue.offer(new Process(i ,priorities[i]));
			ranks[i] = priorities[i];
		}

		Arrays.sort(ranks, Collections.reverseOrder());

		int cnt = 0;
		while(true) {

			Process process = queue.poll();
			int rank = ranks[cnt];

			if(process.rank != rank) {
				queue.offer(process);
				continue;
			}

			answer++;
			if(process.index == location) {
				break;
			}
			cnt++;
		}

		return answer;
	}
}

class Process {
	int index;
	int rank;

	public Process(int i, int r) {
		this.index = i;
		this.rank = r;
	}
}
