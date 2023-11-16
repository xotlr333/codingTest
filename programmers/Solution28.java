package programmers;

/**
 * 프로그래머스
 * 피로도
 * https://school.programmers.co.kr/learn/courses/30/lessons/87946
 */

class Solution28 {
	int max = 0;

	public int solution(int k, int[][] dungeons) {
		int answer = -1;
		boolean[] visited = new boolean[dungeons.length];

		dfs(k, visited, dungeons, 0);

		return max;
	}

	public void dfs(int k, boolean[] visited, int[][] dungeons, int cnt){

		for(int i = 0; i < dungeons.length; i++) {
			if(!visited[i] && k >= dungeons[i][0]){
				visited[i] = true;
				dfs(k - dungeons[i][1], visited, dungeons, cnt + 1);
				visited[i] = false;
			}
		}

		if(max < cnt) {
			max = cnt;
		}
	}
}
