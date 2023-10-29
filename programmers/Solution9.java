package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 올바른 괄호
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909?language=java
 */

class Solution {
	boolean solution(String s) {
		Stack<Character> stack = new Stack<>();

		for(int i = 0; i < s.length(); i++) {

			if(s.charAt(i) == '('){
				stack.push(s.charAt(i));
				continue;
			}

			if(s.charAt(i) == ')'){
				if(stack.empty()){
					return false;
				}
				stack.pop();
			}
		}

		return stack.empty();
	}
}
