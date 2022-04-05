package cdTest;

import java.util.Arrays;

//프로그래머스 - 월간코드 챌린지 시즌1 - 내적
//https://programmers.co.kr/learn/courses/30/lessons/70128

public class Solution12 {
	  public int solution(int[] a, int[] b) {
	        int answer = 0;
	        System.out.println("int[] a: "+Arrays.toString(a));
	        System.out.println("int[] b: "+Arrays.toString(b));
	        for(int i=0; i<a.length; i++) {
	        		answer += a[i]*b[i];
	        		System.out.println("answer: "+answer);	        	
	        }
	        return answer;
	    }
	  public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] a= {-1,0,1};
		int[] b= {1,0,-1};
		
		int ans = sol.solution(a, b);
		System.out.println("ans :"+ans);
	}
}
