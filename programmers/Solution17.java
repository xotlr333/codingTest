package programmers;

import java.util.*;

/**
 * 프로그래머스
 * K번째수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 */

class Solution17 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0 ; i < commands.length ; i++){
			int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(arr);
			answer[i] = arr[commands[i][2]-1];
		}

		return answer;
	}
}