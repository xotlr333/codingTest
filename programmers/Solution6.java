package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 의상
 * https://school.programmers.co.kr/learn/courses/30/lessons/42578
 */

class Solution6 {
	public int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> map = new HashMap<>();

		for(String[] clothe : clothes) {

			if(map.containsKey(clothe[1])) {
				int count = map.get(clothe[1]);
				map.put(clothe[1], count + 1);
			} else {
				map.put(clothe[1], 2);
			}

		}

		for(String key : map.keySet()){
			answer *= map.get(key);
		}

		return answer - 1;
	}
}
