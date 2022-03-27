package cdTest;

//프로그래머스 - 월간코드 챌린지 시즌2 - 음양더하기
//https://programmers.co.kr/learn/courses/30/lessons/76501

public class Solution3 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<signs.length; i++) {
        	System.out.println("signs["+i+"]: "+signs[i]);
        }
        
        for(int i=0;i<absolutes.length; i++) {
        	if(signs[i] == true) {
        		absolutes[i] = absolutes[i];
        		System.out.println("true absolutes[i]: "+absolutes[i]);
        	}else {
        		absolutes[i] = (absolutes[i])*(-1);
        		System.out.println("false absolutes[i]: "+absolutes[i]);
        	}        
        }
        
        for(int i=0; i<absolutes.length; i++) {
        	 answer += absolutes[i];
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] ab = {4,7,12};
		boolean[] si = {true, false, true};
		 for(int i=0; i<si.length; i++) {
	        	System.out.println("si["+i+"]: "+si[i]);
	        }
		Solution3 sol = new Solution3();
		int res = sol.solution(ab, si);
		System.out.println("res: "+res);
	}
}
