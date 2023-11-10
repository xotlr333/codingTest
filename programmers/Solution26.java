package programmers;

import java.util.*;
import java.math.*;

/**
 * 프로그래머스
 * 소수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/42839
 */

class Solution26 {
	HashSet<Integer> set = new HashSet<>();
	String[] arr;
	int answer = 0;

	public int solution(String numbers) {

		boolean[] visited = new boolean[numbers.length()];
		arr = numbers.split("");

		dfs(-1,"",visited);

		return answer;
	}

	public void dfs(int index, String str, boolean[] visited) {

		if(!str.equals("")){
			int num = Integer.parseInt(str);
			BigInteger bigInt = BigInteger.valueOf(num);
			if(!set.contains(num) && bigInt.isProbablePrime(10)){
				answer++;
				set.add(num);
			}
		}

		for(int i = 0; i < arr.length; i++) {
			if(i != index && !visited[i]){
				String temp = str + arr[i];
				visited[i] = true;
				dfs(i, temp, visited);
				visited[i] = false;
			}
		}
	}
}
