package cdTest;

//프로그래머스 - 월간 코드 챌린지 시즌2 - 약수의 개수와 덧셈
//https://programmers.co.kr/learn/courses/30/lessons/77884

public class Solution14 {
	public int solution(int left, int right) {
		int cnt=0;
        int answer = 0;
        int j=0;
        for(int i=left; i<=right; i++) {
        	for(j=1; j<=i; j++) {
        		if(i%j==0) {
        			cnt++;
        			System.out.println("cnt : "+cnt);
        		}
        		
        	}
        	

        	if(cnt%2==0) {
        		answer+=i;
        		System.out.println("answer 짝: "+answer);
        	}else {
        		answer-=i;
        		System.out.println("answer 홀: "+answer);
        	}
        	cnt=0;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		int left =24;
		int right=27;
		System.out.println(sol.solution(left, right));
	}
}
