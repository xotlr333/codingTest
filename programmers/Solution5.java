package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 전화번호 목록
 * https://school.programmers.co.kr/learn/courses/30/lessons/42577
 */

class Solution5 {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		Map<String, Integer> map = new HashMap<>();

		for(int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], i);
		}

		loop1:
		for(int i = 0; i < phone_book.length; i++) {
			for(int j = 0; j < phone_book[i].length(); j++){
				if(map.containsKey(phone_book[i].substring(0, j))){
					answer = false;
					break loop1;
				}
			}
		}

		return answer;
	}
}
