package programmers;

/**
 * 프로그래머스
 * 카펫
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 */

class Solution27 {
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int area = brown + yellow;

		for(int i = 1; i < area; i++) {
			if(area%i != 0){
				continue;
			}

			int w = area/i;
			int h = i;
			if(w < h){
				break;
			}

			if((2*w) + (2*h) - 4 == brown && (w*h) - brown == yellow){
				answer[0] = w;
				answer[1] = h;
				break;
			}

		}
		return answer;
	}
}
