package programmers;

/**
 * 프로그래머스
 * 네트워크
 * https://school.programmers.co.kr/learn/courses/30/lessons/43162?language=java
 */

class Solution21 {

	int cnt = 0;
	boolean[] visited;

	public int solution(int n, int[][] computers) {
		int answer = 0;
		visited = new boolean[computers.length];

		for(int i = 0; i < computers.length; i++) {
			if(!visited[i]){
				dfs(i, computers);
				cnt++;
			}

		}


		return cnt;
	}

	public void dfs(int i, int[][] computers){

		visited[i] = true;

		for(int j = 0; j < computers[i].length; j++){

			if(!visited[j] && computers[i][j] == 1){
				dfs(j, computers);
			}

		}
	}
}
