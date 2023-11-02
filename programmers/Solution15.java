package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 디스크 컨트롤러
 * https://school.programmers.co.kr/learn/courses/30/lessons/42627
 */

class Solution15 {
	public int solution(int[][] jobs) {

		Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
		PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
		int answer = 0;
		int index = 0;
		int endTime = 0;
		int count = 0;

		while(count < jobs.length){

			while (index < jobs.length && jobs[index][0] <= endTime){
				queue.add(jobs[index++]);
			}

			if(queue.isEmpty()){
				endTime = jobs[index][0];
			} else {
				int[] job = queue.poll();
				answer += endTime - job[0] + job[1];
				endTime += job[1];
				count++;
			}
		}


		return answer/jobs.length;
	}
}
