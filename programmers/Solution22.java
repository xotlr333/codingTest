package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 게임 맵 최단거리
 * https://school.programmers.co.kr/learn/courses/30/lessons/1844
 */

class Solution22 {

	int[] dx = {-1, +1, 0, 0};
	int[] dy = {0, 0, +1, -1};

	public int solution(int[][] maps) {
		int answer = 0;
		int[][] visited = new int[maps.length][maps[0].length];
		Queue<int[]> queue = new LinkedList<>();

		queue.add(new int[]{0,0});
		visited[0][0] = 1;

		while(!queue.isEmpty()){
			int[] map = queue.poll();
			int x = map[0];
			int y = map[1];

			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if(nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length) {
					if(visited[nx][ny] == 0 && maps[nx][ny] == 1) {
						visited[nx][ny] = visited[x][y] + 1;
						queue.add(new int[]{nx, ny});
					}
				}
			}

		}

		answer = visited[maps.length -1][maps[0].length -1];

		return answer == 0 ? -1 : answer;
	}


}
