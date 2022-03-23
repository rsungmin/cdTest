package cdTest;
//프로그래머스 - 정렬 - K번째 수
//https://programmers.co.kr/learn/courses/30/lessons/42748

import java.util.Arrays;

public class Solution1 {
	
		 public int[] solution(int[] array, int[][] commands) {
		        int[] answer = {};
		        
		        answer = new int [commands.length];
		        for(int i=0; i<commands.length; i++) {
		        	int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
		        	Arrays.sort(arr);
		        	answer[i] = arr[commands[i][2]-1];
		        }
		 	        return answer;
		 	        
		 
	}
		 /* copyOfRange(original, from, to) : 전달받은 배열의 지정된 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환
		  * original : 복사할 원본 배열
		  * from : 원본 배열에서 복사할 범위의 시작 인덱스
		  * to : 원본 배열에서 복사할 범위의 끝 인덱스 
		  * */
		 
}
