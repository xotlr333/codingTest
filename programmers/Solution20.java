package programmers;

/**
 * 프로그래머스
 * 타겟 넘버
 * https://school.programmers.co.kr/learn/courses/30/lessons/43165
 */

class Solution20 {

	int cnt = 0;

	public int solution(int[] numbers, int target) {

		int length = numbers.length;
		int index = 0;

		dfs(length, index, 0, target, numbers);

		return cnt;
	}

	public void dfs(int length, int index, int sum, int target, int[] numbers){
		if(index == length){
			if(sum == target){
				cnt++;
			}
			return;
		}

		dfs(length, index + 1, sum + numbers[index], target, numbers);
		dfs(length, index + 1, sum - numbers[index], target, numbers);

	}
}
