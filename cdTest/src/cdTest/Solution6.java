package cdTest;

//프로그래머스 - 연습문제 - 두 정수 사이의 합
//https://programmers.co.kr/learn/courses/30/lessons/12912

public class Solution6 {
	public long solution(int a, int b) {
		
		long answer = 0;
		
		if(a <= b) {
			for(int i=a; i<=b; i++) {
				answer += i;
			}			
		}else {
			for(int i=a; i>=b;i--) {
				answer += i;
			}
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int a = 5;
		int b = 3;
		long ans = sol.solution(a, b);
		System.out.println("ans : "+ans);
	}
}
