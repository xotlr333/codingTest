package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 기능 개발
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586
 */

class Solution10 {
	public int[] solution(int[] progresses, int[] speeds) {

		Queue<Progress> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < progresses.length; i++) {
			queue.offer(new Progress(progresses[i], speeds[i]));
		}

		while(!queue.isEmpty()){

			int size = queue.size();

			for(int i = 0; i < size; i++){
				Progress pro = queue.poll();
				int per = pro.per;
				int speed = pro.speed;

				per += speed;
				pro.per = per;
				queue.offer(pro);
			}

			int cnt = 0;
			for(int i = 0; i < size; i++){
				Progress pro = queue.peek();
				int per = pro.per;

				if(per < 100){
					break;
				}

				cnt++;
				queue.poll();
			}

			if(cnt > 0){
				list.add(cnt);
			}

		}

		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++){
			answer[i] = list.get(i);
		}

		return answer;
	}
}

class Progress {
	int per;
	int speed;

	public Progress(int p, int s){
		this.per = p;
		this.speed = s;
	}

}
