package programmers;

import java.util.*;

/**
 * 프로그래머스
 * 베스트앨범
 * https://school.programmers.co.kr/learn/courses/30/lessons/42579
 */

class Solution7 {
	public int[] solution(String[] genres, int[] plays) {

		Map<String, Integer> map = new HashMap<>();

		for(int i = 0; i < genres.length; i++){
			String genre = genres[i];
			int play = plays[i];
			map.put(genre, map.getOrDefault(genre, 0) + play);
		}

		ArrayList<String> genresOrder = new ArrayList<>();
		while(map.size() != 0){
			int max = 0;
			String maxGenre = "";
			for(String key : map.keySet()){
				int count = map.get(key);
				if(count > max) {
					max = count;
					maxGenre = key;
				}
			}
			genresOrder.add(maxGenre);
			map.remove(maxGenre);
		}

		ArrayList<Play> result = new ArrayList<>();
		for(int i = 0; i < genresOrder.size(); i++) {
			String genre = genresOrder.get(i);
			ArrayList<Play> list = new ArrayList<>();

			for(int j = 0; j < genres.length; j++) {
				if(genres[j].equals(genre)){
					list.add(new Play(j, plays[j]));
				}
			}

			Collections.sort(list, (o1, o2) -> {
				return o2.count - o1.count;
			});
			result.add(list.get(0));
			if(list.size() > 1){
				result.add(list.get(1));
			}

		}

		int[] answer = new int[result.size()];
		for(int i = 0; i < answer.length; i++){
			answer[i] = result.get(i).num;
		}


		return answer;
	}
}

class Play {
	int num;
	int count;

	public Play(int n, int c){
		this.num = n;
		this.count = c;
	}
}

