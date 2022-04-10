package cdTest;

//프로그래머스 - 월간코드 챌린지 시즌1 - 3진법 뒤집기
//https://programmers.co.kr/learn/courses/30/lessons/68935

public class Solution16 {
	 public int solution(int n) {
	        int answer = 0;
	        int cnt=0;
	        //1. 약수의 개수 구하기
	        for(int i=0; i<=n; i++) {
	        	if(n%i==0) {
	        		cnt++;
	        	}
	        }
	        
	        //2. 3진법으로 바꾸면서 뒤집어 저장
	        int[] temp = new int[cnt];
	        for(int i=0; i<cnt; i++) {
	        	
	        }
	        return answer;
	    }
}
