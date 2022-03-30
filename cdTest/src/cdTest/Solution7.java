package cdTest;

//프로그래머스 - 연습문제 - 문자열을 정수로 바꾸기
//https://programmers.co.kr/learn/courses/30/lessons/12925

public class Solution7 {
	public int solution(String s) {
		
		int answer = 0;
		if(s.charAt(1)=='-') {
			int ans = Integer.parseInt(s);
			answer = -ans;
		}else {
			answer = Integer.parseInt(s);
		}
        return answer;
    }
	
	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		String s = "1234";
		int ans = sol.solution(s);
		System.out.println("ans : "+ans);
	}
}
