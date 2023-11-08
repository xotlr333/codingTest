package programmers;

/**
 * 프로그래머스
 * 단어 변환
 * https://school.programmers.co.kr/learn/courses/30/lessons/43163#
 */

class Solution23 {

	int answer = 0;

	public int solution(String begin, String target, String[] words) {

		boolean[] visited = new boolean[words.length];
		dfs(begin, 0, target, words, visited);

		return answer;
	}

	public void dfs(String begin, int cnt, String target, String[] words, boolean[] visited) {
		if(begin.equals(target)){
			answer = cnt;
			return;
		}

		for(int i = 0; i < words.length; i++) {

			if(visited[i]){
				continue;
			}
			int sum = 0;
			for(int j = 0; j < begin.length(); j++) {
				if(begin.charAt(j) != words[i].charAt(j)) {
					sum++;
				}

				if(sum > 1) {
					break;
				}
			}

			if(sum == 1) {
				visited[i] = true;
				dfs(words[i], cnt + 1, target, words, visited);
				visited[i] = false;
			}

		}
	}
}
