package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 체육복
 * https://school.programmers.co.kr/learn/courses/30/lessons/42862
 */

class Solution29 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < n; i++) {
			map.put(i+1,1);
		}
		for (int j : lost) {
			if (map.containsKey(j)) {
				map.put(j, 0);
			}
		}
		for (int j : reserve) {
			if (map.containsKey(j)) {
				if(map.get(j) == 0){
					map.put(j, 1);
				}else {
					map.put(j, 2);
				}
			}
		}
		for(int i = 0; i < n ; i++){
			if(map.get(i+1) == 0){
				if(map.containsKey(i) && map.get(i) == 2){
					map.put(i+1, 1);
					map.put(i, 1);
				}else if(map.containsKey(i+2) && map.get(i+2) == 2){
					map.put(i+1, 1);
					map.put(i+2, 1);
				}
			}
		}

		for (int i = 0 ; i < n ; i++){
			if(map.get(i+1) >= 1){
				answer++;
			}
		}
		return answer;
	}
}
