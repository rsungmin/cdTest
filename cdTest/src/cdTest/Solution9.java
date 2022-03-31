package cdTest;

//프로그래머스 - 연습문제 - 약수의 합
public class Solution9 {
	 public int solution(int n) {
	        int answer = 0;
	        for(int i=1; i<=n; i++) {
	        	if(n%i==0) {
	        		answer += i;
	        	}
	        }
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Solution9 sol = new Solution9();
		int n=12;
		int ans = sol.solution(n);
		System.out.println("ans : "+ans);
	}
}
