package programmers;

/**
 * 프로그래머스
 * 최소직사각형
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=java
 */

class Solution24 {
	public int solution(int[][] sizes) {
		int maxW = 0;
		int maxH = 0;

		for(int i = 0; i < sizes.length; i++) {

			int w = sizes[i][0];
			int h = sizes[i][1];

			if(w < h) {
				int temp = w;
				w = h;
				h = temp;
			}

			if(maxW < w) {
				maxW = w;
			}

			if(maxH < h) {
				maxH = h;
			}
		}

		return maxW * maxH;
	}
}
